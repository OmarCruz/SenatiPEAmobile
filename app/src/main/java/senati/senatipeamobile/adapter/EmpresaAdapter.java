package senati.senatipeamobile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import senati.senatipeamobile.beans.Empresa;

public class EmpresaAdapter<T> extends ArrayAdapter<T> {

    public EmpresaAdapter(Context context, int resource, ArrayList<T> aLista) {
        super(context, resource, aLista);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate( android.R.layout.two_line_list_item, parent, false);
        }

        //Obteniendo instancias de los elementos
        TextView titulo = (TextView) listItemView.findViewById( android.R.id.text1 );
        TextView subtitulo = (TextView) listItemView.findViewById( android.R.id.text2);
        //ImageView categoria = (ImageView) listItemView.findViewById(R.id.category);

        //Obteniendo instancia de la Tarea en la posición actual
        Empresa item = (Empresa) getItem(position);

        //titulo.setText( item.getRazonSocial() );
        //subtitulo.setText( item.getDirección() );
        //categoria.setImageResource(item.getCategoria());

        //Devolver al ListView la fila creada
        return listItemView;
    }
}