package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import model.Info;
import model.Polissa;

public class PolissaControlador extends ControladorGenerico<Polissa> {

    public PolissaControlador(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Polissa> obtenerTodasLasPolizas() {
        return getEntityManager().createQuery(Info.QUERY_POLISSA_TODOS).getResultList();
    }

}
