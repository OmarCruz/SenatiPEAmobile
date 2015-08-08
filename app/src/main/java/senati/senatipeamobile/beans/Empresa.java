package senati.senatipeamobile.beans;

/**
 * Created by Omar on 07/08/2015.
 */
public class Empresa {
    int idEmpresa, Imagen;
    String RazonSocial, Dirección;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

    public void setEmpresa ( String aDatos[] ) {
        idEmpresa = Integer.parseInt( aDatos[0] );
        RazonSocial = aDatos[1];
        Dirección = aDatos[2];
        Imagen = Integer.parseInt( aDatos[3] );
    }
}
