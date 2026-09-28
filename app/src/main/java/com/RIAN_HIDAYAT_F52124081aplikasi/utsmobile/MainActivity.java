package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewPlayer;
    private PlayerAdapter adapter;
    private List<PlayerEsport> listPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPlayer = findViewById(R.id.listViewPlayer);

        // Menyiapkan Data Player Esport sesuai Gambar di res/drawable
        listPlayer = new ArrayList<>();
        listPlayer.add(new PlayerEsport(
                "Rian",
                "Captain / Jungler",
                "Pemain Roster Utama PEMBURU Esport, dengan wr 100%",
                R.drawable.rian
        ));

        listPlayer.add(new PlayerEsport(
                "Wahyu",
                "EXP Laner",
                "Pemain Roster Utama PEMBURU Esport, EXP terjago dirumahnya",
                R.drawable.wahyu
        ));

        listPlayer.add(new PlayerEsport(
                "Dhika",
                "Mid Laner",
                "Pemain Roster Utama PEMBURU Esport, manusia yang sangat tidak masuk di akal",
                R.drawable.dhika
        ));

        listPlayer.add(new PlayerEsport(
                "Dadi",
                "Gold Laner",
                "Pemain Roster Utama PEMBURU Esport, manusia biasa saja",
                R.drawable.dadi
        ));

        listPlayer.add(new PlayerEsport(
                "Dawai",
                "Roamer",
                "Pemain Roster Utama PEMBURU Esport, manusia lose treak",
                R.drawable.dawai
        ));

        listPlayer.add(new PlayerEsport(
                "Saadah",
                "Coach & Manager",
                "Pelatih Utama PEMBURU Esport, pemain dengan tangan satu",
                R.drawable.saadah
        ));

        adapter = new PlayerAdapter(this, listPlayer);
        listViewPlayer.setAdapter(adapter);

        // Event Klik Item ListView Player
        listViewPlayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PlayerEsport playerDipilih = listPlayer.get(position);
                Toast.makeText(MainActivity.this, "Player: " + playerDipilih.getNama() + " (" + playerDipilih.getRole() + ")", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
