package com.example.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate", "entrou no oncreate");
        setContentView(R.layout.activity_main);
        editNome = (EditText) findViewById(R.id.editNome);
    }

    @Override
    protected void onStart() {
      super.onStart();
      Log.i("OnResume", "entrou no onResumo");
    }

    public void BtnMostrarClick(View view){
        Toast.makeText(this, "ola" + editNome.getText(),
        Toast.LENGTH_SHORT).show();
    }

}