package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewAlat;
    private AlatAdapter adapter;
    private List<AlatCamping> listAlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewAlat = findViewById(R.id.listViewAlat);

        // Menyiapkan 5 Data Alat Camping
        listAlat = new ArrayList<>();
        listAlat.add(new AlatCamping(
                "Tenda Dome Kapasitas 4 Person",
                "Rp 60.000 / Hari",
                "Tenda dome double layer waterproof, cocok untuk 4 orang. Dilengkapi pasak, tali, dan frame fiber yang kokoh serta tahan hujan deras.",
                R.drawable.tenda
        ));

        listAlat.add(new AlatCamping(
                "Carrier Eiger 60 Liter",
                "Rp 45.000 / Hari",
                "Tas gunung berkapasitas 60L dengan sistem backsystem ergonimitis yang nyaman untuk pendakian jarak jauh. Sudah termasuk raincover.",
                R.drawable.carrier
        ));

        listAlat.add(new AlatCamping(
                "Sleeping Bag Warm Comfort",
                "Rp 20.000 / Hari",
                "Kantong tidur dengan bahan polar tebal yang menjaga suhu tubuh tetap hangat di cuaca dingin pegunungan hingga 5 derajat celcius.",
                R.drawable.sleping_bag
        ));

        listAlat.add(new AlatCamping(
                "Kompor Mawar Portable",
                "Rp 25.000 / Hari",
                "Kompor kamping portable berukuran ringkas, menggunakan bahan bakar gas kaleng. Dilengkapi pemantik otomatis dan pelindung angin.",
                R.drawable.kompor
        ));

        listAlat.add(new AlatCamping(
                "Matras Foil Alumunium",
                "Rp 10.000 / Hari",
                "Matras lipat dengan lapisan alumunium foil untuk menahan dinginnya lantai/tanah secara efektif, ringan dan mudah dilipat.",
                R.drawable.matras
        ));

        adapter = new AlatAdapter(this, listAlat);
        listViewAlat.setAdapter(adapter);

        // Event Klik Item ListView -> Pindah ke Halaman 2 (DetailActivity)
        listViewAlat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlatCamping alatDipilih = listAlat.get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("DATA_ALAT", alatDipilih);
                startActivity(intent);
            }
        });
    }
}
