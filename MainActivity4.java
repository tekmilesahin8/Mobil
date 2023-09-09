package com.tekmile.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tekmile.toastmesaji.R;

public class MainActivity4 extends AppCompatActivity {

    TextView txtBilgiler;

    Button btn_YeniSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

      btn_YeniSifre=findViewById(R.id.btnYeniSifre);
      txtBilgiler=findViewById(R.id.txtBilgiler);

      Intent veriAl=getIntent();

      String alinanAd=veriAl.getStringExtra("Ad-Soyad");
      String alinanDogumtarihi=veriAl.getStringExtra("Dogum Tarihi");
      String alinanDogumyeri=veriAl.getStringExtra("Dogum Yeri");
      String alinanCinsiyet=veriAl.getStringExtra("Cinsiyeti");

      txtBilgiler.setText(alinanAd+alinanDogumtarihi+alinanDogumyeri+alinanCinsiyet);


      btn_YeniSifre.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              String [] email = {"tekmilesahin8@gmail.com"};
              String konu;
              String mesaj;
              sendMail (email,  konu="ÜYE GİRİŞ BİLGİSİ",mesaj="YENİ ŞİFRENİZ:1234");

          }
      });

        }
    private void sendMail(String[] eMail,String konu,String mesaj){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(intent.EXTRA_EMAIL,eMail);

        intent.putExtra(intent.EXTRA_SUBJECT,konu);
        intent.putExtra(intent.EXTRA_TEXT,mesaj);

        intent.setType("message/rfc822");
        startActivity(intent);
    }


}