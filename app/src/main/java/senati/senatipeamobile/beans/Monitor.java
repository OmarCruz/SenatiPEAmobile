package senati.senatipeamobile.beans;

public class Monitor {
    int idMonitor, idEmpresa;
    String DNI, ApellidoPaterno, ApellidoMaterno, NombreP, NombreS, Telefonos, Correo, Cargo;

    public Monitor(int idMonitor, int idEmpresa, String DNI, String apellidoPaterno, String apellidoMaterno, String nombreP, String nombreS, String telefonos, String correo, String cargo) {
        this.idMonitor = idMonitor;
        this.idEmpresa = idEmpresa;
        this.DNI = DNI;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        NombreP = nombreP;
        NombreS = nombreS;
        Telefonos = telefonos;
        Correo = correo;
        Cargo = cargo;
    }

    public Monitor(int idMonitor, String ApellidoPaterno, String ApellidoMaterno, String NombreP, String NombreS) {
        this.idMonitor = idMonitor;
        this.ApellidoMaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.NombreP = NombreP;
        this.NombreS = NombreS;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public int getIdEmpresa() {
        return idEmpresa;
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

    public String getTelefonos() {
        return Telefonos;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCargo() {
        return Cargo;
    }

    @Override
    public String toString() { return ApellidoPaterno + " " + ApellidoMaterno + " " +  NombreP + " " + NombreS; }
}
