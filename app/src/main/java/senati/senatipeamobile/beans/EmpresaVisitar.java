package senati.senatipeamobile.beans;

public class EmpresaVisitar {
    Empresa _Empresa;
    Monitor _Monitor;
    Aprendiz _Aprendiz;
    String FechaVisita, HoraVisita;

    public EmpresaVisitar(Empresa _Empresa, Monitor _Monitor, Aprendiz _Aprendiz, String FechaVisita, String HoraVisita) {
        this._Empresa = _Empresa;
        this._Monitor = _Monitor;
        this._Aprendiz = _Aprendiz;
        this.FechaVisita = FechaVisita;
        this.HoraVisita = HoraVisita;
    }

    public EmpresaVisitar( String[] visita ) {
        _Empresa = new Empresa( Integer.parseInt( visita[0] ), visita[1], visita[2], visita[3] );
        _Monitor = new Monitor( Integer.parseInt( visita[4] ), visita[5], visita[6], visita[7], visita[8] );
        _Aprendiz = new Aprendiz( Integer.parseInt( visita[9] ), visita[10], visita[11], visita[12], visita[13] );
        FechaVisita = visita[14];
        HoraVisita = visita[15];
    }

    public Empresa get_Empresa() {
        return _Empresa;
    }

    public Monitor get_Monitor() {
        return _Monitor;
    }

    public Aprendiz get_Aprendiz() {
        return _Aprendiz;
    }

    public String getFechaVisita() {
        return FechaVisita;
    }

    public String getHoraVisita() {
        return HoraVisita;
    }
}
