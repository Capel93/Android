package com.example.pruebarapidezperceptiva;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;


public class Ayuda extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ayuda);
		
	}

	public void PasarVolver(View v){
    	Intent seguent = new Intent(this,Principal.class);
    	startActivity(seguent);
    	
    }


}
