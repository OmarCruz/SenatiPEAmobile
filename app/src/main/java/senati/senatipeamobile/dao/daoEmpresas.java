package senati.senatipeamobile.dao;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import senati.senatipeamobile.bd.clsBD;
import senati.senatipeamobile.beans.EmpresaVisitar;

public class daoEmpresas {
    clsBD _clsBD;

    public daoEmpresas( AppCompatActivity actividad) {
        _clsBD = new clsBD(actividad,"SenatiETI.sqlite", null, 1);
    }

    public ArrayList<EmpresaVisitar> getEmpresasVisitar(int idInstructor, String strFechaVisita) {
        String strSQL = "select E.idEmpresa, E.RazonSocial, E.Direccion, D.Detalle, " +
            "CV.idMonitor, M.ApellidoPaterno, M.ApellidoMaterno, M.NombreP, M.NombreS, " +
            "A.idAprendiz, A.ApellidoPaterno, A.ApellidoMaterno, A.NombreP, A.NombreS, CV.FechaVisita, CV.HoraVisita " +
            "from CronogramaVisitas CV, Empresas E, Distritos D, Monitores M, Aprendices A " +
            "where E.idEmpresa = CV.idEmpresa and D.idDistrito = E.idDistrito and M.idMonitor = CV.idMonitor " +
            "and A.idAprendiz = CV.idAprendiz and CV.idInstructor = '" + idInstructor + "' and CV.FechaVisita = '" + strFechaVisita + "'";

        _clsBD.SentenciaSQL( strSQL );
        String[][] Visitas = _clsBD.getRegistros();
        ArrayList<EmpresaVisitar> aEmpresasVisitar = new ArrayList<EmpresaVisitar>();
        if ( Visitas != null )
            for ( String[] visita : Visitas )
                aEmpresasVisitar.add ( new EmpresaVisitar( visita ));
        return aEmpresasVisitar;
    }
}
