package senati.senatipeamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import senati.senatipeamobile.adapter.EmpresaVisitaAdapter;
import senati.senatipeamobile.beans.EmpresaVisitar;
import senati.senatipeamobile.dao.daoEmpresas;

public class actListaEmpresas extends AppCompatActivity implements View.OnClickListener {
    TextView lblFechaVisita;
    ListView lstEmpresas;
    ArrayList<EmpresaVisitar> aEmpresasVisitar;
    ArrayAdapter adaptador;
    String strFechaVisita, strInstructor;
    int idInstructor;
    daoEmpresas _daoEmpresas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lista_empresas);

        lblFechaVisita = (TextView) findViewById( R.id.lblFechaVisita );
        lstEmpresas = ( ListView ) findViewById( R.id.lstListaEmpresas );

        Bundle bundle = getIntent().getExtras();
        strFechaVisita = bundle.getString( "FechaVisita" );
        strInstructor = bundle.getString( "Instructor" );
        idInstructor = bundle.getInt("idInstructor");
        lblFechaVisita.setText( "Fecha de Visita : " + strFechaVisita);

        _daoEmpresas = new daoEmpresas(this);
        aEmpresasVisitar = _daoEmpresas.getEmpresasVisitar( idInstructor, strFechaVisita );

        adaptador = new EmpresaVisitaAdapter<EmpresaVisitar>(this, 0, aEmpresasVisitar);
        lstEmpresas.setAdapter(adaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_lista_empresas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent( this, actRealizarVisita.class );
        v.getContext().startActivity(intent);
    }

    private void VerMensaje(String strMensaje) {
        Toast.makeText(this, strMensaje, Toast.LENGTH_SHORT).show();
    }

}
