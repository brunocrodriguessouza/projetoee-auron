package br.com.caelum.auron.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Par {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Participante amigo;
	@ManyToOne
	private Participante amigoOcuto;
	@ManyToOne
	private Sorteio sorteio;

	public Par(Participante amigo, Participante amigoOcuto, Sorteio sorteio) {
		super();
		this.amigo = amigo;
		this.amigoOcuto = amigoOcuto;
		this.sorteio = sorteio;
	}

	Par() {

	}

}
