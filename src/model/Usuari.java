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
        boolean iguals = false;
        if (object instanceof Usuari) {
            Usuari usuario = (Usuari) object;
            try {
                iguals = this.nom.equals(usuario.nom) && this.contrasenya.equals(usuario.contrasenya);
            } catch (NullPointerException e) {
                iguals = false;
            }
        }
        return iguals;
    }

    @Override
    public String toString() {
        return "Usuari{nom=" + nom + ", contrasenya=" + contrasenya + '}';
    }
}
