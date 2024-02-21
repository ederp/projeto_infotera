package infotera.dao;

import infotera.model.Contato;
import jakarta.inject.Named;

@Named
public class ContatoDAO {

	private final HibernateUtil hibernateUtil = new HibernateUtil();

	public void adicionarContato(Contato contato) {
		hibernateUtil.inTransaction(entityManager -> entityManager.persist(contato));
	}
	
	public Contato getContatoPorId(Long id) {
        return hibernateUtil.inTransactionWithResult(entityManager -> entityManager.find(Contato.class, id));
    }
	
    public void atualizarContato(Contato contato) {
        hibernateUtil.inTransaction(entityManager -> entityManager.merge(contato));
    }

    public void excluirContato(Contato contato) {
        hibernateUtil.inTransaction(entityManager -> entityManager.remove(entityManager.contains(contato) ? contato : entityManager.merge(contato)));
    }
}
