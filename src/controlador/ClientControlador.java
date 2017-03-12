package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Client;

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
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        if (insertar) {
            entityManager.persist(client);
        } else {
            entityManager.remove(client);
        }
        entityTransaction.commit();
        return false;
    }

    public List<Client> obtindreClientPerNom(String nom) {
        return null;
    }
}
