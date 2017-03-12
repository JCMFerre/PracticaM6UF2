package controlador;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.Info;

public class EMController {

    public static EntityManager obtenerEntityManager(boolean externa) {
        return Persistence
                .createEntityManagerFactory(externa ? Info.CONEXIO_EXTERNA : Info.CONEXIO_INTERNA)
                .createEntityManager();
    }

}
