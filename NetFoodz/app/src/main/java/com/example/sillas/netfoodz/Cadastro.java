package com.example.sillas.netfoodz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button cadastrar = (Button) findViewById(R.id.cadastrese);
    }
    public void concluircadastro(View view) {
        Intent it = new Intent(Cadastro.this, MainActivity.class);
        startActivity(it);
        String mensagem = "Cadastro realizado com Sucesso";
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
}
