package senati.senatipeamobile.beans;

public class Aprendiz {
    int idAprendiz;
    String DNI, ApellidoPaterno, ApellidoMaterno, NombreP, NombreS;

    public Aprendiz(int idAprendiz, String DNI, String apellidoPaterno, String apellidoMaterno, String nombreP, String nombreS) {
        this.idAprendiz = idAprendiz;
        this.DNI = DNI;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        NombreP = nombreP;
        NombreS = nombreS;
    }

    public int getIdAprendiz() {
        return idAprendiz;
    }

    public String getDNI() {
        return DNI;
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

    public void setAprendiz ( String aDatos[] ) {
        idAprendiz = Integer.parseInt( aDatos[0] );
        DNI = aDatos[1];
        ApellidoPaterno = aDatos[2];
        ApellidoMaterno = aDatos[3];
        NombreP = aDatos[4];
        NombreS = aDatos[5];
    }
}
