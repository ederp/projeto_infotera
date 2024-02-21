package infotera.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import infotera.dao.ContatoDAO;
import infotera.dao.DocumentoDAO;
import infotera.dao.EnderecoDAO;
import infotera.dao.PessoaDAO;
import infotera.model.*;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("cadastroBean")
@ViewScoped
public class CadastroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7935639221220917854L;

	private Pessoa novaPessoa;
    private Documento novoDocumento;
    private Contato novoContato;
    private Endereco novoEndereco;
    
    @Inject
    private PessoaDAO pessoaDAO;
    @Inject
    private DocumentoDAO documentoDAO;
    @Inject
    private ContatoDAO contatoDAO;
    @Inject
    private EnderecoDAO enderecoDAO;
    
    public CadastroBean() {
		super();
		// TODO Auto-generated constructor stub
		this.novaPessoa = new Pessoa();
		this.novoDocumento = new Documento();
		this.novoContato = new Contato();
		this.novoEndereco = new Endereco();
	}

	public Pessoa getNovaPessoa() {
		return novaPessoa;
	}

	public void setNovaPessoa(Pessoa novaPessoa) {
		this.novaPessoa = novaPessoa;
	}

	public void salvarCadastro(Pessoa pessoa) {
    	pessoaDAO.adicionarPessoa(pessoa);
    	
    	this.novoDocumento.setPessoa(pessoa);
    	this.novoContato.setPessoa(pessoa);
    	this.novoEndereco.setPessoa(pessoa);
    	
    	this.documentoDAO.adicionarDocumento(this.novoDocumento);
    	this.contatoDAO.adicionarContato(this.novoContato);
    	this.enderecoDAO.adicionarEndereco(this.novoEndereco);
    }
}
