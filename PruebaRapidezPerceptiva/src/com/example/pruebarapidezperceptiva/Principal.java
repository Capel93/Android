package com.example.pruebarapidezperceptiva;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Principal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	}

	public void PasarAyuda(View v){
    	Intent seguent = new Intent(this,Ayuda.class);
    	startActivity(seguent);
    	
    }
	public void PasarEmpezar(View v){
    	Intent seguent2 = new Intent(this,EmpezarActividad.class);
    	startActivity(seguent2);
    	
    }
	public void PasarSalir(View v){
		finish();
		
    	
    }

}
