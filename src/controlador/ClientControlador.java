package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Client;
import model.Info;

public class ClientControlador {

    private final EntityManager entityManager;

    public ClientControlador(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean insertarClient(Client client) {
        return executarTransaccio(0, client);
    }

    public boolean eliminarClient(Client client) {
        return executarTransaccio(1, client);
    }

    public boolean modificarClient(Client client) {
        return executarTransaccio(2, client);
    }

    /**
     * Realitza la transacció depenent la acció que s'ha indicat.
     *
     * @param accio 0 inserta, 1 elimina, 2 o altres modifica.
     * @param client Client a inserir, modificar o eliminar.
     * @return true si s'ha executat correctament o false en cas contrari.
     */
    private boolean executarTransaccio(int accio, Client client) {
        boolean correcto = true;
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        try {
            switch (accio) {
                case 0:
                    entityManager.persist(client);
                    break;
                case 1:
                    entityManager.remove(client);
                    break;
                default:
                    entityManager.merge(client);
                    break;
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
