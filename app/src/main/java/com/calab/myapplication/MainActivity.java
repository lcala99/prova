package com.calab.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.MapView;

/**
 * This app displays an order form to order coffee.
 */


public class MainActivity extends AppCompatActivity {
    TextView quantityTextView;
    TextView valore;
    Button bottone;
    Button meno;
    Button order;
    MapView map;
    RecyclerView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        quantityTextView = (TextView) findViewById( R.id.quantity_text_view );
        bottone = (Button) findViewById( R.id.Buttonpiù );
        meno = (Button) findViewById( R.id.buttonmeno );
        order = (Button) findViewById( R.id.Button );
        valore = (TextView) findViewById( R.id.valore );


        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt( quantityTextView.getText().toString() );
                c++;
                String str = c + "";
                quantityTextView.setText( str );
            }
        };
        View.OnClickListener buttonMenoListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt( quantityTextView.getText().toString() );
                if (c > 0) {
                    c--;
                    String str = c + "";
                    quantityTextView.setText( str );
                }
            }
        };

        View.OnClickListener buttonOrderListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt( quantityTextView.getText().toString() );
                c = c * 10;
                String str = c + "";
                valore.setText( str );
            }
        };

        bottone.setOnClickListener( buttonListener );
        order.setOnClickListener( buttonOrderListener );
        meno.setOnClickListener( buttonMenoListener );



    }


}