package senati.senatipeamobile.beans;

/**
 * Created by Omar on 06/08/2015.
 */
public class Instructor {
    int idInstructor;
    String ApellidoPaterno, ApellidoMaterno, NombreP, NombreS, Usuario, Contraseña;

    public Instructor() {}
    public Instructor(int idInstructor, String apellidoPaterno, String apellidoMaterno, String nombreP, String nombreS, String Usuario, String Contraseña) {
        this.idInstructor = idInstructor;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        NombreP = nombreP;
        NombreS = nombreS;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

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

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
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
