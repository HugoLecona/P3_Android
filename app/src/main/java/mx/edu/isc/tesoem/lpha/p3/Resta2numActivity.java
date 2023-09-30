package mx.edu.isc.tesoem.lpha.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mx.edu.isc.tesoem.lpha.p3.R;

public class Resta2numActivity extends AppCompatActivity {

    EditText resta1, resta2;
    TextView lblresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta2num);

        resta1 = findViewById(R.id.txtnum1p4);
        resta2 = findViewById(R.id.txtnum2p4);
        lblresta = findViewById(R.id.lblrestap3);
    }

    public void calcularr (View v){

        int num3 = Integer.valueOf(resta1.getText().toString());
        int num4 = Integer.valueOf(resta2.getText().toString());

        lblresta.setText(String.valueOf(num3 - num4));
    }
}