package mx.edu.isc.tesoem.lpha.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import mx.edu.isc.tesoem.lpha.p3.R;

public class activity_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent lanza = new Intent(activity_principal.this, MenuActivity.class);
                startActivity(lanza);

                finish();
            }
        }, 4000);
    }
}