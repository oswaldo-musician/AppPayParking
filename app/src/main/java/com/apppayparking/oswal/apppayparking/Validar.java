package com.apppayparking.oswal.apppayparking;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Validar extends Activity implements View.OnClickListener {

    Button botonvalidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);


    }

    @Override
    public void onClick(View v) {

        botonvalidar = (Button) findViewById(R.id.botonid);
        String login = ((EditText) findViewById(R.id.editText)).getText().toString();
        if (login.equals("1234")) {
            Intent intent = new Intent(Validar.this, MenuPrincipal.class);
            startActivity(intent);


        } else
          {
              Toast.makeText(getApplicationContext(),"Password incorrecto", Toast.LENGTH_SHORT).show();
          }




    }
}

