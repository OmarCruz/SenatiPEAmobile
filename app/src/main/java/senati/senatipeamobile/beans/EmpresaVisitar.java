package senati.senatipeamobile.beans;

public class EmpresaVisitar {
    Empresa _Empresa;
    Monitor _Monitor;
    Aprendiz _Aprendiz;

    public EmpresaVisitar(Empresa _Empresa, Monitor _Monitor, Aprendiz _Aprendiz) {
        this._Empresa = _Empresa;
        this._Monitor = _Monitor;
        this._Aprendiz = _Aprendiz;
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
}
