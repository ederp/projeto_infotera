package infotera.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "nome")
    private String nome;
	@Column(name = "tipo")
    private String tipo;
	@Column(name = "email")
    private String email;
	@Column(name = "telefone")
    private String telefone;

    @OneToMany(mappedBy = "pessoa")
    private List<Documento> documentos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa")
    private List<Contato> contatos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos = new ArrayList<>();

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Long id, String nome, String tipo, String email, String telefone, List<Documento> documentos,
			List<Contato> contatos, List<Endereco> enderecos) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.email = email;
		this.telefone = telefone;
		this.documentos = documentos;
		this.contatos = contatos;
		this.enderecos = enderecos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
    
}
