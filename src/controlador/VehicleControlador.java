package controlador;

import javax.persistence.EntityManager;

public class VehicleControlador {

    private final EntityManager entityManager;

    public VehicleControlador(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
