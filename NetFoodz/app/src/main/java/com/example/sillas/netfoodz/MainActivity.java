package com.example.sillas.netfoodz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cadastrese = (Button) findViewById(R.id.cadastrese);
    }
    public void ircadastrese(View view) {
        Intent it = new Intent(MainActivity.this, Cadastro.class);
        startActivity(it);
    }
}
