package mx.ipn.cecyt9.examenprimerparcial_santiagohernandezguerrero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String usr= (findViewById(R.id.nombre)).toString();
        String psw= (findViewById(R.id.password)).toString();

        if (usr== "Santiago" && psw=="123456"){
            
        }

    }

}
