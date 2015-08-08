package senati.senatipeamobile;


    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.CalendarView;
    import android.widget.TextView;
    import android.widget.Toast;

    import senati.senatipeamobile.beans.Instructor;

public class actCalendario extends AppCompatActivity implements CalendarView.OnDateChangeListener, View.OnClickListener {
    Instructor instructor = new Instructor();
    TextView lblInstructor;
    CalendarView cviCalendario;
    int Dia, Mes, Año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_calendario);

        lblInstructor = (TextView) findViewById( R.id.lblInstructor );
        cviCalendario = (CalendarView) findViewById( R.id.cviCalendario );

        Bundle bundle = getIntent().getExtras();
        instructor.setInstructor(bundle.getStringArray("Instructor"));
        lblInstructor.setText("Instructor : " + instructor.getNombres());
        cviCalendario.setOnDateChangeListener(this);
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
        bundle.putInt( "Dia", Dia );
        bundle.putInt( "Mes", Mes );
        bundle.putInt( "Año", Año );
        Intent intent = new Intent( this, actListaEmpresas.class );
        intent.putExtras( bundle );
        v.getContext().startActivity( intent );
    }

}
