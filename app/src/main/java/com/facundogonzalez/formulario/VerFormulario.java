package com.facundogonzalez.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VerFormulario extends AppCompatActivity {

    TextView tvNombre;
    TextView tvFecha;
    TextView tvTelefono;
    TextView tvEmail;
    TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_formulario);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvFecha = (TextView)findViewById(R.id.tvFecha);
        tvTelefono = (TextView)findViewById(R.id.tvTelefono);
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvDescripcion = (TextView)findViewById(R.id.tvDescripcion);

        Bundle bundleName = getIntent().getExtras();
        Bundle bundleDate = getIntent().getExtras();
        Bundle bundlePhone = getIntent().getExtras();
        Bundle bundleEmail = getIntent().getExtras();
        Bundle bundleDescription = getIntent().getExtras();

        String datoNombre = bundleName.getString("InfoNombre").toString();
        String datoFecha = bundleDate.getString("InfoFecha".toString());
        String datoTelefono = bundlePhone.getString("InfoTelefono".toString());
        String datoEmail = bundleEmail.getString("InfoEmail".toString());
        String datoDescripcion = bundleDescription.getString("InfoDescripcion".toString());

        tvNombre.setText("Nombre completo: " + datoNombre);
        tvFecha.setText("Fecha de nacimiento: " + datoFecha);
        tvTelefono.setText("Telefono: " + datoTelefono);
        tvEmail.setText("E-mail: " + datoEmail);
        tvDescripcion.setText("Descripción: " + datoDescripcion);
    }

    public void onClick(View View){
        Intent myIntent=new Intent(VerFormulario.this,MainActivity.class);
        finish();
    }

}