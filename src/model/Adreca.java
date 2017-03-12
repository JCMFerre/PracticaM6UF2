package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class Adreca implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Column(name = Info.ADRECA_KEY_CARRER, length = 50)
    private String carrer;

    @Column(name = Info.ADRECA_KEY_NUMERO)
    private int numero;

    @Column(name = Info.ADRECA_KEY_POBLACIO, length = 50)
    private String poblacio;

    public Adreca(String carrer, int numero, String poblacio) {
        this.carrer = carrer;
        this.numero = numero;
        this.poblacio = poblacio;
    }

    public Adreca() {
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    @Override
    public String toString() {
        return "Adreca{" + "carrer=" + carrer + ", numero=" + numero + ", poblacio=" + poblacio + '}';
    }

}
