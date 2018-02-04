package com.example.android.mfarhandany_1202150094_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView resto = (TextView) findViewById(R.id.txt_resto);
        TextView porsi = (TextView) findViewById(R.id.txt_jumlah2);
        TextView harga = (TextView) findViewById(R.id.txt_harga2);
        //menset nilai dari widget textview
        resto.setText(b.getCharSequence("resto"));
        porsi.setText(b.getCharSequence("jumlah"));
        harga.setText(b.getCharSequence("harga"));
    }
}
