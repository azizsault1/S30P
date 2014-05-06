/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import model.Enderecos;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "proprietarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proprietarios.findAll", query = "SELECT p FROM Proprietarios p"),
    @NamedQuery(name = "Proprietarios.findByIdproprietarios", query = "SELECT p FROM Proprietarios p WHERE p.idproprietarios = :idproprietarios"),
    @NamedQuery(name = "Proprietarios.findByNome", query = "SELECT p FROM Proprietarios p WHERE p.nome = :nome"),
    @NamedQuery(name = "Proprietarios.findByTipo", query = "SELECT p FROM Proprietarios p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Proprietarios.findByRcpf", query = "SELECT p FROM Proprietarios p WHERE p.rcpf = :rcpf"),
    @NamedQuery(name = "Proprietarios.findByCnpj", query = "SELECT p FROM Proprietarios p WHERE p.cnpj = :cnpj"),
    @NamedQuery(name = "Proprietarios.findByTelefone1", query = "SELECT p FROM Proprietarios p WHERE p.telefone1 = :telefone1"),
    @NamedQuery(name = "Proprietarios.findByTelefone2", query = "SELECT p FROM Proprietarios p WHERE p.telefone2 = :telefone2"),
    @NamedQuery(name = "Proprietarios.findByTelefone3", query = "SELECT p FROM Proprietarios p WHERE p.telefone3 = :telefone3"),
    @NamedQuery(name = "Proprietarios.findByNascimento", query = "SELECT p FROM Proprietarios p WHERE p.nascimento = :nascimento"),
    @NamedQuery(name = "Proprietarios.findByConjuge", query = "SELECT p FROM Proprietarios p WHERE p.conjuge = :conjuge"),
    @NamedQuery(name = "Proprietarios.findByEmail", query = "SELECT p FROM Proprietarios p WHERE p.email = :email"),
    @NamedQuery(name = "Proprietarios.findBySequencia", query = "SELECT p FROM Proprietarios p WHERE p.sequencia = :sequencia"),
    @NamedQuery(name = "Proprietarios.findBySelecao", query = "SELECT p FROM Proprietarios p WHERE p.selecao = :selecao"),
    @NamedQuery(name = "Proprietarios.findByChavecli", query = "SELECT p FROM Proprietarios p WHERE p.chavecli = :chavecli"),
    @NamedQuery(name = "Proprietarios.findByEstcivil", query = "SELECT p FROM Proprietarios p WHERE p.estcivil = :estcivil"),
    @NamedQuery(name = "Proprietarios.findByRenda", query = "SELECT p FROM Proprietarios p WHERE p.renda = :renda"),
    @NamedQuery(name = "Proprietarios.findByFgts", query = "SELECT p FROM Proprietarios p WHERE p.fgts = :fgts")})
public class Proprietarios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproprietarios")
    private Integer idproprietarios;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "rcpf")
    private Integer rcpf;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "telefone1")
    private String telefone1;
    @Column(name = "telefone2")
    private String telefone2;
    @Column(name = "telefone3")
    private String telefone3;
    @Column(name = "nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nascimento;
    @Column(name = "conjuge")
    private String conjuge;
    @Column(name = "email")
    private String email;
    @Column(name = "sequencia")
    private Integer sequencia;
    @Column(name = "selecao")
    private String selecao;
    @Column(name = "chavecli")
    private Integer chavecli;
    @Column(name = "estcivil")
    private String estcivil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "renda")
    private BigDecimal renda;
    @Column(name = "fgts")
    private BigDecimal fgts;
    @JoinColumn(name = "enderecos_idenderecos", referencedColumnName = "idenderecos")
    @ManyToOne
    private Enderecos enderecosIdenderecos;

    public Proprietarios() {
    }

    public Proprietarios(Integer idproprietarios) {
        this.idproprietarios = idproprietarios;
        this.tipo = "F";
    }

    public Proprietarios(Integer idproprietarios, String nome) {
        this.idproprietarios = idproprietarios;
        this.nome = nome;
        this.tipo = "F";
    }

    public Integer getIdproprietarios() {
        return idproprietarios;
    }

    public void setIdproprietarios(Integer idproprietarios) {
        Integer oldIdproprietarios = this.idproprietarios;
        this.idproprietarios = idproprietarios;
        changeSupport.firePropertyChange("idproprietarios", oldIdproprietarios, idproprietarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public Integer getRcpf() {
        return rcpf;
    }

    public void setRcpf(Integer rcpf) {      
        Integer oldRcpf = this.rcpf;
        this.rcpf = rcpf;
        changeSupport.firePropertyChange("rcpf", oldRcpf, rcpf);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        String oldTelefone1 = this.telefone1;
        this.telefone1 = telefone1;
        changeSupport.firePropertyChange("telefone1", oldTelefone1, telefone1);
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        String oldTelefone2 = this.telefone2;
        this.telefone2 = telefone2;
        changeSupport.firePropertyChange("telefone2", oldTelefone2, telefone2);
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        String oldTelefone3 = this.telefone3;
        this.telefone3 = telefone3;
        changeSupport.firePropertyChange("telefone3", oldTelefone3, telefone3);
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        Date oldNascimento = this.nascimento;
        this.nascimento = nascimento;
        changeSupport.firePropertyChange("nascimento", oldNascimento, nascimento);
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        String oldConjuge = this.conjuge;
        this.conjuge = conjuge;
        changeSupport.firePropertyChange("conjuge", oldConjuge, conjuge);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        Integer oldSequencia = this.sequencia;
        this.sequencia = sequencia;
        changeSupport.firePropertyChange("sequencia", oldSequencia, sequencia);
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        String oldSelecao = this.selecao;
        this.selecao = selecao;
        changeSupport.firePropertyChange("selecao", oldSelecao, selecao);
    }

    public Integer getChavecli() {
        return chavecli;
    }

    public void setChavecli(Integer chavecli) {
        Integer oldChavecli = this.chavecli;
        this.chavecli = chavecli;
        changeSupport.firePropertyChange("chavecli", oldChavecli, chavecli);
    }

    public String getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(String estcivil) {
        String oldEstcivil = this.estcivil;
        this.estcivil = estcivil;
        changeSupport.firePropertyChange("estcivil", oldEstcivil, estcivil);
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        BigDecimal oldRenda = this.renda;
        this.renda = renda;
        changeSupport.firePropertyChange("renda", oldRenda, renda);
    }

    public BigDecimal getFgts() {
        return fgts;
    }

    public void setFgts(BigDecimal fgts) {
        BigDecimal oldFgts = this.fgts;
        this.fgts = fgts;
        changeSupport.firePropertyChange("fgts", oldFgts, fgts);
    }

    public Enderecos getEnderecosIdenderecos() {
        return enderecosIdenderecos;
    }

    public void setEnderecosIdenderecos(Enderecos enderecosIdenderecos) {
        Enderecos oldEnderecosIdenderecos = this.enderecosIdenderecos;
        this.enderecosIdenderecos = enderecosIdenderecos;
        changeSupport.firePropertyChange("enderecosIdenderecos", oldEnderecosIdenderecos, enderecosIdenderecos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproprietarios != null ? idproprietarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proprietarios)) {
            return false;
        }
        Proprietarios other = (Proprietarios) object;
        if ((this.idproprietarios == null && other.idproprietarios != null) || (this.idproprietarios != null && !this.idproprietarios.equals(other.idproprietarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proprietarios{" + "idproprietarios=" + idproprietarios + ", nome=" + nome + ", tipo=" + tipo + ", rcpf=" + rcpf + ", cnpj=" + cnpj + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", telefone3=" + telefone3 + ", nascimento=" + nascimento + ", conjuge=" + conjuge + ", email=" + email + ", sequencia=" + sequencia + ", selecao=" + selecao + ", chavecli=" + chavecli + ", estcivil=" + estcivil + ", renda=" + renda + ", fgts=" + fgts + ", enderecosIdenderecos=" + enderecosIdenderecos + '}';
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
}
 
