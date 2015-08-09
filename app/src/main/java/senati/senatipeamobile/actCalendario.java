package senati.senatipeamobile;


    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.Button;
    import android.widget.CalendarView;
    import android.widget.TextView;
    import android.widget.Toast;

    import senati.senatipeamobile.beans.Instructor;

public class actCalendario extends AppCompatActivity implements CalendarView.OnDateChangeListener, View.OnClickListener {
    Instructor instructor = new Instructor();
    TextView lblInstructor;
    Button btnSiguiente;
    CalendarView cviCalendario;
    int Dia, Mes, Año, idInstructor;
    String strInstructor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_calendario);

        lblInstructor = (TextView) findViewById( R.id.lblInstructor );
        cviCalendario = (CalendarView) findViewById( R.id.cviCalendario );
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        Bundle bundle = getIntent().getExtras();
        idInstructor = bundle.getInt( "idInstructor" );
        strInstructor = bundle.getString( "Instructor" );
        lblInstructor.setText("Instructor : " + strInstructor );
        cviCalendario.setOnDateChangeListener(this);
        btnSiguiente.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_calendario, menu);
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

    private void VerMensaje(String strMensaje) {
        Toast.makeText(this, strMensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
        Dia = dayOfMonth;
        Mes = month + 1;
        Año = year;
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        bundle.putString( "FechaVisita", "" + (Dia < 10 ? "0" : Dia) + "/" + (Mes < 10 ? "0" : Mes  ) +  "/" + "Año" );
        bundle.putString( "InstructorNombres", strInstructor );
        bundle.putInt( "idInstructor", idInstructor );
        Intent intent = new Intent( this, actListaEmpresas.class );
        intent.putExtras( bundle );
        v.getContext().startActivity( intent );
    }

}
