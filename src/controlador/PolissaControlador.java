package controlador;

import javax.persistence.EntityManager;
import model.Polissa;

public class PolissaControlador extends ControladorGeneral<Polissa> {

    public PolissaControlador(EntityManager entityManager) {
        super(entityManager);
    }

}
