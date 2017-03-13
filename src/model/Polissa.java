package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = Info.TAULA_POLISSSA, indexes = {
    @Index(columnList = Info.CLIENT_KEY_ID, name = Info.INDEX_PRENEDOR_POLISSA)})
@Entity
public class Polissa implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = Info.POLISSA_KEY_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = Info.POLISSA_KEY_NUMERO_POLISSA, length = 10)
    private String numero;

    @ManyToOne
    @JoinColumn(name = Info.CLIENT_KEY_ID, nullable = false)
    private Client prenedor;

    @OneToOne
    @JoinColumn(name = Info.RELACION_VEHICLE_POLISSA, nullable = false)
    private Vehicle vehicle;

    @Column(name = Info.POLISSA_KEY_DATA_INICI, nullable = false)
    private Date dataInici;

    @Column(name = Info.POLISSA_KEY_DATA_FI, nullable = false)
    private Date dataFi;

    @Column(name = Info.POLISSA_KEY_TIPUS)
    private boolean tipus;

    @Column(name = Info.POLISSA_KEY_PRIMA)
    private double prima;

    @ManyToOne
    @JoinColumn(name = Info.ASSEGURADORA_KEY_ID)
    private Asseguradora asseguradora;

    public Polissa(Long id, String numero, Client prenedor, Vehicle vehicle, Date dataInici, Date dataFi, boolean tipus, double prima, Asseguradora asseguradora) {
        this.id = id;
        this.numero = numero;
        this.prenedor = prenedor;
        this.vehicle = vehicle;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.tipus = tipus;
        this.prima = prima;
        this.asseguradora = asseguradora;
    }

    public Polissa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Client getPrenedor() {
        return prenedor;
    }

    public void setPrenedor(Client prenedor) {
        this.prenedor = prenedor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFi() {
        return dataFi;
    }

    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public Asseguradora getAsseguradora() {
        return asseguradora;
    }

    public void setAsseguradora(Asseguradora asseguradora) {
        this.asseguradora = asseguradora;
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
        if (!(object instanceof Polissa)) {
            return false;
        }
        Polissa other = (Polissa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Polissa{" + "id=" + id + ", numero=" + numero + ", prenedor=" + prenedor + ", vehicle=" + vehicle + ", dataInici=" + dataInici + ", dataFi=" + dataFi + ", tipus=" + tipus + ", prima=" + prima + ", asseguradora=" + asseguradora + '}';
    }

}
