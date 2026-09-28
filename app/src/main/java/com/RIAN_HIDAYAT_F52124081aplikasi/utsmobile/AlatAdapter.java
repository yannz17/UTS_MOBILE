package com.RIAN_HIDAYAT_F52124081aplikasi.utsmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlatAdapter extends ArrayAdapter<AlatCamping> {

    private final Context context;
    private final List<AlatCamping> listAlat;

    public AlatAdapter(@NonNull Context context, List<AlatCamping> listAlat) {
        super(context, 0, listAlat);
        this.context = context;
        this.listAlat = listAlat;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.barang_alat_camping, parent, false);
        }

        AlatCamping alatSaatIni = listAlat.get(position);

        ImageView imgAlat = listItem.findViewById(R.id.imgAlat);
        TextView tvNama = listItem.findViewById(R.id.tvNamaAlat);
        TextView tvHarga = listItem.findViewById(R.id.tvHargaAlat);

        if (alatSaatIni != null) {
            imgAlat.setImageResource(alatSaatIni.getFotoResId());
            tvNama.setText(alatSaatIni.getNama());
            tvHarga.setText(alatSaatIni.getHarga());
        }

        return listItem;
    }
}
