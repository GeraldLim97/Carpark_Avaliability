package sg.edu.rp.c346.id21037552.carpark_avaliability;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


import java.util.ArrayList;

class CarparkAdapter extends ArrayAdapter<Carpark> {

    Context parent_context;
    int layout_id;
    ArrayList<Carpark> al;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        al = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tv = rowView.findViewById(R.id.textView);
        ImageView iv = rowView.findViewById(R.id.phoneTypeImageView);

        // Obtain the Android Version information based on the position
        Carpark currentWeather = al.get(position);

        // Set values to the TextView to display the corresponding information
        tv.setText(currentWeather.toString());
        if ((Carpark).getCarpark_info().contains("Fair")){
            Picasso.get().load("https://www.nea.gov.sg/assets/images/icons/weather-bg/FA.png").into(iv);
        } else if (currentWeather.getForecast().contains("Cloudy")){
            Picasso.get().load("https://www.nea.gov.sg/assets/images/icons/weather-bg/CL.png").into(iv);
        }


        return rowView;
    }
}
