package senati.senatipeamobile.beans;

public class Empresa {
    int idEmpresa;
    String RazonSocial, TelefonoFijo, TelefonoMovil, Direccion, Mapa;
    Distrito _Distrito = new Distrito();

    public Empresa(int idEmpresa, String razonSocial, String telefonoFijo, String telefonoMovil, String direccion, String mapa, Distrito _Distrito) {
        this.idEmpresa = idEmpresa;
        RazonSocial = razonSocial;
        TelefonoFijo = telefonoFijo;
        TelefonoMovil = telefonoMovil;
        Direccion = direccion;
        Mapa = mapa;
        this._Distrito = _Distrito;
    }

    public Empresa( int idEmpresa, String RazonSocial, String Direccion, String DetalleDistrito) {
        this.idEmpresa = idEmpresa;
        this.RazonSocial = RazonSocial;
        this.Direccion = Direccion;
        this._Distrito.Detalle = DetalleDistrito;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public String getTelefonoFijo() {
        return TelefonoFijo;
    }

    public String getTelefonoMovil() {
        return TelefonoMovil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getMapa() {
        return Mapa;
    }

    public Distrito get_Distrito() {
        return _Distrito;
    }

}
