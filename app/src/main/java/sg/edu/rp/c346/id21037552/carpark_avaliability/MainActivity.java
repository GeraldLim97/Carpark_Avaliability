package sg.edu.rp.c346.id21037552.carpark_avaliability;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCarpark;
    AsyncHttpClient client;
    ArrayList<Carpark> alCarpark;
    CarparkAdapter aaCarpark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCarpark = findViewById(R.id.listViewCarpark);
        client = new AsyncHttpClient();
    }


}