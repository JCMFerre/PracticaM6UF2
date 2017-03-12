package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Client;
import model.Info;
import org.hibernate.exception.ConstraintViolationException;

public class ClientControlador {

    private final EntityManager entityManager;

    public ClientControlador(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean insertarClient(Client client) {
        return executarTransaccio(true, client);
    }

    public boolean eliminarClient(Client client) {
        return executarTransaccio(false, client);
    }

    private boolean executarTransaccio(boolean insertar, Client client) {
        boolean correcto = true;
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            if (insertar) {
                entityManager.persist(client);
            } else {
                entityManager.remove(client);
            }
            entityTransaction.commit();
        } catch (Exception contraintViolada) {
            // Pongo Exception porque no controla la especifica que habia puesto de contrains.
            correcto = false;
        }
        return correcto;
    }

    public Client obtindreClientPerNom(String nom) {
        Client client;
        try {
            client = entityManager.createNamedQuery(Info.NOMBRE_QUERY_CLIENT_BUSCAR, Client.class)
                    .setParameter(Info.PARAMETRO_QUERY_CLIENT_NOMBRE, nom)
                    .getResultList().get(0);
        } catch (IndexOutOfBoundsException e) {
            client = null;
            System.out.println("Entro catch en la de obtener nombre");
        }
        return client;
    }
}
