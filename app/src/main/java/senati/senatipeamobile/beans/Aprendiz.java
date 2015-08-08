package senati.senatipeamobile.beans;

/**
 * Created by Omar on 07/08/2015.
 */
public class Aprendiz {
    int idAprendiz, Imagen;
    String ApellidoPaterno, ApellidoMaterno, NombreP, NombreS, HoraCita, GPS;

    public Aprendiz(int idAprendiz, String apellidoPaterno, String apellidoMaterno, String nombreP, String nombreS, String horaCita, String GPS, int imagen) {
        this.idAprendiz = idAprendiz;
        Imagen = imagen;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        NombreP = nombreP;
        NombreS = nombreS;
        HoraCita = horaCita;
        this.GPS = GPS;
    }

    public int getIdAprendiz() {
        return idAprendiz;
    }

    public void setIdAprendiz(int idAprendiz) {
        this.idAprendiz = idAprendiz;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }

    public String getNombreS() {
        return NombreS;
    }

    public void setNombreS(String nombreS) {
        NombreS = nombreS;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String horaCita) {
        HoraCita = horaCita;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    public void setAprendiz ( String aDatos[] ) {
        idAprendiz = Integer.parseInt( aDatos[0] );
        ApellidoPaterno = aDatos[1];
        ApellidoMaterno = aDatos[2];
        NombreP = aDatos[3];
        NombreS = aDatos[4];
        HoraCita = aDatos[5];
        GPS = aDatos[6];
        Imagen = Integer.parseInt( aDatos[7] );
    }
}
