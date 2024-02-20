package infotera.dao;

import infotera.model.Documento;

public class DocumentoDAO {

	private final HibernateUtil hibernateUtil = new HibernateUtil();

	public void adicionarDocumento(Documento documento) {
		hibernateUtil.inTransaction(entityManager -> entityManager.persist(documento));
	}
	
	public Documento getDocumentoPorId(Long id) {
        return hibernateUtil.inTransactionWithResult(entityManager -> entityManager.find(Documento.class, id));
    }
	
    public void atualizarDocumento(Documento documento) {
        hibernateUtil.inTransaction(entityManager -> entityManager.merge(documento));
    }

    public void excluirDocumento(Documento documento) {
        hibernateUtil.inTransaction(entityManager -> entityManager.remove(entityManager.contains(documento) ? documento : entityManager.merge(documento)));
    }
}
