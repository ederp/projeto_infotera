package infotera.dao;

import infotera.model.Endereco;

public class EnderecoDAO {

	private final HibernateUtil hibernateUtil = new HibernateUtil();

	public void adicionarEndereco(Endereco endereco) {
		hibernateUtil.inTransaction(entityManager -> entityManager.persist(endereco));
	}
	
	public Endereco getEnderecoPorId(Long id) {
        return hibernateUtil.inTransactionWithResult(entityManager -> entityManager.find(Endereco.class, id));
    }
	
    public void atualizarEndereco(Endereco endereco) {
        hibernateUtil.inTransaction(entityManager -> entityManager.merge(endereco));
    }

    public void excluirEndereco(Endereco endereco) {
        hibernateUtil.inTransaction(entityManager -> entityManager.remove(entityManager.contains(endereco) ? endereco : entityManager.merge(endereco)));
    }
}
