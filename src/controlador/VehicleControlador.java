package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import model.Client;
import model.Info;
import model.Vehicle;

public class VehicleControlador extends ControladorGeneral<Vehicle> {

    public VehicleControlador(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Client> obtenerTodosLosClientes() {
        return getEntityManager()
                .createNamedQuery(Info.QUERY_TODOS_LOS_CLIENTES, Client.class)
                .getResultList();
    }
}
