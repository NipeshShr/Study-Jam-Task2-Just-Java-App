package com.example.android.just_java;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantityOfCapuccino=0;
    int quantityOfAmericano=0;
    int quantityOfEspresso=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String stringMessage="Rs."+(quantityOfEspresso*150+quantityOfAmericano*160+quantityOfCapuccino*170);
        displayMessage(stringMessage);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity1_text_view);
        quantityTextView.setText("" + number);

    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity2_text_view);
        quantityTextView.setText("" + number);
    }

    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity3_text_view);
        quantityTextView.setText("" + number);}
    /**
     * This method is called when the plus button of Capuccino is clicked.
     */
    public void incrementCapuccino(View view){

        quantityOfCapuccino++;
        display1(quantityOfCapuccino);
    }

    /**
     * This method is called when the minus button of Capuccino is clicked.
     */

    public void decrementCapuccino(View view){
        quantityOfCapuccino--;
        if(quantityOfCapuccino<0){
            quantityOfCapuccino=0;
        }
        display1(quantityOfCapuccino);
    }


    /**
     * This method is called when the minus button of Americano is clicked.
     */

    public void decrementAmericano(View view){
        quantityOfAmericano--;
        if(quantityOfAmericano<0){
            quantityOfAmericano=0;
        }
        display2(quantityOfAmericano);
    }

    public void incrementAmericano(View view){

        quantityOfAmericano++;
        display2(quantityOfAmericano);
    }

    /**
     * This method is called when the minus button of Espresso is clicked.
     */

    public void decrementEspresso(View view){
        quantityOfEspresso--;
        if(quantityOfEspresso<0){
            quantityOfEspresso=0;
        }
        display3(quantityOfEspresso);
    }
    public void incrementEspresso(View view){

        quantityOfEspresso++;
        display3(quantityOfEspresso);
    }

    /**
     * This method displays the given text on the screen.
     */
    public void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.grandTotal);
        priceTextView.setText(""+message);

        TextView qunatityOfCapuccinoTextView=(TextView)findViewById(R.id.capuccinoQuantity);
        qunatityOfCapuccinoTextView.setText(""+quantityOfCapuccino);
        TextView qunatityOfAmericanoTextView=(TextView)findViewById(R.id.americanoQuantity);
        qunatityOfAmericanoTextView.setText(""+quantityOfAmericano);
        TextView qunatityOfEspressoTextView=(TextView)findViewById(R.id.espressoQuantity);
        qunatityOfEspressoTextView.setText(""+quantityOfEspresso);


        TextView priceOfCapuccinoTextView= (TextView)findViewById(R.id.capuccinoTotal);
        if(quantityOfCapuccino<=0)
        {
            priceOfCapuccinoTextView.setText("-");
        }
        else
        {
            priceOfCapuccinoTextView.setText("Rs."+(170*quantityOfCapuccino));
        }


        TextView priceOfAmericanoTextView= (TextView)findViewById(R.id.americanoTotal);
        if(quantityOfAmericano<=0)
        {
            priceOfAmericanoTextView.setText("-");
        }
        else{
            priceOfAmericanoTextView.setText("Rs."+(160*quantityOfAmericano));
        }


        TextView priceOfEspressoTextView= (TextView)findViewById(R.id.espressoTotal);
        if(quantityOfEspresso<=0)
        {
            priceOfEspressoTextView.setText("-");
        }
        else{
            priceOfEspressoTextView.setText("Rs."+(150*quantityOfEspresso));
        }



        Button changeText=(Button)findViewById(R.id.buttonID);
        changeText.setText("Pay");
    }
}