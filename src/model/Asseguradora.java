package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@NamedQuery(name = Info.NOMBRE_QUERY_ASSEGURADORA_PER_NOM, query = Info.QUERY_ASSEGURADORA_PER_NOM)
@Table(name = Info.TAULA_ASSEGURADORA)
public class Asseguradora implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = Info.ASSEGURADORA_KEY_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = Info.ASSEGURADORA_KEY_NOM, length = 100, unique = true, nullable = false)
    private String nom;

    @Column(name = Info.ASSEGURADORA_KEY_CIF)
    private String cif;

    @OneToMany(mappedBy = Info.RELACION_ASSEGURADORA_POLISSA)
    private List<Polissa> llistaPolisses;

    public Asseguradora(Long id, String nom, String cif) {
        this.id = id;
        this.nom = nom;
        this.cif = cif;
    }

    public Asseguradora() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<Polissa> getLlistaPolisses() {
        return llistaPolisses;
    }

    public void setLlistaPolisses(List<Polissa> llistaPolisses) {
        this.llistaPolisses = llistaPolisses;
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
        if (!(object instanceof Asseguradora)) {
            return false;
        }
        Asseguradora other = (Asseguradora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asseguradora{" + "id=" + id + ", nom=" + nom + ", cif=" + cif + '}';
    }

}
