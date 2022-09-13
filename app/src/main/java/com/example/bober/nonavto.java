package com.example.bober;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nonavto extends AppCompatActivity {
    int k = 0;
    ImageView imageView;
    TextView textView;
Button button;
    public void next(){
n = false;
    }
    public void nexx(){
        n = true;
    }
    boolean n = true;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonavto);
        button = findViewById(R.id.next);
        imageView = findViewById(R.id.image1);
        textView = findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
                //2
                if (n == false && k == 0) {
                    imageView.setImageResource(R.drawable.ger);
                    textView.setText(R.string.discr2);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 1){
                    imageView.setImageResource(R.drawable.gor);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //3
                if (n == false && k == 2) {
                    imageView.setImageResource(R.drawable.third);
                    textView.setText(R.string.discr3);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 3){
                    imageView.setImageResource(R.drawable.thirdq);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //4
                if (n == false && k == 4) {
                    imageView.setImageResource(R.drawable.four);
                    textView.setText(R.string.discr4);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 5){
                    imageView.setImageResource(R.drawable.fourq);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //5
                if (n == false && k == 6) {
                    imageView.setImageResource(R.drawable.five);
                    textView.setText(R.string.discr5);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 7){
                    imageView.setImageResource(R.drawable.fiveq);
                    nexx();
                    k+=1;
                }
                if (n == false && k == 8) {
                    imageView.setImageResource(R.drawable.fivew);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //6
                if (n == false && k == 9){
                    imageView.setImageResource(R.drawable.six);
                    textView.setText(R.string.discr6);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 10) {
                    imageView.setImageResource(R.drawable.sixq);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //7
                if (n == false && k == 11){
                    imageView.setImageResource(R.drawable.seven);
                    textView.setText(R.string.discr7);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //8
                if (n == false && k == 12) {
                    imageView.setImageResource(R.drawable.eight);
                    textView.setText(R.string.discr8);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 13){
                    imageView.setImageResource(R.drawable.eightq);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //9
                if (n == false && k == 14) {
                    imageView.setImageResource(R.drawable.nine);
                    textView.setText(R.string.discr9);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 15){
                    imageView.setImageResource(R.drawable.nineq);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //10
                if (n == false && k == 16) {
                    imageView.setImageResource(R.drawable.ten);
                    textView.setText(R.string.discr10);
                    nexx();
                    k+=1;
                }
                //11
                if (n == false && k == 17){
                    imageView.setImageResource(R.drawable.eleven);
                    textView.setText(R.string.discr11);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");
                }
                if (n == false && k == 18) {
                    imageView.setImageResource(R.drawable.elevenq);
                    nexx();
                    k+=1;

                }
                if (n == false && k == 19){
                    imageView.setImageResource(R.drawable.elevenw);
                    nexx();
                    k+=1;
                }
                if (n == false && k == 20) {
                    imageView.setImageResource(R.drawable.elevene);
                    nexx();
                    k+=1;
                    button.setText("Следующий экспонат");
                }
                //12
                if (n == false && k == 21){
                    imageView.setImageResource(R.drawable.twelw);
                    textView.setText(R.string.discr12);
                    nexx();
                    k+=1;
                    button.setText("Следующее фото");

                }
                if (n == false && k == 22) {
                    imageView.setImageResource(R.drawable.twelwq);
                    nexx();
                    k+=1;
                    button.setText("Закончить экскурсию");
                }
                //finish
                if (n == false && k == 23){
                    startActivity (new Intent(nonavto.this, lists.class));
                    finish();
                }
    }});


    }
}