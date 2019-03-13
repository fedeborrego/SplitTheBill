package com.zybooks.splitthebill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double TotalBill;
    int numberInParty;
    double TotalTip;
    double AmountPerPerson;
    String TotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText party = (EditText) findViewById(R.id.txtParty);
        final EditText bill = (EditText) findViewById(R.id.txtBill);
        final EditText tip = (EditText) findViewById(R.id.txtWaiter);
        final TextView result = ((TextView) findViewById(R.id.txtFinal));
        Button cost = (Button) findViewById(R.id.btnAmount);
        cost.setOnClickListener(new View.OnClickListener(){
            final TextView result = ((TextView)findViewById(R.id.txtFinal));
            @Override
            public void onClick(View v) {
                numberInParty = Integer.parseInt(party.getText().toString());
                TotalBill = Double.parseDouble(bill.getText().toString());
                TotalTip = Double.parseDouble(tip.getText().toString());
                AmountPerPerson = ((TotalBill+(TotalBill* (TotalTip/100))/numberInParty);
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                result.setText("Cost per Person is " +
                        currency.format(AmountPerPerson));
            }
        });


    }
}