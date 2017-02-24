package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = Info.TAULA_USUARI)
public class Usuari implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = Info.USUARI_KEY_NOM, length = 30, nullable = false)
    private String nom;

    @Column(name = Info.USUARI_KEY_CONTRASENA, length = 30, nullable = false)
    private String contrasenya;

    public Usuari(String nom, String contrasenya) {
        this.nom = nom;
        this.contrasenya = contrasenya;
    }

    public Usuari() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nom != null ? nom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuari)) {
            return false;
        }
        Usuari other = (Usuari) object;
        if ((this.nom == null && other.getNom() != null) || (this.nom != null && !this.nom.equals(other.getNom()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuari{nom=" + nom + ", contrasenya=" + contrasenya + '}';
    }
}
