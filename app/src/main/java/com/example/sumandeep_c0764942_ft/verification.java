package com.example.sumandeep_c0764942_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class verification extends AppCompatActivity {
    CheckBox checkBox;
    Button button;
    TextView textView;
    ImageView refresh;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;

    ArrayList<Integer> verified = new ArrayList<Integer>();
    ArrayList<Integer> notverified = new ArrayList<Integer>();
    ArrayList<String>Storedetail = new ArrayList<String>();

    int verifiedbox;
    int notverifiedbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        checkBox = findViewById(R.id.chkbox);
        button = findViewById(R.id.verify_btn);
        textView = findViewById(R.id.select_textview);
        refresh = findViewById(R.id.refresh);
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        imageView5 = findViewById(R.id.image5);
        imageView6 = findViewById(R.id.image6);
        imageView7 = findViewById(R.id.image7);
        imageView8 = findViewById(R.id.image8);
        imageView9 = findViewById(R.id.image9);

        verifiedbox = verified.size();
        notverifiedbox = notverified.size();


             checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                 @Override
                 public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                     if (!checkBox.isChecked()){
                         Toast.makeText(verification.this,"check the checkbox",Toast.LENGTH_LONG).show();
                     } else {
                         Toast.makeText(verification.this,"unchecked the checkbox",Toast.LENGTH_LONG).show();
                     }
                 }
             });

             button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (verified.size() < 4  || !checkBox.isChecked() || !notverified.isEmpty()){
                         new AlertDialog.Builder(verification.this).setTitle("Not verify").setPositiveButton("ok",new DialogInterface.OnClickListener(){
                             public void  onClick(DialogInterface dialog,int which){

                             }
                         }).show();
                         Toast.makeText(verification.this,"not verified" + verifiedbox + "and" + notverifiedbox,Toast.LENGTH_LONG).show();
                     }
                     else if (verified.size() == 4 && notverified.isEmpty() && checkBox.isChecked()){
                         new AlertDialog.Builder(verification.this).setTitle("verified").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 Intent intent = getIntent();
                                 String nametext = intent.getExtras().getString("name");
                                 String emailtext = intent.getExtras().getString("email");
                                 String phonetext = intent.getExtras().getString("phone");
                                 Storedetail.add(nametext);
                                 Storedetail.add(emailtext);
                                 Storedetail.add(phonetext);
                                 Intent i = new Intent(verification.this,MainActivity.class);
                                 startActivity(i);
                             }
                         }).show();
                         Toast.makeText(verification.this,"verified",Toast.LENGTH_LONG).show();
                     }
                    // openDialog();
                     Intent intent = new Intent(verification.this,MainActivity.class);
                     startActivity(intent);
                 }
             });

             refresh.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     imageView1.setImageResource(R.drawable.img1);
                     imageView2.setImageResource(R.drawable.img2);
                     imageView3.setImageResource(R.drawable.img3);
                     imageView4.setImageResource(R.drawable.img4);
                     imageView5.setImageResource(R.drawable.img5);
                     imageView6.setImageResource(R.drawable.img6);
                     imageView7.setImageResource(R.drawable.img7);
                     imageView8.setImageResource(R.drawable.img8);
                     imageView9.setImageResource(R.drawable.img9);
                 }
             });

    }

    public void changeSource(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img1);
        imageView.animate().alpha(0.5f);
        verified.add(1);
    }

    public void changeSource1(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img2);
        imageView.animate().alpha(0.5f);
        verified.add(2);
    }

    public void changeSource2(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img3);
        imageView.animate().alpha(0.5f);
        verified.add(3);
    }

    public void changeSource3(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img4);
        imageView.animate().alpha(0.5f);
        verified.add(4);
    }

    public void changeSource4(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img5);
        imageView.animate().alpha(0.5f);
        notverified.add(1);
    }

    public void changeSource5(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img6);
        imageView.animate().alpha(0.5f);
        notverified.add(2);
    }

    public void changeSource6(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img7);
        imageView.animate().alpha(0.5f);
        notverified.add(3);
    }

    public void changeSource7(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img8);
        imageView.animate().alpha(0.5f);
        notverified.add(4);
    }

    public void changeSource8(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.checked);
        imageView.setBackgroundResource(R.drawable.img9);
        imageView.animate().alpha(0.5f);
        notverified.add(5);
    }
}
