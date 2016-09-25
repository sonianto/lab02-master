package dam.isi.frsf.utn.edu.ar.lab02;

import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by pato on 20/09/2016.
 */
public class viewHolder {


        TextView nombre=null;
        CheckBox variacion=null;
    viewHolder(){}
    viewHolder(View base) {

            this.nombre = (TextView) base.findViewById(R.id.alimento);
            this.variacion = (CheckBox)
                    base.findViewById(R.id.checkBox);
            }

}
