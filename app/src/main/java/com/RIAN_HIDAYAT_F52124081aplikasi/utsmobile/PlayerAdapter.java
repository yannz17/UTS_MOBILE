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

public class PlayerAdapter extends ArrayAdapter<PlayerEsport> {

    private final Context context;
    private final List<PlayerEsport> listPlayer;

    public PlayerAdapter(@NonNull Context context, List<PlayerEsport> listPlayer) {
        super(context, 0, listPlayer);
        this.context = context;
        this.listPlayer = listPlayer;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.item_player_esport, parent, false);
        }

        PlayerEsport playerSaatIni = listPlayer.get(position);

        ImageView imgPlayer = listItem.findViewById(R.id.imgPlayer);
        TextView tvNama = listItem.findViewById(R.id.tvNamaPlayer);
        TextView tvRole = listItem.findViewById(R.id.tvRolePlayer);
        TextView tvDeskripsi = listItem.findViewById(R.id.tvDeskripsiPlayer);

        if (playerSaatIni != null) {
            imgPlayer.setImageResource(playerSaatIni.getFotoResId());
            tvNama.setText(playerSaatIni.getNama());
            tvRole.setText(playerSaatIni.getRole());
            tvDeskripsi.setText(playerSaatIni.getDeskripsi());
        }

        return listItem;
    }
}
