package infotera.dao;

import java.util.List;

import jakarta.inject.Named;
import jakarta.persistence.Query;
import infotera.model.Pessoa;


@Named
public class PessoaDAO {
	
	private final HibernateUtil hibernateUtil = new HibernateUtil();

	public void adicionarPessoa(Pessoa pessoa) {
		hibernateUtil.inTransaction(entityManager -> entityManager.persist(pessoa));
	}
	
	public Pessoa getPessoaPorId(Long id) {
        return hibernateUtil.inTransactionWithResult(entityManager -> entityManager.find(Pessoa.class, id));
    }
	
	public Pessoa getPessoaPorNome(String nome) {
        return hibernateUtil.inTransactionWithResult(entityManager -> entityManager.find(Pessoa.class, nome));
    }

    public void atualizarPessoa(Pessoa pessoa) {
        hibernateUtil.inTransaction(entityManager -> entityManager.merge(pessoa));
    }

    public void excluirPessoa(Pessoa pessoa) {
        hibernateUtil.inTransaction(entityManager -> entityManager.remove(entityManager.contains(pessoa) ? pessoa : entityManager.merge(pessoa)));
    }

	public List<Pessoa> listarPessoas() {
		// TODO Auto-generated method stub
		Query query = hibernateUtil.inTransactionWithResult(entityManager -> entityManager.createNamedQuery("SELECT p FROM pessoa p"));
		return query.getResultList();
	}
}
