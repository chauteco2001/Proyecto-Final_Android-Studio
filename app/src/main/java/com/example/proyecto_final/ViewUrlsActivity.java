package com.example.proyecto_final;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewUrlsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewurls);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("url")) {
            String url = intent.getStringExtra("url");

            if (isPDFUrl(url)) {
                // Si la URL es un enlace a un PDF, abrirlo con una intención del sistema
                openPDFUsingIntent(url);
            } else {
                // Si no es un enlace a un PDF, cargar la URL en WebView
                loadUrlInWebView(url);
            }
        }
    }

    private boolean isPDFUrl(String url) {
        // Agrega lógica para determinar si la URL es un enlace a un PDF
        return url.toLowerCase().endsWith(".pdf");
    }

    private void openPDFUsingIntent(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(url), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No se encontró una aplicación para abrir archivos PDF", Toast.LENGTH_SHORT).show();
        }
        finish(); // Cierra la actividad actual después de iniciar la intención
    }

    private void loadUrlInWebView(String url) {
        WebView webView = findViewById(R.id.webView);

        // Agrega un WebViewClient para manejar la carga de la página y los errores
        webView.setWebViewClient(new WebViewClient() {
        });

        // Habilita JavaScript para páginas que lo requieran
        webView.getSettings().setJavaScriptEnabled(true);

        // Carga la URL en el WebView
        webView.loadUrl(url);
    }
}

