package controlador;

import javax.persistence.EntityManager;

public class AsseguradoraControlador {

    private final EntityManager entityManager;

    public AsseguradoraControlador(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
