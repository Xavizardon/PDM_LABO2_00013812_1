package com.example.ejer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnClickListener {

    private Button btnclck;

    private TextView texto;

    private String aux;

    private EditText username, pssword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnclck = findViewById(R.id.botonazo);
        texto = findViewById(R.id.textito);
        username = findViewById(R.id.user_edit);
        pssword = findViewById(R.id.psswrd_edit);

        btnclck.setOnClickListener(this);
        btnclck.setOnLongClickListener(this);

    }


    @Override
    public boolean onLongClick(View v) {
        aux = pssword.getText().toString();
        texto.setText(aux);
        return true;
    }

    @Override
    public void onClick(View v) {
        aux = username.getText().toString();
        texto.setText(aux);
    }
}
