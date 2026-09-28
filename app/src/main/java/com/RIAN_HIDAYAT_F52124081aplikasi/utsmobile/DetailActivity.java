package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgDetail;
    private TextView tvDetailNama, tvDetailHarga, tvDetailDeskripsi;
    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Inisialisasi View
        imgDetail = findViewById(R.id.imgDetail);
        tvDetailNama = findViewById(R.id.tvDetailNama);
        tvDetailHarga = findViewById(R.id.tvDetailHarga);
        tvDetailDeskripsi = findViewById(R.id.tvDetailDeskripsi);
        btnKembali = findViewById(R.id.btnKembali);

        // Menerima data dari Intent (Kompatibel untuk semua versi Android)
        AlatCamping alat;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            alat = getIntent().getSerializableExtra("DATA_ALAT", AlatCamping.class);
        } else {
            alat = (AlatCamping) getIntent().getSerializableExtra("DATA_ALAT");
        }

        if (alat != null) {
            imgDetail.setImageResource(alat.getFotoResId());
            tvDetailNama.setText(alat.getNama());
            tvDetailHarga.setText(alat.getHarga());
            tvDetailDeskripsi.setText(alat.getDeskripsi());
        }

        // Aksi Tombol Kembali ke Halaman Utama
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Menutup DetailActivity dan kembali ke MainActivity
            }
        });
    }
}