package mx.edu.isc.tesoem.lpha.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mx.edu.isc.tesoem.lpha.p3.R;

public class Suma2numActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    TextView lblres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma2num);

        txtnum1 = findViewById(R.id.txtnum1p3);
        txtnum2 = findViewById(R.id.txtnum2p3);
        lblres = findViewById(R.id.lblsumap3);

    }
    
    public void calcular(View v){

        int num1 = Integer.valueOf(txtnum1.getText().toString());
        int num2 = Integer.valueOf(txtnum2.getText().toString());

        lblres.setText(String.valueOf(num1 + num2));
    }
}