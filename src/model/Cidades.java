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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cidades.findAll", query = "SELECT c FROM Cidades c"),
    @NamedQuery(name = "Cidades.findByIdcidades", query = "SELECT c FROM Cidades c WHERE c.idcidades = :idcidades"),
    @NamedQuery(name = "Cidades.findByNome", query = "SELECT c FROM Cidades c WHERE c.nome = :nome")})
public class Cidades implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcidades")
    private Integer idcidades;
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidadesIdcidades")
    private Collection<Enderecos> enderecosCollection;
    @JoinColumn(name = "estados_idestados", referencedColumnName = "idestados")
    @ManyToOne(optional = false)
    private Estados estadosIdestados;

    public Cidades() {
    }

    public Cidades(Integer idcidades) {
        this.idcidades = idcidades;
    }

    public Integer getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Integer idcidades) {
        Integer oldIdcidades = this.idcidades;
        this.idcidades = idcidades;
        changeSupport.firePropertyChange("idcidades", oldIdcidades, idcidades);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    @XmlTransient
    public Collection<Enderecos> getEnderecosCollection() {
        return enderecosCollection;
    }

    public void setEnderecosCollection(Collection<Enderecos> enderecosCollection) {
        this.enderecosCollection = enderecosCollection;
    }

    public Estados getEstadosIdestados() {
        return estadosIdestados;
    }

    public void setEstadosIdestados(Estados estadosIdestados) {
        Estados oldEstadosIdestados = this.estadosIdestados;
        this.estadosIdestados = estadosIdestados;
        changeSupport.firePropertyChange("estadosIdestados", oldEstadosIdestados, estadosIdestados);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcidades != null ? idcidades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidades)) {
            return false;
        }
        Cidades other = (Cidades) object;
        if ((this.idcidades == null && other.idcidades != null) || (this.idcidades != null && !this.idcidades.equals(other.idcidades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "s30p.view.Cidades[ idcidades=" + idcidades + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
