package com.example.pruebarapidezperceptiva;


import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;



public class EmpezarActividad extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.empezar);
		
	}
	
	public void PasarPrueba(View v){
    	Intent seguent = new Intent(this,Prueba.class);
    	
    	EditText edit1 = (EditText)findViewById(R.id.edittext);
		EditText edit2 = (EditText)findViewById(R.id.edittext2);
		String alias = edit2.getText().toString();
		String intents = edit1.getText().toString();
		
		/*Bundle info = new Bundle();
		//Log.d("alias", alias);
		//Log.d("maxintents", intents);
		info.putString("alias", alias);
		Log.d("alias", alias);
		info.putInt("maxIntents", Integer.valueOf(intents));
		info.putInt("intent",1);
    	seguent.putExtra("info", info);*/
    	
    	User user = new User(alias, Integer.valueOf(intents));
    	seguent.putExtra("user", user);
    	Log.d("ANTERIOR", "Intents intro: "+intents);
    	startActivity(seguent);
    }



}
