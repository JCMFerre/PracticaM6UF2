package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ControladorGeneral<E> {

    private final EntityManager entityManager;

    public ControladorGeneral(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean insertar(E e) {
        return executarTransaccio(0, e);
    }

    public boolean eliminar(E e) {
        return executarTransaccio(1, e);
    }

    public boolean modificar(E e) {
        return executarTransaccio(2, e);
    }

    /**
     * Realitza la transacció depenent la acció que s'ha indicat.
     *
     * @param accio 0 inserta, 1 elimina, 2 o altres modifica.
     * @param e Objtecte a inserir, modificar o eliminar.
     * @return true si s'ha executat correctament o false en cas contrari.
     */
    private boolean executarTransaccio(int accio, E e) {
        boolean correcto = true;
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            switch (accio) {
                case 0:
                    entityManager.persist(e);
                    break;
                case 1:
                    entityManager.remove(e);
                    break;
                default:
                    entityManager.merge(e);
                    break;
            }
            entityTransaction.commit();
        } catch (Exception contraintViolada) {
            // Pongo Exception porque no controla la especifica que habia puesto de contrains.
            correcto = false;
        }
        return correcto;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
