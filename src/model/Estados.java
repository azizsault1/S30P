/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "estados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estados.findAll", query = "SELECT e FROM Estados e"),
    @NamedQuery(name = "Estados.findByIdestados", query = "SELECT e FROM Estados e WHERE e.idestados = :idestados"),
    @NamedQuery(name = "Estados.findByNomee", query = "SELECT e FROM Estados e WHERE e.nomee = :nomee"),
    @NamedQuery(name = "Estados.findByUf", query = "SELECT e FROM Estados e WHERE e.uf = :uf")})
public class Estados implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestados")
    private Integer idestados;
    @Column(name = "nomee")
    private String nomee;
    @Column(name = "uf")
    private String uf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadosIdestados")
    private Collection<Cidades> cidadesCollection;

    public Estados() {
    }

    public Estados(Integer idestados) {
        this.idestados = idestados;
    }

    public Integer getIdestados() {
        return idestados;
    }

    public void setIdestados(Integer idestados) {
        Integer oldIdestados = this.idestados;
        this.idestados = idestados;
        changeSupport.firePropertyChange("idestados", oldIdestados, idestados);
    }

    public String getNomee() {
        return nomee;
    }

    public void setNomee(String nomee) {
        String oldNomee = this.nomee;
        this.nomee = nomee;
        changeSupport.firePropertyChange("nomee", oldNomee, nomee);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    @XmlTransient
    public Collection<Cidades> getCidadesCollection() {
        return cidadesCollection;
    }

    public void setCidadesCollection(Collection<Cidades> cidadesCollection) {
        this.cidadesCollection = cidadesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestados != null ? idestados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.idestados == null && other.idestados != null) || (this.idestados != null && !this.idestados.equals(other.idestados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomee();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
