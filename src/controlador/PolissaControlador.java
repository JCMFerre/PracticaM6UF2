package controlador;

import javax.persistence.EntityManager;
import model.Polissa;

public class PolissaControlador extends ControladorGenerico<Polissa> {

    public PolissaControlador(EntityManager entityManager) {
        super(entityManager);
    }

}
