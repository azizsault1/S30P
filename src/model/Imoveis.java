/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "imoveis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imoveis.findAll", query = "SELECT i FROM Imoveis i"),
    @NamedQuery(name = "Imoveis.findByIdimoveis", query = "SELECT i FROM Imoveis i WHERE i.idimoveis = :idimoveis"),
    @NamedQuery(name = "Imoveis.findByTipo", query = "SELECT i FROM Imoveis i WHERE i.tipo = :tipo"),
    @NamedQuery(name = "Imoveis.findByQuartos", query = "SELECT i FROM Imoveis i WHERE i.quartos = :quartos"),
    @NamedQuery(name = "Imoveis.findByHome", query = "SELECT i FROM Imoveis i WHERE i.home = :home"),
    @NamedQuery(name = "Imoveis.findByVaranda", query = "SELECT i FROM Imoveis i WHERE i.varanda = :varanda"),
    @NamedQuery(name = "Imoveis.findByVarandaGourmet", query = "SELECT i FROM Imoveis i WHERE i.varandaGourmet = :varandaGourmet"),
    @NamedQuery(name = "Imoveis.findBySalas", query = "SELECT i FROM Imoveis i WHERE i.salas = :salas"),
    @NamedQuery(name = "Imoveis.findBySuites", query = "SELECT i FROM Imoveis i WHERE i.suites = :suites"),
    @NamedQuery(name = "Imoveis.findByCloset", query = "SELECT i FROM Imoveis i WHERE i.closet = :closet"),
    @NamedQuery(name = "Imoveis.findByBanheiro", query = "SELECT i FROM Imoveis i WHERE i.banheiro = :banheiro"),
    @NamedQuery(name = "Imoveis.findByLavabo", query = "SELECT i FROM Imoveis i WHERE i.lavabo = :lavabo"),
    @NamedQuery(name = "Imoveis.findByCozinha", query = "SELECT i FROM Imoveis i WHERE i.cozinha = :cozinha"),
    @NamedQuery(name = "Imoveis.findByDespensa", query = "SELECT i FROM Imoveis i WHERE i.despensa = :despensa"),
    @NamedQuery(name = "Imoveis.findByAreaServico", query = "SELECT i FROM Imoveis i WHERE i.areaServico = :areaServico"),
    @NamedQuery(name = "Imoveis.findByDependencia", query = "SELECT i FROM Imoveis i WHERE i.dependencia = :dependencia"),
    @NamedQuery(name = "Imoveis.findByEscritorio", query = "SELECT i FROM Imoveis i WHERE i.escritorio = :escritorio"),
    @NamedQuery(name = "Imoveis.findByValor", query = "SELECT i FROM Imoveis i WHERE i.valor = :valor")})
public class Imoveis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idimoveis")
    private Integer idimoveis;
    @Column(name = "tipo")
    private Short tipo;
    @Column(name = "quartos")
    private Short quartos;
    @Column(name = "home")
    private Boolean home;
    @Column(name = "varanda")
    private Boolean varanda;
    @Column(name = "varanda_gourmet")
    private Boolean varandaGourmet;
    @Column(name = "salas")
    private Short salas;
    @Column(name = "suites")
    private Short suites;
    @Column(name = "closet")
    private Short closet;
    @Column(name = "banheiro")
    private Short banheiro;
    @Column(name = "lavabo")
    private Short lavabo;
    @Column(name = "cozinha")
    private Short cozinha;
    @Column(name = "despensa")
    private Short despensa;
    @Column(name = "area_servico")
    private Short areaServico;
    @Column(name = "dependencia")
    private Short dependencia;
    @Column(name = "escritorio")
    private Short escritorio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @JoinColumn(name = "enderecos_idenderecos", referencedColumnName = "idenderecos")
    @ManyToOne(optional = false)
    private Enderecos enderecosIdenderecos;

    public Imoveis() {
    }

    public Imoveis(Integer idimoveis) {
        this.idimoveis = idimoveis;
    }

    public Integer getIdimoveis() {
        return idimoveis;
    }

    public void setIdimoveis(Integer idimoveis) {
        this.idimoveis = idimoveis;
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    public Short getQuartos() {
        return quartos;
    }

    public void setQuartos(Short quartos) {
        this.quartos = quartos;
    }

    public Boolean getHome() {
        return home;
    }

    public void setHome(Boolean home) {
        this.home = home;
    }

    public Boolean getVaranda() {
        return varanda;
    }

    public void setVaranda(Boolean varanda) {
        this.varanda = varanda;
    }

    public Boolean getVarandaGourmet() {
        return varandaGourmet;
    }

    public void setVarandaGourmet(Boolean varandaGourmet) {
        this.varandaGourmet = varandaGourmet;
    }

    public Short getSalas() {
        return salas;
    }

    public void setSalas(Short salas) {
        this.salas = salas;
    }

    public Short getSuites() {
        return suites;
    }

    public void setSuites(Short suites) {
        this.suites = suites;
    }

    public Short getCloset() {
        return closet;
    }

    public void setCloset(Short closet) {
        this.closet = closet;
    }

    public Short getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(Short banheiro) {
        this.banheiro = banheiro;
    }

    public Short getLavabo() {
        return lavabo;
    }

    public void setLavabo(Short lavabo) {
        this.lavabo = lavabo;
    }

    public Short getCozinha() {
        return cozinha;
    }

    public void setCozinha(Short cozinha) {
        this.cozinha = cozinha;
    }

    public Short getDespensa() {
        return despensa;
    }

    public void setDespensa(Short despensa) {
        this.despensa = despensa;
    }

    public Short getAreaServico() {
        return areaServico;
    }

    public void setAreaServico(Short areaServico) {
        this.areaServico = areaServico;
    }

    public Short getDependencia() {
        return dependencia;
    }

    public void setDependencia(Short dependencia) {
        this.dependencia = dependencia;
    }

    public Short getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(Short escritorio) {
        this.escritorio = escritorio;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Enderecos getEnderecosIdenderecos() {
        return enderecosIdenderecos;
    }

    public void setEnderecosIdenderecos(Enderecos enderecosIdenderecos) {
        this.enderecosIdenderecos = enderecosIdenderecos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idimoveis != null ? idimoveis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imoveis)) {
            return false;
        }
        Imoveis other = (Imoveis) object;
        if ((this.idimoveis == null && other.idimoveis != null) || (this.idimoveis != null && !this.idimoveis.equals(other.idimoveis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "s30p.view.Imoveis[ idimoveis=" + idimoveis + " ]";
    }
    
}
