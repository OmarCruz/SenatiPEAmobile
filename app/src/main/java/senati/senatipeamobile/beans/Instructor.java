package senati.senatipeamobile.beans;

public class Instructor {
    int idInstructor, Eliminado;
    String DNI, ApellidoPaterno, ApellidoMaterno, NombreP, NombreS, Telefonos, Correo, Usuario, Contraseña;
    byte[] Imagen;

    public Instructor() {}

    public void setUsuario(String usuario) { Usuario = usuario; }
    public void setContraseña(String contraseña) { Contraseña = contraseña; }
    public void setImagen(byte[] imagen) { Imagen = imagen; }

    public int getIdInstructor() { return idInstructor; }
    public int getElimiando() { return Eliminado;  }
    public String getDNI() { return DNI; }
    public String getApellidoPaterno() { return ApellidoPaterno; }
    public String getApellidoMaterno() { return ApellidoMaterno; }
    public String getNombreP() { return NombreP;  }
    public String getNombreS() {
        return NombreS;
    }
    public String getTelefonos() {
        return Telefonos;
    }
    public String getCorreo() { return Correo; }
    public String getUsuario() { return Usuario; }
    public String getContraseña() { return Contraseña; }
    public byte[] getImagen() { return Imagen; }

    public void setInstructor ( String aDatos[] ) {
        idInstructor = Integer.parseInt( aDatos[0] );
        DNI = aDatos[1];
        ApellidoPaterno = aDatos[2];
        ApellidoMaterno = aDatos[3];
        NombreP = aDatos[4];
        NombreS = aDatos[5];
        Telefonos = aDatos[6];
        Correo = aDatos[7];
        Usuario = aDatos[8];
        Contraseña = aDatos[9];
        Eliminado = Integer.parseInt( aDatos[10] );
    }

    public String[] getInstructor () {
        return new String[] { "" + idInstructor, DNI, ApellidoPaterno, ApellidoMaterno, NombreP, NombreS, Telefonos, Correo, Usuario, Contraseña, "" + Eliminado };
    }

    @Override
    public String toString() {
        return ApellidoPaterno + " " + ApellidoMaterno + ", " + NombreP + " " + NombreS;
    }

    public String[] getCampos() {
        return new String[] {"idInstructor", "DNI", "ApellidoPaterno", "ApellidoMaterno", "NombreP", "NombreS", "Telefonos", "Correo", "Usuario", "Contraseña", "Eliminado" };
    }
}
