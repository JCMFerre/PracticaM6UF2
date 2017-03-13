package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import model.Client;
import model.Info;
import model.Vehicle;

public class VehicleControlador extends ControladorGenerico<Vehicle> {

    public VehicleControlador(EntityManager entityManager) {
        super(entityManager);
    }

    public List<Client> obtenerTodosLosClientes() {
        return getEntityManager()
                .createNamedQuery(Info.QUERY_TODOS_LOS_CLIENTES, Client.class)
                .getResultList();
    }

    public Vehicle obtenerVehiculoPorMatricula(String matricula) {
        Vehicle vehicleTrobat;
        try {
            vehicleTrobat = getEntityManager()
                    .createNamedQuery(Info.NOMBRE_QUERY_VEHICLE_BUSCAR, Vehicle.class)
                    .setParameter(Info.PARAMETRO_QUERY_VEHICLE_MATRICULA, matricula)
                    .getResultList().get(0);
        } catch (IndexOutOfBoundsException ioobe) {
            vehicleTrobat = null;
        }
        return vehicleTrobat;
    }

    public Client obtenerClientePorId(long idClient) {
        return getEntityManager().find(Client.class, idClient);
    }
}
