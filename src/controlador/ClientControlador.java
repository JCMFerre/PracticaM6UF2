package controlador;

import javax.persistence.EntityManager;
import model.Client;
import model.Info;

public class ClientControlador extends ControladorGenerico<Client> {

    public ClientControlador(EntityManager entityManager) {
        super(entityManager);
    }

    public Client obtindreClientPerNom(String nom) {
        Client client;
        try {
            client = getEntityManager().createNamedQuery(Info.NOMBRE_QUERY_CLIENT_BUSCAR, Client.class)
                    .setParameter(Info.PARAMETRO_QUERY_CLIENT_NOMBRE, nom)
                    .getResultList().get(0);
        } catch (IndexOutOfBoundsException e) {
            client = null;
            System.out.println("Entro catch en la de obtener nombre, no hay elementos en la lista.");
        }
        return client;
    }
}
