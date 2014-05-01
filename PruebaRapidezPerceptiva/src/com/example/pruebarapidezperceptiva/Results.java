package com.example.pruebarapidezperceptiva;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Results extends Activity{
	private User user;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultados);
		this.user = (User)getIntent().getParcelableExtra("user");
		Log.d("SI", user.toString());
		
		EditText dat = (EditText) findViewById(R.id.datos_data);
		Date d = new Date();
		dat.setText(d.toGMTString());
		
		EditText log = (EditText) findViewById(R.id.datos_log);
		log.setText(user.toString());
		
		EditText email = (EditText) findViewById(R.id.datos_email);
		email.setText(user.getUserName()+"@gmail.com");
		
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
