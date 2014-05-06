package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Enderecos;
import model.Estados;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T17:34:32")
@StaticMetamodel(Cidades.class)
public class Cidades_ { 

    public static volatile CollectionAttribute<Cidades, Enderecos> enderecosCollection;
    public static volatile SingularAttribute<Cidades, String> nome;
    public static volatile SingularAttribute<Cidades, Integer> idcidades;
    public static volatile SingularAttribute<Cidades, Estados> estadosIdestados;

}