package senati.senatipeamobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class actLogin extends AppCompatActivity implements View.OnClickListener {
    EditText txtUsuario, txtContraseña;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_login);

        txtUsuario = (EditText) findViewById( R.id.txtUsuario );
        txtContraseña = (EditText) findViewById( R.id.txtContraseña );
        btnIngresar = ( Button ) findViewById( R.id.btnIngresar );
        btnIngresar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_login, menu);
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
        String strUsuario = txtUsuario.getText().toString();
        String strContraseña = txtContraseña.getText().toString();
        if ( true ) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("Instructor", new String[]{"1", "Espinoza", "Manrique", "Omar", "Ali"});
            Intent intent = new Intent( this, actCalendario.class );
            intent.putExtras(bundle);
            v.getContext().startActivity(intent);
        }
    }

    private void VerMensaje(String strMensaje) {
        Toast.makeText( this, strMensaje, Toast.LENGTH_SHORT ).show();
    }

}
