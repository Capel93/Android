package com.example.pruebarapidezperceptiva;


import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;



public class Log extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.resultados);
		
	}
	public void Valorlog(View v){
    	Intent seguent = new Intent(this,ValorLog.class);
    	startActivity(seguent);
    	
    }
	public void Repetir(View v){
    	Intent seguent = new Intent(this,Principal.class);
    	startActivity(seguent);
    	
    }
	


}
