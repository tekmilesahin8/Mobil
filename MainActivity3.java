package com.tekmile.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tekmile.toastmesaji.R;

public class MainActivity3 extends AppCompatActivity {

    EditText gsKullaniciAdi=findViewById(R.id.editTextText);
    EditText gsSifre=findViewById(R.id.editTextText5);
    Button girisyapma=findViewById(R.id.btnGirisYap);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        girisyapma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gskullaniciadiText=gsKullaniciAdi.toString();
                String  gssifreText=gsSifre.toString();

                if(gskullaniciadiText.equals("admin")&&gssifreText.equals("123")){
                    Toast.makeText(MainActivity3.this,"GİRİŞ BAŞARILI..",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity3.this,"KULLANICI ADI VEYA ŞİFRE HATALI..",Toast.LENGTH_LONG).show();
                }

            }
        });
    }


}