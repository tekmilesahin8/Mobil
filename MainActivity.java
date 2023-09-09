package com.tekmile.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tekmile.toastmesaji.R;

public class MainActivity extends AppCompatActivity {


    Button btnSayfaIkiyeGit;
    Button btnSayfaUceGit;
    Button btnSayfaDordeGit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          btnSayfaIkiyeGit=findViewById(R.id.btn_GirisSayfasinaGit);
          btnSayfaUceGit=findViewById(R.id.btn_UyeOlSayfasinaGit);
          btnSayfaDordeGit=findViewById(R.id.btn_SifremiUnuttum);

          btnSayfaIkiyeGit.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  Intent sayfaIki=new Intent(MainActivity.this,MainActivity2.class);
                  startActivity(sayfaIki);

              }
          });

         btnSayfaUceGit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent sayfaUc=new Intent(MainActivity.this,MainActivity3.class);
                 startActivity(sayfaUc);
             }
         });

         btnSayfaDordeGit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent sayfaDort=new Intent(MainActivity.this,MainActivity4.class);
                 startActivity(sayfaDort);
             }
         });

    }
}