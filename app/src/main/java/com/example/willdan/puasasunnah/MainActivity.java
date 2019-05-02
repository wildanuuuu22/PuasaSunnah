package com.example.willdan.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //deklarasi
    ListView listpuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi

        listpuasa = findViewById(R.id.listpuasa);

        listpuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent seninKamis = new Intent(MainActivity.this, Detail.class);
                    seninKamis.putExtra("posisi", position);
                    seninKamis.putExtra("link", "http://www.almunawwar.net/manfaat-puasa-senin-kamis/");
                    startActivity(seninKamis);
                } else if (position == 1){
                    Intent daud = new Intent(MainActivity.this, Detail.class);
                    daud.putExtra("posisi", position);
                    daud.putExtra("linnk", "https://muslim.or.id/17877-puasa-daud-sebaik-baiknya-puasa.html");
                    startActivity(daud);
                } else if (position == 2) {
                    Intent arofah = new Intent(MainActivity.this, Detail.class);
                    arofah.putExtra("posisi", position);
                    arofah.putExtra("linnk", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(arofah);
                } else if (position == 3) {
                    Intent AsySyuro = new Intent(MainActivity.this, Detail.class);
                    AsySyuro.putExtra("posisi", position);
                    AsySyuro.putExtra("linnk", "https://muslim.or.id/23090-keutamaan-puasa-asyura-dan-sejarahnya.html");
                    startActivity(AsySyuro);
                } else if (position == 4) {
                    Intent bulanSyaban = new Intent(MainActivity.this, Detail.class);
                    bulanSyaban.putExtra("posisi", position);
                    bulanSyaban.putExtra("linnk", "https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(bulanSyaban);
                } else if (position == 5) {
                    Intent BulanSyawal = new Intent(MainActivity.this, Detail.class);
                    BulanSyawal.putExtra("posisi", position);
                    BulanSyawal.putExtra("linnk", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(BulanSyawal);
                } else if (position == 6) {
                    Intent ayyamulbidh = new Intent(MainActivity.this, Detail.class);
                    ayyamulbidh.putExtra("posisi", position);
                    ayyamulbidh.putExtra("linnk", "https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(ayyamulbidh);
                }
            }
        });
    }
}
