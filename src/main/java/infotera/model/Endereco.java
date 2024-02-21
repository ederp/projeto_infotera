package infotera.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String pais;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(Long id, String rua, String numero, String cidade, String estado, String pais, Pessoa pessoa) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
    
}
