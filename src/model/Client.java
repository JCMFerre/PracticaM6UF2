package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@NamedQueries({
    @NamedQuery(name = Info.NOMBRE_QUERY_CLIENT_BUSCAR, query = Info.QUERY_CLIENT_NOMBRE)
    ,@NamedQuery(name = Info.QUERY_TODOS_LOS_CLIENTES, query = Info.QUERY_CLIENT_TODOS)}
)
@Table(name = Info.TAULA_CLIENT)
public class Client implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = Info.CLIENT_KEY_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = Info.CLIENT_KEY_NIF, length = 9, unique = true, nullable = false)
    private String nif;

    @Column(name = Info.CLIENT_KEY_NOM)
    private String nom;

    @Embedded
    private Adreca adreca;

    @OneToMany(mappedBy = "propietari")
    private List<Vehicle> llistaVehicles;

    public Client(Long id, String nif, String nom, Adreca adreca) {
        this.id = id;
        this.nif = nif;
        this.nom = nom;
        this.adreca = adreca;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adreca getAdreca() {
        return adreca;
    }

    public void setAdreca(Adreca adreca) {
        this.adreca = adreca;
    }

    public List<Vehicle> getLlistaVehicles() {
        return llistaVehicles;
    }

    public void setLlistaVehicles(List<Vehicle> llistaVehicles) {
        this.llistaVehicles = llistaVehicles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nif=" + nif + ", nom=" + nom + ", adreca=" + adreca + '}';
    }

}
