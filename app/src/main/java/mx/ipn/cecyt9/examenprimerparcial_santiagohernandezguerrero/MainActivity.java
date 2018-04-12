package mx.ipn.cecyt9.examenprimerparcial_santiagohernandezguerrero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText usuario, contresena;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.nombre);
        contresena = findViewById(R.id.password);





    }

    public void validar(View v){

        String usr= usuario.getText().toString();
        String psw= contresena.getText().toString();
        if (usr.equals("Santiago") && psw.equals("123456")){
            //Llama segunda vista
            Toast.makeText(this, "Usuario Válido", Toast.LENGTH_SHORT ).show();
            Intent ventana =  new Intent (MainActivity.this, Main2Activity.class);
            startActivity(ventana);
        }
        else{
            //Llama Error
            Toast.makeText(this, "Usuario Inválido", Toast.LENGTH_SHORT ).show();
        }
    }

}
