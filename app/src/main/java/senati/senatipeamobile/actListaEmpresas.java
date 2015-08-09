package senati.senatipeamobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class actListaEmpresas extends AppCompatActivity implements View.OnClickListener {
    TextView lblFechaVisita;
    String strFechaVisita;
    private String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_lista_empresas);

        lblFechaVisita = (TextView) findViewById( R.id.lblFechaVisita );
        Bundle bundle = getIntent().getExtras();
        strFechaVisita = getFecha(bundle);
        lblFechaVisita.setText( strFechaVisita );
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
        v.getContext().startActivity( intent );
    }

    private void VerMensaje(String strMensaje) {
        Toast.makeText(this, strMensaje, Toast.LENGTH_SHORT).show();
    }

    public String getFecha(Bundle bundle) {
        int Dia = bundle.getInt("Dia");
        int Mes = bundle.getInt("Mes");

        return "" + ( Dia < 10 ? "0" : Dia  ) +  "/" + ( Mes < 10 ? "0" : Mes  ) +  "/" + bundle.getInt("Año");
    }
}
