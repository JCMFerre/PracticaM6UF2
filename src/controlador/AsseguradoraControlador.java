package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import model.Asseguradora;
import model.Info;

public class AsseguradoraControlador extends ControladorGenerico<Asseguradora> {

    public AsseguradoraControlador(EntityManager entityManager) {
        super(entityManager);
    }

    public Asseguradora obtenerAsseguradoraPorNombre(String nomAsseguradora) {
        Asseguradora asseguradora;
        try {
            asseguradora = getEntityManager()
                    .createNamedQuery(Info.NOMBRE_QUERY_ASSEGURADORA_PER_NOM, Asseguradora.class)
                    .setParameter(Info.PARAMETRO_QUERY_ASSEGURADORA_PER_NOM, nomAsseguradora)
                    .getResultList()
                    .get(0);
        } catch (IndexOutOfBoundsException ioobe) {
            asseguradora = null;
        }
        return asseguradora;
    }

    public List<Asseguradora> obtenerTodasLasAsseguradoras() {
        return getEntityManager().createQuery(Info.QUERY_ASSEGURADORA_TODOS).getResultList();
    }

}
