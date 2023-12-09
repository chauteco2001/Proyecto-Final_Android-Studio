package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los EditText
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    // Método para el botón de inicio de sesión
    public void login(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (isValidCredentials(username, password)) {
            Intent siguiente = new Intent(this, PdfsActivity.class);
            startActivity(siguiente);
        } else {
            // Credenciales inválidas, mostrar un mensaje de error
            Toast.makeText(this, "Nombre de usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isValidCredentials(String username, String password) {


        // Ejemplo: Usuario: admin, Contraseña: 1234
        return username.equals("admin") && password.equals("1234");
    }
}
