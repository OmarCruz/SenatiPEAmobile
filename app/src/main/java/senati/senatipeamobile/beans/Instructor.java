package senati.senatipeamobile.beans;

/**
 * Created by Omar on 06/08/2015.
 */
public class Instructor {
    int idInstructor;
    String ApellidoPaterno, ApellidoMaterno, NombreP, NombreS;

    public int getIdInstructor() {
        return idInstructor;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getNombreP() {
        return NombreP;
    }

    public String getNombreS() {
        return NombreS;
    }

    public String getNombres() {
        return ApellidoPaterno + " " + ApellidoMaterno + ", " + NombreP + " " + NombreS;
    }

    public void setInstructor ( String aDatos[] ) {
        idInstructor = Integer.parseInt( aDatos[0] );
        ApellidoPaterno = aDatos[1];
        ApellidoMaterno = aDatos[2];
        NombreP = aDatos[3];
        NombreS = aDatos[4];
    }
}
