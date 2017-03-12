package controlador;

import javax.persistence.EntityManager;
import model.Asseguradora;

public class AsseguradoraControlador extends ControladorGenerico<Asseguradora> {

    public AsseguradoraControlador(EntityManager entityManager) {
        super(entityManager);
    }

}
