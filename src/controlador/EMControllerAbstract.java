package controlador;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Info;

public abstract class EMControllerAbstract<E> {

    protected EntityManager entityManager;

    public abstract void inserirObjecte(E e);

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = Persistence
                    .createEntityManagerFactory(Info.CONEXIO_EXTERNA)
                    .createEntityManager();
        }
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
