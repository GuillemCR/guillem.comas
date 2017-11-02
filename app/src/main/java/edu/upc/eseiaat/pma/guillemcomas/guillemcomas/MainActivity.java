package edu.upc.eseiaat.pma.guillemcomas.guillemcomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String sNum;
    private TextView txt_dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_dia= (TextView) findViewById(R.id.txt_numDia);
        txt_dia.setText("12");
    }

    public void suma_1(View view) {
        sNum= txt_dia.getText().toString();
        int num= Integer.parseInt(sNum);
        num++;
        String final_num= String.valueOf(num);
        txt_dia.setText(final_num);
    }
}
