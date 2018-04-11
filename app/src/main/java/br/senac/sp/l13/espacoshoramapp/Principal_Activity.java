package br.senac.sp.l13.espacoshoramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);


    }

    public void area(View view) {
        Intent intent = new Intent(Principal_Activity.this,Area_Usuario_Activity.class);
        startActivity(intent);
    }

    public void agendamento(View view) {
        Intent intent = new Intent(Principal_Activity.this,Agendamento_Activity.class);
        startActivity(intent);
    }

    public void contato(View view) {
        Intent intent = new Intent(Principal_Activity.this,Contato_Activity.class);
        startActivity(intent);
    }

    public void tecnicas(View view) {
        Intent intent = new Intent(Principal_Activity.this,Tecnicas_Activity.class);
        startActivity(intent);
    }
}
