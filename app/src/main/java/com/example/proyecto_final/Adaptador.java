package com.example.proyecto_final;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    List<String> titles;
    List<Integer> images;
    List<String> urls;
    LayoutInflater inflater;

    public Adaptador(Context ctx, List<String> titles, List<Integer> images, List<String> urls) {
        this.titles = titles;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);
        this.urls = urls;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));

        // Agrega un OnClickListener para manejar el clic en el elemento
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtiene la posición del adaptador utilizando holder.getAdapterPosition()
                int adapterPosition = holder.getAdapterPosition();

                // Verifica si la posición es válida
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    // Obtiene la URL correspondiente a la posición actual
                    String url = getUrlForPosition(adapterPosition);

                    // Abre el nuevo activity con WebView
                    Intent intent = new Intent(view.getContext(), ViewUrlsActivity.class);
                    intent.putExtra("url", url);
                    view.getContext().startActivity(intent);
                }
            }
        });
    }

    // Método para obtener la URL según la posición
    private String getUrlForPosition(int position) {
        // Verifica si la posición está dentro del rango de la lista de imágenes
        if (position >= 0 && position < urls.size()) {
            // Obtiene la URL correspondiente a la posición actual
            String url = urls.get(position);

            // Imprime la URL en el registro de la consola para verificar
            Log.d("Adapter", "URL: " + url);

            return url;
        } else {
            // Devuelve una URL predeterminada o maneja la situación según tu lógica
            return "https://google.com";
        }
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView gridIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView2);
            gridIcon = itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Clicked -> " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
