package com.example.android.venessavisintry_1202150247_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    // untuk deklarasi objek
    TextView tv_makanan, tv_harga;
    ImageView iv_photo;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent(); // mengambil data dari activity sebeleumnya
        String makanan = intent.getStringExtra("makanan");
        Integer harga = intent.getIntExtra("harga",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+harga+photo);

        tv_makanan = (TextView)findViewById(R.id.tv_detailFood);
        tv_harga = (TextView)findViewById(R.id.tv_detailPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto);

        tv_makanan.setText(makanan);
        tv_harga.setText("Rp. "+harga);
        iv_photo.setImageResource(photo);
    }
}
