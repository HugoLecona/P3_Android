package mx.edu.isc.tesoem.lpha.p3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import mx.edu.isc.tesoem.lpha.p3.R;

public class MenuActivity extends AppCompatActivity {


    Button btnsumanump2, btnrestanump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnsumanump2 = findViewById(R.id.p2btnsuma);
        btnsumanump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(MenuActivity.this, Suma2numActivity.class);
                startActivity(lanza);
            }
        });

        btnrestanump2 = findViewById(R.id.p2btnresta);
        btnrestanump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(MenuActivity.this, Resta2numActivity.class);
                startActivity(lanza);
            }
        });



    }
}