/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "condominios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condominios.findAll", query = "SELECT c FROM Condominios c"),
    @NamedQuery(name = "Condominios.findByIdcondominios", query = "SELECT c FROM Condominios c WHERE c.idcondominios = :idcondominios"),
    @NamedQuery(name = "Condominios.findByPiscina", query = "SELECT c FROM Condominios c WHERE c.piscina = :piscina"),
    @NamedQuery(name = "Condominios.findByChurrasqueira", query = "SELECT c FROM Condominios c WHERE c.churrasqueira = :churrasqueira"),
    @NamedQuery(name = "Condominios.findByAcademia", query = "SELECT c FROM Condominios c WHERE c.academia = :academia"),
    @NamedQuery(name = "Condominios.findByPlay", query = "SELECT c FROM Condominios c WHERE c.play = :play"),
    @NamedQuery(name = "Condominios.findByParque", query = "SELECT c FROM Condominios c WHERE c.parque = :parque"),
    @NamedQuery(name = "Condominios.findByQuadra", query = "SELECT c FROM Condominios c WHERE c.quadra = :quadra"),
    @NamedQuery(name = "Condominios.findByFestas", query = "SELECT c FROM Condominios c WHERE c.festas = :festas"),
    @NamedQuery(name = "Condominios.findByJogos", query = "SELECT c FROM Condominios c WHERE c.jogos = :jogos"),
    @NamedQuery(name = "Condominios.findByGourmet", query = "SELECT c FROM Condominios c WHERE c.gourmet = :gourmet"),
    @NamedQuery(name = "Condominios.findByZen", query = "SELECT c FROM Condominios c WHERE c.zen = :zen"),
    @NamedQuery(name = "Condominios.findByBriquedoteca", query = "SELECT c FROM Condominios c WHERE c.briquedoteca = :briquedoteca"),
    @NamedQuery(name = "Condominios.findByCinema", query = "SELECT c FROM Condominios c WHERE c.cinema = :cinema"),
    @NamedQuery(name = "Condominios.findBySauna", query = "SELECT c FROM Condominios c WHERE c.sauna = :sauna"),
    @NamedQuery(name = "Condominios.findByPorteiro", query = "SELECT c FROM Condominios c WHERE c.porteiro = :porteiro"),
    @NamedQuery(name = "Condominios.findByInterfone", query = "SELECT c FROM Condominios c WHERE c.interfone = :interfone"),
    @NamedQuery(name = "Condominios.findByGas", query = "SELECT c FROM Condominios c WHERE c.gas = :gas"),
    @NamedQuery(name = "Condominios.findByElevador", query = "SELECT c FROM Condominios c WHERE c.elevador = :elevador"),
    @NamedQuery(name = "Condominios.findByNome", query = "SELECT c FROM Condominios c WHERE c.nome = :nome")})
public class Condominios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcondominios")
    private Integer idcondominios;
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
    @Column(name = "nome")
    private String nome;

    public Condominios() {
    }

    public Condominios(Integer idcondominios) {
        this.idcondominios = idcondominios;
    }

    public Integer getIdcondominios() {
        return idcondominios;
    }

    public void setIdcondominios(Integer idcondominios) {
        this.idcondominios = idcondominios;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcondominios != null ? idcondominios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condominios)) {
            return false;
        }
        Condominios other = (Condominios) object;
        if ((this.idcondominios == null && other.idcondominios != null) || (this.idcondominios != null && !this.idcondominios.equals(other.idcondominios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "s30p.view.Condominios[ idcondominios=" + idcondominios + " ]";
    }
    
}
