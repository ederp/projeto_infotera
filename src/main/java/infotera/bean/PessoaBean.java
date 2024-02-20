package infotera.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;

import infotera.dao.PessoaDAO;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import infotera.model.Pessoa;

@Named
@ViewScoped
public class PessoaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2143826489301792779L;

	@Inject
    private PessoaDAO pessoaDAO;

    private List<Pessoa> pessoas;

	public PessoaDAO getPessoaDAO() {
		return pessoaDAO;
	}

	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
    
	@PostConstruct
    public void init() {
        carregarPessoas();  // Método para inicializar a lista de pessoas
    }

    public void carregarPessoas() {
        pessoas = pessoaDAO.listarPessoas();
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoaDAO.excluirPessoa(pessoa);
        carregarPessoas();  // Atualiza a lista após a remoção
    }
    
    public void editarPessoa(Pessoa pessoa) {
        pessoaDAO.atualizarPessoa(pessoa);
        carregarPessoas();  // Atualiza a lista após a atualização
    }
    
    public Pessoa pesquisaNome(String nome) {
    	return pessoaDAO.getPessoaPorNome(nome);
    }
    
}
