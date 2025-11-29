package com.example.opcionesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEjemplo = findViewById(R.id.txtEjemplo);

        // Registrar ContextMenu
        registerForContextMenu(txtEjemplo);
    }

    // ---------------- Opciones del OptionsMenu ----------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_inicio:
                Toast.makeText(this, "Inicio seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_configuracion:
                Toast.makeText(this, "Configuración seleccionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_salir:
                Toast.makeText(this, "Salir seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // ---------------- Opciones del ContextMenu ----------------
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_editar:
                Toast.makeText(this, "Editar seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.context_eliminar:
                Toast.makeText(this, "Eliminar seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
