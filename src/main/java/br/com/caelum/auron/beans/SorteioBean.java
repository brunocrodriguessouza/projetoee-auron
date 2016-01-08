package br.com.caelum.auron.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.auron.dao.ParticipanteDao;
import br.com.caelum.auron.dao.SorteioDao;
import br.com.caelum.auron.modelo.Sorteio;

@Named
@RequestScoped
public class SorteioBean {
	
	@Inject
	private SorteioDao sorteioDao;
	
	private Sorteio sorteio = new Sorteio();

	public Sorteio getSorteio() {
		return sorteio;
	}

	public void sortear(){
		System.out.println("Sorteio: " + sorteio.getNome());
	}

}
