/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.beans;

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
    @NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u"),
    @NamedQuery(name = "Unidade.findById", query = "SELECT u FROM Unidade u WHERE u.id = :id"),
    @NamedQuery(name = "Unidade.findByTipo", query = "SELECT u FROM Unidade u WHERE u.tipo = :tipo"),
    @NamedQuery(name = "Unidade.findByQuartos", query = "SELECT u FROM Unidade u WHERE u.quartos = :quartos"),
    @NamedQuery(name = "Unidade.findByHome", query = "SELECT u FROM Unidade u WHERE u.home = :home"),
    @NamedQuery(name = "Unidade.findByVaranda", query = "SELECT u FROM Unidade u WHERE u.varanda = :varanda"),
    @NamedQuery(name = "Unidade.findByVarandaGourmet", query = "SELECT u FROM Unidade u WHERE u.varandaGourmet = :varandaGourmet"),
    @NamedQuery(name = "Unidade.findBySalas", query = "SELECT u FROM Unidade u WHERE u.salas = :salas"),
    @NamedQuery(name = "Unidade.findBySuites", query = "SELECT u FROM Unidade u WHERE u.suites = :suites"),
    @NamedQuery(name = "Unidade.findByCloset", query = "SELECT u FROM Unidade u WHERE u.closet = :closet"),
    @NamedQuery(name = "Unidade.findByBanheiro", query = "SELECT u FROM Unidade u WHERE u.banheiro = :banheiro"),
    @NamedQuery(name = "Unidade.findByLavabo", query = "SELECT u FROM Unidade u WHERE u.lavabo = :lavabo"),
    @NamedQuery(name = "Unidade.findByCozinha", query = "SELECT u FROM Unidade u WHERE u.cozinha = :cozinha"),
    @NamedQuery(name = "Unidade.findByDespensa", query = "SELECT u FROM Unidade u WHERE u.despensa = :despensa"),
    @NamedQuery(name = "Unidade.findByAreaServico", query = "SELECT u FROM Unidade u WHERE u.areaServico = :areaServico"),
    @NamedQuery(name = "Unidade.findByDependencia", query = "SELECT u FROM Unidade u WHERE u.dependencia = :dependencia"),
    @NamedQuery(name = "Unidade.findByEscritorio", query = "SELECT u FROM Unidade u WHERE u.escritorio = :escritorio"),
    @NamedQuery(name = "Unidade.findByValor", query = "SELECT u FROM Unidade u WHERE u.valor = :valor")})
public class Unidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @JoinColumn(name = "idareaexterna", referencedColumnName = "id")
    @ManyToOne
    private AreaExterna idareaexterna;
    @JoinColumn(name = "idenderecos", referencedColumnName = "id")
    @ManyToOne
    private Endereco idenderecos;
    @JoinColumn(name = "idvendas", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Venda idvendas;
    @JoinColumn(name = "idcondominios", referencedColumnName = "id")
    @ManyToOne
    private Condominio idcondominios;
    @JoinColumn(name = "idcontas", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Conta idcontas;

    public Unidade() {
    }

    public Unidade(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public AreaExterna getIdareaexterna() {
        return idareaexterna;
    }

    public void setIdareaexterna(AreaExterna idareaexterna) {
        this.idareaexterna = idareaexterna;
    }

    public Endereco getIdenderecos() {
        return idenderecos;
    }

    public void setIdenderecos(Endereco idenderecos) {
        this.idenderecos = idenderecos;
    }

    public Venda getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(Venda idvendas) {
        this.idvendas = idvendas;
    }

    public Condominio getIdcondominios() {
        return idcondominios;
    }

    public void setIdcondominios(Condominio idcondominios) {
        this.idcondominios = idcondominios;
    }

    public Conta getIdcontas() {
        return idcontas;
    }

    public void setIdcontas(Conta idcontas) {
        this.idcontas = idcontas;
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
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.beans.Unidade[ id=" + id + " ]";
    }
    
}
