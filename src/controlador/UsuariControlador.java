package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import model.Usuari;

public class UsuariControlador {

    private EntityManager entityManager;

    public UsuariControlador() {
        entityManager = EMController.obtenerEntityManager(true);
    }

    public boolean insertarUsuari(Usuari usuari) {
        boolean insertadoCorrectamente = true;
        try {
            EntityTransaction transaccio = entityManager.getTransaction();
            transaccio.begin();
            entityManager.persist(usuari);
            transaccio.commit();
        } catch (PersistenceException e) {
            System.out.println("Entro en el catch");
            insertadoCorrectamente = false;
        }
        return insertadoCorrectamente;
    }

    /**
     * Devuelve -1 si no existe, 0 si existe con la pk pasada o 1 si esta todo
     * correcto.
     *
     * @param usuari
     * @return
     */
    public int validarSesio(Usuari usuari) {
        System.out.println("Comprobando");
        Usuari usuarioEncontrado = entityManager.find(Usuari.class, usuari.getNom());
        return usuarioEncontrado == null ? -1 : usuari.equals(usuarioEncontrado) ? 1 : 0;
    }

    public void cambiarEntityManager(boolean externa) {
        entityManager = EMController.obtenerEntityManager(externa);
    }

}
