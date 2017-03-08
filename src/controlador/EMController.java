package controlador;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Info;

public class EMController {

    private static EntityManager instancia;

    public static EntityManager obtenerEntityManager() {
        if (instancia == null) {
            instancia = Persistence
                    .createEntityManagerFactory(Info.CONEXIO_INTERNA)
                    .createEntityManager();
        }
        return instancia;
    }

}
