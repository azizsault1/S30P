package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Enderecos;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T17:34:32")
@StaticMetamodel(Proprietarios.class)
public class Proprietarios_ { 

    public static volatile SingularAttribute<Proprietarios, String> selecao;
    public static volatile SingularAttribute<Proprietarios, String> tipo;
    public static volatile SingularAttribute<Proprietarios, Date> nascimento;
    public static volatile SingularAttribute<Proprietarios, Integer> sequencia;
    public static volatile SingularAttribute<Proprietarios, String> telefone1;
    public static volatile SingularAttribute<Proprietarios, Integer> chavecli;
    public static volatile SingularAttribute<Proprietarios, String> nome;
    public static volatile SingularAttribute<Proprietarios, String> cnpj;
    public static volatile SingularAttribute<Proprietarios, String> telefone2;
    public static volatile SingularAttribute<Proprietarios, String> telefone3;
    public static volatile SingularAttribute<Proprietarios, BigDecimal> renda;
    public static volatile SingularAttribute<Proprietarios, BigDecimal> fgts;
    public static volatile SingularAttribute<Proprietarios, String> rcpf;
    public static volatile SingularAttribute<Proprietarios, String> estcivil;
    public static volatile SingularAttribute<Proprietarios, String> conjuge;
    public static volatile SingularAttribute<Proprietarios, Enderecos> enderecosIdenderecos;
    public static volatile SingularAttribute<Proprietarios, Integer> idproprietarios;
    public static volatile SingularAttribute<Proprietarios, String> email;

}