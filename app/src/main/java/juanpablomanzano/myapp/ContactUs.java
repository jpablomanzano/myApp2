package juanpablomanzano.myapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by juanpablomanzanomunoz on 30/04/16.
 */

public class ContactUs extends AppCompatActivity{
    int juego = 3;
    int dos =3;
    int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        resultado = juego + dos;

    }


}

