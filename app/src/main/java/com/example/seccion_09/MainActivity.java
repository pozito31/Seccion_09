package com.example.seccion_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json =
                "{" +
                        "id: 0," +
                        "ciudades: [" +
                        "{" +
                        "id: 1," +
                        "name: 'Granada'" +
                        "}," +
                        "{" +
                        "id: 2," +
                        "name: 'Almeria'" +
                        "}]" +
                        "}";
        Gson gson = new GsonBuilder().create();
        Town town = gson.fromJson(json, Town.class);

    }
}