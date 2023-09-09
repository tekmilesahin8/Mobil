package com.tekmile.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.tekmile.toastmesaji.R;

public class MainActivity2 extends AppCompatActivity {

    Button uyeolmabutonu=findViewById(R.id.btn_UyelOl);
     EditText adsoyad=findViewById(R.id.editTextText4);
     EditText dogumtarihi=findViewById(R.id.editTextText8);
     Spinner dogumyeri=findViewById(R.id.spinner);

     EditText sifre=findViewById(R.id.editTextText10);
     EditText email=findViewById(R.id.editTextText11);
     RadioGroup cinsiyet=findViewById(R.id.radio_Cİnsiyet);
     RadioButton erkek=findViewById(R.id.radioButton4);
     String selectedText=erkek.getText().toString();
     RadioButton kadin=findViewById(R.id.radioButton3);
     String getSelectedText=kadin.getText().toString();


     Button btnGonder=findViewById(R.id.btn_UyelOl);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String adtexti=adsoyad.getText().toString();
                String dtarihitexti=dogumtarihi.getText().toString();
                String dyeritexti=dogumyeri.getSelectedItem().toString();
                int selectedId=cinsiyet.getCheckedRadioButtonId();



                Intent git=new Intent(MainActivity2.this,MainActivity4.class);

                git.putExtra("Ad-Soyad",adtexti);
                git.putExtra("Dogum Tarihi",dtarihitexti);
                git.putExtra("Dogum Yeri",dyeritexti);
                git.putExtra("Cinsiyeti",selectedId);
                startActivity(git);
            }
        });


    }

    public void uyeolmabutonu(View view){
        String adtexti=adsoyad.toString();
        String dtarihitexti=dogumtarihi.toString();
        String dyeritexti=dogumyeri.toString();
        String sifretexti=sifre.toString();
        String mailtexti=email.toString();



        int selectedId=cinsiyet.getCheckedRadioButtonId();



        if(adtexti.isEmpty() || dtarihitexti.isEmpty() || dyeritexti.isEmpty() || sifretexti.isEmpty() || mailtexti.isEmpty() ||selectedId==-1){
            Toast.makeText(MainActivity2.this, "BOŞ ALAN BULUNAMAZ HEPSİNİ DOLDURUNUZ.. ",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity2.this,"UYGULAMAMIZA HOŞGELDİNİZ..",Toast.LENGTH_LONG).show();
        }
    }


}