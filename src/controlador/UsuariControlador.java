package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Usuari;

public class UsuariControlador {

    private final EntityManager entityManager;

    public UsuariControlador() {
        entityManager = EMController.obtenerEntityManager();
    }

    public void insertarUsuari(Usuari usuari) {
        EntityTransaction transaccio = entityManager.getTransaction();
        transaccio.begin();
        entityManager.persist(usuari);
        transaccio.commit();
    }

    public boolean validarSesio(Usuari usuari) {
        return entityManager.contains(usuari);
    }

}
