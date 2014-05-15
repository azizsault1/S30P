/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.beans;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "area_externa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaExterna.findAll", query = "SELECT a FROM AreaExterna a"),
    @NamedQuery(name = "AreaExterna.findById", query = "SELECT a FROM AreaExterna a WHERE a.id = :id"),
    @NamedQuery(name = "AreaExterna.findByPiscina", query = "SELECT a FROM AreaExterna a WHERE a.piscina = :piscina"),
    @NamedQuery(name = "AreaExterna.findByChurrasqueira", query = "SELECT a FROM AreaExterna a WHERE a.churrasqueira = :churrasqueira"),
    @NamedQuery(name = "AreaExterna.findByAcademia", query = "SELECT a FROM AreaExterna a WHERE a.academia = :academia"),
    @NamedQuery(name = "AreaExterna.findByPlay", query = "SELECT a FROM AreaExterna a WHERE a.play = :play"),
    @NamedQuery(name = "AreaExterna.findByParque", query = "SELECT a FROM AreaExterna a WHERE a.parque = :parque"),
    @NamedQuery(name = "AreaExterna.findByQuadra", query = "SELECT a FROM AreaExterna a WHERE a.quadra = :quadra"),
    @NamedQuery(name = "AreaExterna.findByFestas", query = "SELECT a FROM AreaExterna a WHERE a.festas = :festas"),
    @NamedQuery(name = "AreaExterna.findByJogos", query = "SELECT a FROM AreaExterna a WHERE a.jogos = :jogos"),
    @NamedQuery(name = "AreaExterna.findByGourmet", query = "SELECT a FROM AreaExterna a WHERE a.gourmet = :gourmet"),
    @NamedQuery(name = "AreaExterna.findByZen", query = "SELECT a FROM AreaExterna a WHERE a.zen = :zen"),
    @NamedQuery(name = "AreaExterna.findByBriquedoteca", query = "SELECT a FROM AreaExterna a WHERE a.briquedoteca = :briquedoteca"),
    @NamedQuery(name = "AreaExterna.findByCinema", query = "SELECT a FROM AreaExterna a WHERE a.cinema = :cinema"),
    @NamedQuery(name = "AreaExterna.findBySauna", query = "SELECT a FROM AreaExterna a WHERE a.sauna = :sauna"),
    @NamedQuery(name = "AreaExterna.findByPorteiro", query = "SELECT a FROM AreaExterna a WHERE a.porteiro = :porteiro"),
    @NamedQuery(name = "AreaExterna.findByInterfone", query = "SELECT a FROM AreaExterna a WHERE a.interfone = :interfone"),
    @NamedQuery(name = "AreaExterna.findByGas", query = "SELECT a FROM AreaExterna a WHERE a.gas = :gas"),
    @NamedQuery(name = "AreaExterna.findByElevador", query = "SELECT a FROM AreaExterna a WHERE a.elevador = :elevador"),
    @NamedQuery(name = "AreaExterna.findByTamanho", query = "SELECT a FROM AreaExterna a WHERE a.tamanho = :tamanho")})
public class AreaExterna implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "piscina")
    private Boolean piscina;
    @Column(name = "churrasqueira")
    private Boolean churrasqueira;
    @Column(name = "academia")
    private Boolean academia;
    @Column(name = "play")
    private Boolean play;
    @Column(name = "parque")
    private Boolean parque;
    @Column(name = "quadra")
    private Boolean quadra;
    @Column(name = "festas")
    private Boolean festas;
    @Column(name = "jogos")
    private Boolean jogos;
    @Column(name = "gourmet")
    private Boolean gourmet;
    @Column(name = "zen")
    private Boolean zen;
    @Column(name = "briquedoteca")
    private Boolean briquedoteca;
    @Column(name = "cinema")
    private Boolean cinema;
    @Column(name = "sauna")
    private Boolean sauna;
    @Column(name = "porteiro")
    private Boolean porteiro;
    @Column(name = "interfone")
    private Boolean interfone;
    @Column(name = "gas")
    private Boolean gas;
    @Column(name = "elevador")
    private Boolean elevador;
    @Column(name = "tamanho")
    private Integer tamanho;
    @OneToMany(mappedBy = "idareaexterna")
    private Collection<Unidade> unidadeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idareaexterna")
    private Collection<Condominio> condominioCollection;

    public AreaExterna() {
    }

    public AreaExterna(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

    public Boolean getChurrasqueira() {
        return churrasqueira;
    }

    public void setChurrasqueira(Boolean churrasqueira) {
        this.churrasqueira = churrasqueira;
    }

    public Boolean getAcademia() {
        return academia;
    }

    public void setAcademia(Boolean academia) {
        this.academia = academia;
    }

    public Boolean getPlay() {
        return play;
    }

    public void setPlay(Boolean play) {
        this.play = play;
    }

    public Boolean getParque() {
        return parque;
    }

    public void setParque(Boolean parque) {
        this.parque = parque;
    }

    public Boolean getQuadra() {
        return quadra;
    }

    public void setQuadra(Boolean quadra) {
        this.quadra = quadra;
    }

    public Boolean getFestas() {
        return festas;
    }

    public void setFestas(Boolean festas) {
        this.festas = festas;
    }

    public Boolean getJogos() {
        return jogos;
    }

    public void setJogos(Boolean jogos) {
        this.jogos = jogos;
    }

    public Boolean getGourmet() {
        return gourmet;
    }

    public void setGourmet(Boolean gourmet) {
        this.gourmet = gourmet;
    }

    public Boolean getZen() {
        return zen;
    }

    public void setZen(Boolean zen) {
        this.zen = zen;
    }

    public Boolean getBriquedoteca() {
        return briquedoteca;
    }

    public void setBriquedoteca(Boolean briquedoteca) {
        this.briquedoteca = briquedoteca;
    }

    public Boolean getCinema() {
        return cinema;
    }

    public void setCinema(Boolean cinema) {
        this.cinema = cinema;
    }

    public Boolean getSauna() {
        return sauna;
    }

    public void setSauna(Boolean sauna) {
        this.sauna = sauna;
    }

    public Boolean getPorteiro() {
        return porteiro;
    }

    public void setPorteiro(Boolean porteiro) {
        this.porteiro = porteiro;
    }

    public Boolean getInterfone() {
        return interfone;
    }

    public void setInterfone(Boolean interfone) {
        this.interfone = interfone;
    }

    public Boolean getGas() {
        return gas;
    }

    public void setGas(Boolean gas) {
        this.gas = gas;
    }

    public Boolean getElevador() {
        return elevador;
    }

    public void setElevador(Boolean elevador) {
        this.elevador = elevador;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @XmlTransient
    public Collection<Unidade> getUnidadeCollection() {
        return unidadeCollection;
    }

    public void setUnidadeCollection(Collection<Unidade> unidadeCollection) {
        this.unidadeCollection = unidadeCollection;
    }

    @XmlTransient
    public Collection<Condominio> getCondominioCollection() {
        return condominioCollection;
    }

    public void setCondominioCollection(Collection<Condominio> condominioCollection) {
        this.condominioCollection = condominioCollection;
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
        if (!(object instanceof AreaExterna)) {
            return false;
        }
        AreaExterna other = (AreaExterna) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.beans.AreaExterna[ id=" + id + " ]";
    }
    
}
