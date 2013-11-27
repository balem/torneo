package py.edu.ucsa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-11-26T21:16:31")
@StaticMetamodel(Torneo.class)
public class Torneo_ { 

    public static volatile SingularAttribute<Torneo, Integer> id;
    public static volatile SingularAttribute<Torneo, String> nombre;
    public static volatile SingularAttribute<Torneo, Integer> nroEquipos;
    public static volatile SingularAttribute<Torneo, Date> fehcaInicio;
    public static volatile SingularAttribute<Torneo, Date> fechaFin;
    public static volatile SingularAttribute<Torneo, Integer> anho;

}