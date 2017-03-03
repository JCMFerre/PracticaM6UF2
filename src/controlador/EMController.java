package controlador;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Info;

public class EMController {

    public static EntityManager obtenerEntityManager() {
        return Persistence.createEntityManagerFactory(Info.CONEXIO_INTERNA)
                .createEntityManager();
    }

}
