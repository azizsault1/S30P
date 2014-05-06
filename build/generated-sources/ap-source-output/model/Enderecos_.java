package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidades;
import model.Imoveis;
import model.Proprietarios;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T17:34:32")
@StaticMetamodel(Enderecos.class)
public class Enderecos_ { 

    public static volatile SingularAttribute<Enderecos, Integer> idenderecos;
    public static volatile CollectionAttribute<Enderecos, Proprietarios> proprietariosCollection;
    public static volatile SingularAttribute<Enderecos, String> endereco;
    public static volatile SingularAttribute<Enderecos, String> numero;
    public static volatile CollectionAttribute<Enderecos, Imoveis> imoveisCollection;
    public static volatile SingularAttribute<Enderecos, String> bairro;
    public static volatile SingularAttribute<Enderecos, Integer> cep;
    public static volatile SingularAttribute<Enderecos, String> ptref;
    public static volatile SingularAttribute<Enderecos, Cidades> cidadesIdcidades;

}