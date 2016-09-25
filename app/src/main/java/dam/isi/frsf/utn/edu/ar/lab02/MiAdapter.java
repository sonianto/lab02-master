package dam.isi.frsf.utn.edu.ar.lab02;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by pato on 20/09/2016.
 */
public class MiAdapter extends ArrayAdapter<ElementoMenu> {
    //List<ElementoMenu> items6;
   // Context contex6t;
    LayoutInflater inflater;
    MiAdapter(Context context, List<ElementoMenu> items) {
        super(context, R.layout.row1, items);
         inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder holder = null;

    if (convertView == null) {

        convertView = inflater.inflate(R.layout.row1, null);

        holder = new viewHolder();
        holder.nombre = (TextView) convertView.findViewById(R.id.alimento);
        holder.variacion = (CheckBox) convertView.findViewById(R.id.checkBox);
        convertView.setTag(holder);

        holder.variacion.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v ;
                ElementoMenu country = (ElementoMenu) cb.getTag();

                country.selected=(cb.isChecked());
            }
        });
    }
    else {
        holder = (viewHolder) convertView.getTag();
    }

    ElementoMenu country = getItem(position);
    holder.nombre.setText(country.toString());
    holder.variacion.setChecked(country.selected);

    holder.variacion.setTag(country);

    return convertView;

}
public void clearData(){


}

    }

