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
@Table(name = "tb_aprovacao", catalog = "db_loja_carros", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbAprovacao.findAll", query = "SELECT t FROM TbAprovacao t"),
    @NamedQuery(name = "TbAprovacao.findByAprId", query = "SELECT t FROM TbAprovacao t WHERE t.aprId = :aprId"),
    @NamedQuery(name = "TbAprovacao.findByAprAprovacao", query = "SELECT t FROM TbAprovacao t WHERE t.aprAprovacao = :aprAprovacao")})
public class TbAprovacao implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "apr_id")
    private Integer aprId;
    @Column(name = "apr_aprovacao")
    private String aprAprovacao;

    public TbAprovacao() {
    }

    public TbAprovacao(Integer aprId) {
        this.aprId = aprId;
    }

    public Integer getAprId() {
        return aprId;
    }

    public void setAprId(Integer aprId) {
        Integer oldAprId = this.aprId;
        this.aprId = aprId;
        changeSupport.firePropertyChange("aprId", oldAprId, aprId);
    }

    public String getAprAprovacao() {
        return aprAprovacao;
    }

    public void setAprAprovacao(String aprAprovacao) {
        String oldAprAprovacao = this.aprAprovacao;
        this.aprAprovacao = aprAprovacao;
        changeSupport.firePropertyChange("aprAprovacao", oldAprAprovacao, aprAprovacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aprId != null ? aprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAprovacao)) {
            return false;
        }
        TbAprovacao other = (TbAprovacao) object;
        if ((this.aprId == null && other.aprId != null) || (this.aprId != null && !this.aprId.equals(other.aprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.TbAprovacao[ aprId=" + aprId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
