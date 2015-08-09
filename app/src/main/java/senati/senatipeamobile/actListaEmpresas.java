package senati.senatipeamobile;

import android.content.DialogInterface;
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

import senati.senatipeamobile.adapter.EmpresaAdapter;
import senati.senatipeamobile.beans.Empresa;
import senati.senatipeamobile.dao.daoInstructor;

public class actListaEmpresas extends AppCompatActivity implements View.OnClickListener {
    TextView lblFechaVisita;
    ListView lstEmpresas;
    ArrayList<Empresa> aEmpresas;
    ArrayAdapter adaptador;
    daoInstructor _daoInstructor;
    String strFechaVisita, strInstructor;
    int idInstructor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lista_empresas);
        _daoInstructor = new daoInstructor(this);


        lblFechaVisita = (TextView) findViewById( R.id.lblFechaVisita );
        lstEmpresas = ( ListView ) findViewById( R.id.lstListaEmpresas );
        adaptador = new EmpresaAdapter<Empresa>(this, 0, aEmpresas);
        lstEmpresas.setAdapter( adaptador );

        Bundle bundle = getIntent().getExtras();
        strFechaVisita = bundle.getString( "FechaVisita" );
        strInstructor = bundle.getString( "Instructor" );
        idInstructor = bundle.getInt( "idInstructor" );
        lblFechaVisita.setText(strFechaVisita);
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
