/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "enderecos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e"),
    @NamedQuery(name = "Enderecos.findByIdenderecos", query = "SELECT e FROM Enderecos e WHERE e.idenderecos = :idenderecos"),
    @NamedQuery(name = "Enderecos.findByEndereco", query = "SELECT e FROM Enderecos e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "Enderecos.findByBairro", query = "SELECT e FROM Enderecos e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Enderecos.findByCep", query = "SELECT e FROM Enderecos e WHERE e.cep = :cep"),
    @NamedQuery(name = "Enderecos.findByNumero", query = "SELECT e FROM Enderecos e WHERE e.numero = :numero"),
    @NamedQuery(name = "Enderecos.findByPtref", query = "SELECT e FROM Enderecos e WHERE e.ptref = :ptref")})
public class Enderecos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idenderecos")
    private Integer idenderecos;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private Integer cep;
    @Column(name = "numero")
    private String numero;
    @Column(name = "ptref")
    private String ptref;
    @OneToMany(mappedBy = "enderecosIdenderecos")
    private Collection<Proprietarios> proprietariosCollection;
    @JoinColumn(name = "cidades_idcidades", referencedColumnName = "idcidades")
    @ManyToOne(optional = false)
    private Cidades cidadesIdcidades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enderecosIdenderecos")
    private Collection<Imoveis> imoveisCollection;

    public Enderecos() {
    }

    public Enderecos(Integer idenderecos) {
        this.idenderecos = idenderecos;
    }

    public Integer getIdenderecos() {
        return idenderecos;
    }

    public void setIdenderecos(Integer idenderecos) {
        this.idenderecos = idenderecos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPtref() {
        return ptref;
    }

    public void setPtref(String ptref) {
        this.ptref = ptref;
    }

    @XmlTransient
    public Collection<Proprietarios> getProprietariosCollection() {
        return proprietariosCollection;
    }

    public void setProprietariosCollection(Collection<Proprietarios> proprietariosCollection) {
        this.proprietariosCollection = proprietariosCollection;
    }

    public Cidades getCidadesIdcidades() {
        return cidadesIdcidades;
    }

    public void setCidadesIdcidades(Cidades cidadesIdcidades) {
        this.cidadesIdcidades = cidadesIdcidades;
    }

    @XmlTransient
    public Collection<Imoveis> getImoveisCollection() {
        return imoveisCollection;
    }

    public void setImoveisCollection(Collection<Imoveis> imoveisCollection) {
        this.imoveisCollection = imoveisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenderecos != null ? idenderecos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecos)) {
            return false;
        }
        Enderecos other = (Enderecos) object;
        if ((this.idenderecos == null && other.idenderecos != null) || (this.idenderecos != null && !this.idenderecos.equals(other.idenderecos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "s30p.view.Enderecos[ idenderecos=" + idenderecos + " ]";
    }
    
}
