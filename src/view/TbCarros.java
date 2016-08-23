/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author a9211062
 */
@Entity
@Table(name = "tb_carros", catalog = "db_loja_carros", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbCarros.findAll", query = "SELECT t FROM TbCarros t"),
    @NamedQuery(name = "TbCarros.findByCarId", query = "SELECT t FROM TbCarros t WHERE t.carId = :carId"),
    @NamedQuery(name = "TbCarros.findByCarRenavam", query = "SELECT t FROM TbCarros t WHERE t.carRenavam = :carRenavam"),
    @NamedQuery(name = "TbCarros.findByCarAnoFabricacao", query = "SELECT t FROM TbCarros t WHERE t.carAnoFabricacao = :carAnoFabricacao"),
    @NamedQuery(name = "TbCarros.findByCarAnoModelo", query = "SELECT t FROM TbCarros t WHERE t.carAnoModelo = :carAnoModelo"),
    @NamedQuery(name = "TbCarros.findByCarChassi", query = "SELECT t FROM TbCarros t WHERE t.carChassi = :carChassi"),
    @NamedQuery(name = "TbCarros.findByCarCusId", query = "SELECT t FROM TbCarros t WHERE t.carCusId = :carCusId"),
    @NamedQuery(name = "TbCarros.findByCarCorId", query = "SELECT t FROM TbCarros t WHERE t.carCorId = :carCorId"),
    @NamedQuery(name = "TbCarros.findByCarPlaca", query = "SELECT t FROM TbCarros t WHERE t.carPlaca = :carPlaca"),
    @NamedQuery(name = "TbCarros.findByCarObservacoes", query = "SELECT t FROM TbCarros t WHERE t.carObservacoes = :carObservacoes"),
    @NamedQuery(name = "TbCarros.findByCarMototizacao", query = "SELECT t FROM TbCarros t WHERE t.carMototizacao = :carMototizacao"),
    @NamedQuery(name = "TbCarros.findByCarModelo", query = "SELECT t FROM TbCarros t WHERE t.carModelo = :carModelo")})
public class TbCarros implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "car_id")
    private Integer carId;
    @Basic(optional = false)
    @Column(name = "car_renavam")
    private String carRenavam;
    @Basic(optional = false)
    @Column(name = "car_ano_fabricacao")
    private int carAnoFabricacao;
    @Basic(optional = false)
    @Column(name = "car_ano_modelo")
    private int carAnoModelo;
    @Basic(optional = false)
    @Column(name = "car_chassi")
    private String carChassi;
    @Column(name = "car_cus_id")
    private Integer carCusId;
    @Basic(optional = false)
    @Column(name = "car_cor_id")
    private int carCorId;
    @Basic(optional = false)
    @Column(name = "car_placa")
    private String carPlaca;
    @Column(name = "car_observacoes")
    private String carObservacoes;
    @Basic(optional = false)
    @Column(name = "car_mototizacao")
    private String carMototizacao;
    @Basic(optional = false)
    @Column(name = "car_modelo")
    private String carModelo;

    public TbCarros() {
    }

    public TbCarros(Integer carId) {
        this.carId = carId;
    }

    public TbCarros(Integer carId, String carRenavam, int carAnoFabricacao, int carAnoModelo, String carChassi, int carCorId, String carPlaca, String carMototizacao, String carModelo) {
        this.carId = carId;
        this.carRenavam = carRenavam;
        this.carAnoFabricacao = carAnoFabricacao;
        this.carAnoModelo = carAnoModelo;
        this.carChassi = carChassi;
        this.carCorId = carCorId;
        this.carPlaca = carPlaca;
        this.carMototizacao = carMototizacao;
        this.carModelo = carModelo;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        Integer oldCarId = this.carId;
        this.carId = carId;
        changeSupport.firePropertyChange("carId", oldCarId, carId);
    }

    public String getCarRenavam() {
        return carRenavam;
    }

    public void setCarRenavam(String carRenavam) {
        String oldCarRenavam = this.carRenavam;
        this.carRenavam = carRenavam;
        changeSupport.firePropertyChange("carRenavam", oldCarRenavam, carRenavam);
    }

    public int getCarAnoFabricacao() {
        return carAnoFabricacao;
    }

    public void setCarAnoFabricacao(int carAnoFabricacao) {
        int oldCarAnoFabricacao = this.carAnoFabricacao;
        this.carAnoFabricacao = carAnoFabricacao;
        changeSupport.firePropertyChange("carAnoFabricacao", oldCarAnoFabricacao, carAnoFabricacao);
    }

    public int getCarAnoModelo() {
        return carAnoModelo;
    }

    public void setCarAnoModelo(int carAnoModelo) {
        int oldCarAnoModelo = this.carAnoModelo;
        this.carAnoModelo = carAnoModelo;
        changeSupport.firePropertyChange("carAnoModelo", oldCarAnoModelo, carAnoModelo);
    }

    public String getCarChassi() {
        return carChassi;
    }

    public void setCarChassi(String carChassi) {
        String oldCarChassi = this.carChassi;
        this.carChassi = carChassi;
        changeSupport.firePropertyChange("carChassi", oldCarChassi, carChassi);
    }

    public Integer getCarCusId() {
        return carCusId;
    }

    public void setCarCusId(Integer carCusId) {
        Integer oldCarCusId = this.carCusId;
        this.carCusId = carCusId;
        changeSupport.firePropertyChange("carCusId", oldCarCusId, carCusId);
    }

    public int getCarCorId() {
        return carCorId;
    }

    public void setCarCorId(int carCorId) {
        int oldCarCorId = this.carCorId;
        this.carCorId = carCorId;
        changeSupport.firePropertyChange("carCorId", oldCarCorId, carCorId);
    }

    public String getCarPlaca() {
        return carPlaca;
    }

    public void setCarPlaca(String carPlaca) {
        String oldCarPlaca = this.carPlaca;
        this.carPlaca = carPlaca;
        changeSupport.firePropertyChange("carPlaca", oldCarPlaca, carPlaca);
    }

    public String getCarObservacoes() {
        return carObservacoes;
    }

    public void setCarObservacoes(String carObservacoes) {
        String oldCarObservacoes = this.carObservacoes;
        this.carObservacoes = carObservacoes;
        changeSupport.firePropertyChange("carObservacoes", oldCarObservacoes, carObservacoes);
    }

    public String getCarMototizacao() {
        return carMototizacao;
    }

    public void setCarMototizacao(String carMototizacao) {
        String oldCarMototizacao = this.carMototizacao;
        this.carMototizacao = carMototizacao;
        changeSupport.firePropertyChange("carMototizacao", oldCarMototizacao, carMototizacao);
    }

    public String getCarModelo() {
        return carModelo;
    }

    public void setCarModelo(String carModelo) {
        String oldCarModelo = this.carModelo;
        this.carModelo = carModelo;
        changeSupport.firePropertyChange("carModelo", oldCarModelo, carModelo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carId != null ? carId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCarros)) {
            return false;
        }
        TbCarros other = (TbCarros) object;
        if ((this.carId == null && other.carId != null) || (this.carId != null && !this.carId.equals(other.carId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.TbCarros[ carId=" + carId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
