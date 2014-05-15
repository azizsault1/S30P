/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.enums.EstadoCivil;
import model.enums.TipoConta;
import model.enums.TipoPessoa;

/**
 *
 * @author koonjshah
 */
@Entity
@Table(name = "contas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c"),
    @NamedQuery(name = "Conta.findById", query = "SELECT c FROM Conta c WHERE c.id = :id"),
    @NamedQuery(name = "Conta.findByNome", query = "SELECT c FROM Conta c WHERE c.nome = :nome"),
    @NamedQuery(name = "Conta.findByTipoPessoa", query = "SELECT c FROM Conta c WHERE c.tipoPessoa = :tipoPessoa"),
    @NamedQuery(name = "Conta.findByRcpf", query = "SELECT c FROM Conta c WHERE c.rcpf = :rcpf"),
    @NamedQuery(name = "Conta.findByCnpj", query = "SELECT c FROM Conta c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Conta.findByTelefone1", query = "SELECT c FROM Conta c WHERE c.telefone1 = :telefone1"),
    @NamedQuery(name = "Conta.findByTelefone2", query = "SELECT c FROM Conta c WHERE c.telefone2 = :telefone2"),
    @NamedQuery(name = "Conta.findByTelefone3", query = "SELECT c FROM Conta c WHERE c.telefone3 = :telefone3"),
    @NamedQuery(name = "Conta.findByNascimento", query = "SELECT c FROM Conta c WHERE c.nascimento = :nascimento"),
    @NamedQuery(name = "Conta.findByConjuge", query = "SELECT c FROM Conta c WHERE c.conjuge = :conjuge"),
    @NamedQuery(name = "Conta.findByEmail", query = "SELECT c FROM Conta c WHERE c.email = :email"),
    @NamedQuery(name = "Conta.findByTipoConta", query = "SELECT c FROM Conta c WHERE c.tipoConta = :tipoConta"),
    @NamedQuery(name = "Conta.findByChavecli", query = "SELECT c FROM Conta c WHERE c.chavecli = :chavecli"),
    @NamedQuery(name = "Conta.findByEstcivil", query = "SELECT c FROM Conta c WHERE c.estcivil = :estcivil"),
    @NamedQuery(name = "Conta.findByRenda", query = "SELECT c FROM Conta c WHERE c.renda = :renda"),
    @NamedQuery(name = "Conta.findByFgts", query = "SELECT c FROM Conta c WHERE c.fgts = :fgts"),
    @NamedQuery(name = "Conta.findByPercentualBase", query = "SELECT c FROM Conta c WHERE c.percentualBase = :percentualBase"),
    @NamedQuery(name = "Conta.findByCreci", query = "SELECT c FROM Conta c WHERE c.creci = :creci")})
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome = "";
    
    @Basic(optional = false)
    @Column(name = "tipo_pessoa")
    @Enumerated(EnumType.ORDINAL)
    private TipoPessoa tipoPessoa;
    
    @Column(name = "rcpf")
    private String rcpf ="";
    @Column(name = "cnpj")
    private String cnpj ="";
    @Column(name = "telefone1")
    private String telefone1 = "";
    @Column(name = "telefone2")
    private String telefone2 = "";
    @Column(name = "telefone3")
    private String telefone3 ="";
    @Column(name = "nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nascimento = new Date();
    
    @Column(name = "conjuge")
    private String conjuge = "";
    @Column(name = "email")
    private String email = "";
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_conta")
    private TipoConta tipoConta;
    
    @Column(name = "chavecli")
    private Integer chavecli;
    @Column(name = "estcivil")
    @Enumerated(EnumType.ORDINAL)
    private EstadoCivil estcivil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "renda")
    private BigDecimal renda = new BigDecimal(0);
    @Column(name = "fgts")
    private BigDecimal fgts = new BigDecimal(0);
    @Column(name = "percentual_base")
    private BigDecimal percentualBase = new BigDecimal(50);
    @Column(name = "creci")
    private Integer creci = 0;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontas")
    private Collection<Unidade> unidadeCollection;
    @JoinColumn(name = "idendereco", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Endereco endereco;

    public Conta() {
        tipoPessoa = TipoPessoa.Fisica;
        tipoConta = TipoConta.Proprietario;
        estcivil = EstadoCivil.Solteiro;
        this.endereco = new Endereco();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getRcpf() {
        return rcpf;
    }

    public void setRcpf(String rcpf) {
        this.rcpf = rcpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Integer getChavecli() {
        return chavecli;
    }

    public void setChavecli(Integer chavecli) {
        this.chavecli = chavecli;
    }

    public EstadoCivil getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(EstadoCivil estcivil) {
        this.estcivil = estcivil;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public BigDecimal getFgts() {
        return fgts;
    }

    public void setFgts(BigDecimal fgts) {
        this.fgts = fgts;
    }

    public BigDecimal getPercentualBase() {
        return percentualBase;
    }

    public void setPercentualBase(BigDecimal percentualBase) {
        this.percentualBase = percentualBase;
    }

    public Integer getCreci() {
        return creci;
    }

    public void setCreci(Integer creci) {
        this.creci = creci;
    }

    @XmlTransient
    public Collection<Unidade> getUnidadeCollection() {
        return unidadeCollection;
    }

    public void setUnidadeCollection(Collection<Unidade> unidadeCollection) {
        this.unidadeCollection = unidadeCollection;
    }

    public Endereco getIdendereco() {
        return endereco;
    }

    public void setIdendereco(Endereco idendereco) {
        this.endereco = idendereco;
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
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", rcpf=" + rcpf + ", cnpj=" + cnpj + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", telefone3=" + telefone3 + ", nascimento=" + nascimento + ", conjuge=" + conjuge + ", email=" + email + ", tipoConta=" + tipoConta + ", chavecli=" + chavecli + ", estcivil=" + estcivil + ", renda=" + renda + ", fgts=" + fgts + ", percentualBase=" + percentualBase + ", creci=" + creci + ", unidadeCollection=" + unidadeCollection + ", endereco=" + endereco + '}';
    }


    
    
}
