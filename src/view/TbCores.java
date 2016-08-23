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
@Table(name = "tb_cores", catalog = "db_loja_carros", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbCores.findAll", query = "SELECT t FROM TbCores t"),
    @NamedQuery(name = "TbCores.findByCorId", query = "SELECT t FROM TbCores t WHERE t.corId = :corId"),
    @NamedQuery(name = "TbCores.findByCorCor", query = "SELECT t FROM TbCores t WHERE t.corCor = :corCor")})
public class TbCores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cor_id")
    private Integer corId;
    @Basic(optional = false)
    @Column(name = "cor_cor")
    private String corCor;

    public TbCores() {
    }

    public TbCores(Integer corId) {
        this.corId = corId;
    }

    public TbCores(Integer corId, String corCor) {
        this.corId = corId;
        this.corCor = corCor;
    }

    public Integer getCorId() {
        return corId;
    }

    public void setCorId(Integer corId) {
        Integer oldCorId = this.corId;
        this.corId = corId;
        changeSupport.firePropertyChange("corId", oldCorId, corId);
    }

    public String getCorCor() {
        return corCor;
    }

    public void setCorCor(String corCor) {
        String oldCorCor = this.corCor;
        this.corCor = corCor;
        changeSupport.firePropertyChange("corCor", oldCorCor, corCor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corId != null ? corId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCores)) {
            return false;
        }
        TbCores other = (TbCores) object;
        if ((this.corId == null && other.corId != null) || (this.corId != null && !this.corId.equals(other.corId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.TbCores[ corId=" + corId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
