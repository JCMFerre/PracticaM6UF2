package controlador;

import javax.persistence.EntityManager;

public class PolissaControlador {

    private final EntityManager entityManager;

    public PolissaControlador(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
