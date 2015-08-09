package senati.senatipeamobile.beans;

public class Distrito {
    int idDistrito;
    String Detalle;

    public Distrito(int idDistrito, String detalle) {
        this.idDistrito = idDistrito;
        Detalle = detalle;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public String getDetalle() {
        return Detalle;
    }
}
