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

import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class actLogin extends AppCompatActivity implements View.OnClickListener {
    EditText txtUsuario, txtContraseña;
    Button btnIngresar;

    private static String URL_LOGIN_USUARIO = "https://dam-atlas-asterope1.c9.io/app_usuarios/login?";
    private static String USUARIO = "pStrLogin=";
    private static String CONTRASEÑA = "pStrPwd=";

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

            //bundle.putStringArray("Instructor", new String[]{"1", "Espinoza", "Manrique", "Omar", "Ali"});

            LoginUsuario(URL_LOGIN_USUARIO + USUARIO + strUsuario + "&" + CONTRASEÑA + strContraseña);

            //Intent intent = new Intent( this, actCalendario.class );
            //intent.putExtras(bundle);
            //v.getContext().startActivity(intent);
        }
    }

    private void VerMensaje(String strMensaje) {
        Toast.makeText( this, strMensaje, Toast.LENGTH_SHORT ).show();
    }

    private void LoginUsuario(String searchLoginUsuario) {
        System.out.println("URL = " + searchLoginUsuario);
        JsonObjectRequest jsonRequest = new JsonObjectRequest(
                Request.Method.GET, searchLoginUsuario, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                // the response is already constructed as a JSONObject!
                try {
                    //books.clear();
                    int resultsCount = response.getInt("numFound");
                    JSONArray resultsArray = response.getJSONArray("docs");

                    System.out.println("Results: " + resultsCount);

                    int limit = resultsCount > 10 ? 10 : resultsCount;

                    for (int position = 0; position < limit; position++) {
                        JSONObject result = resultsArray.getJSONObject(position);

                        String login = result.getString("login");
                        System.out.println("login = " + login);

                        String name = result.getString("name");
                        System.out.println("name = " + name);

                        String supervisor_id = result.getString("supervisor_id");
                        System.out.println("supervisor_id = " + name);

                        //String key = result.getString("key");
                        //Long coverId = result.optLong("cover_i");
                        //System.out.println("cover_i = " + coverId);
                        //Boolean hasFullText = result.getBoolean("has_fulltext");
                        //int firstPublishYear = result.optInt("first_publish_year");
                        //int editionCount = result.getInt("edition_count");

                        //JSONArray authorNames = result.optJSONArray("author_name");
                        //JSONArray authorKeys = result.optJSONArray("author_key");
                        //int authorsCount = authorNames == null ? 0 : authorNames.length();
                        //ArrayList<Author> authors = new ArrayList<>();
                        //for (int authorPosition = 0; authorPosition < authorsCount; authorPosition++) {
                        //Author author = new Author(authorKeys.getString(authorPosition), authorNames.getString(authorPosition));
                        //authors.add(author);
                        //System.out.println("Author name = " + author.getName());
                        //}

                        //Cover cover = new Cover(
                        //COVERS_SEARCH_URL + coverId + "-S.jpg",
                        //COVERS_SEARCH_URL + coverId + "-M.jpg",
                        //COVERS_SEARCH_URL + coverId + "-L.jpg"
                        //);

                        //Book book = new Book(key, coverId, hasFullText, title, authors, cover, firstPublishYear, editionCount);
                        //books.add(book);
                        //System.out.println("Book title = " + book.getTitle());
                    }

                    //System.out.println("searchTitles: Array Size " + Integer.toString(books.size()));

                    //if (books.size() > 0) {
                     //   Intent intent = new Intent(actLogin.this, BookCatalogActivity.class);
                     //   startActivity(intent);
                    //}


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }
        );
        Volley.newRequestQueue(this).add(jsonRequest);
    }



}
