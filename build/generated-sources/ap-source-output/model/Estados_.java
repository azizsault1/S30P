package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cidades;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-06T14:14:21")
@StaticMetamodel(Estados.class)
public class Estados_ { 

    public static volatile SingularAttribute<Estados, String> uf;
    public static volatile CollectionAttribute<Estados, Cidades> cidadesCollection;
    public static volatile SingularAttribute<Estados, Integer> idestados;
    public static volatile SingularAttribute<Estados, String> nomee;

}