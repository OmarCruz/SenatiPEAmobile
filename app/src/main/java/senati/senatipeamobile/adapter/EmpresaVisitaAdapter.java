package senati.senatipeamobile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import senati.senatipeamobile.beans.Empresa;
import senati.senatipeamobile.beans.EmpresaVisitar;

public class EmpresaVisitaAdapter<T> extends ArrayAdapter<T> {

    public EmpresaVisitaAdapter(Context context, int resource, ArrayList<T> aLista) {
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
        TextView txtEmpresa = (TextView) listItemView.findViewById( android.R.id.text1 );
        TextView txtAprendiz = (TextView) listItemView.findViewById( android.R.id.text2 );
        //ImageView categoria = (ImageView) listItemView.findViewById(R.id.category);

        //Obteniendo instancia de la Tarea en la posición actual
        EmpresaVisitar item = (EmpresaVisitar) getItem(position);

        txtEmpresa.setText( item.get_Empresa().getRazonSocial() );
        txtAprendiz.setText( item.get_Aprendiz().toString() );
        //categoria.setImageResource(item.getCategoria());

        //Devolver al ListView la fila creada
        return listItemView;
    }
}