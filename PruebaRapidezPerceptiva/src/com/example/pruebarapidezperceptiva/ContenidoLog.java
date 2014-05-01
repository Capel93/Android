package com.example.pruebarapidezperceptiva;


import java.util.Date;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;



public class ContenidoLog extends Activity {
	private User user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contenido_log);
		this.user = (User)getIntent().getParcelableExtra("user");
		
		//Falla aqui --->
		EditText email = (EditText) findViewById(R.id.dat_email);
		email.setText(user.getUserName()+"@gmail.com");
		
		EditText dat = (EditText) findViewById(R.id.dat_log);
		Date d = new Date();
		dat.setText("Log -"+d.toGMTString());
		
		EditText log = (EditText) findViewById(R.id.data_v);
		log.setText(user.toString());
		//Fi del Fallo
		Button btnSend = (Button) findViewById(R.id.send);
		btnSend.setOnClickListener(new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	
		    	EditText email = (EditText) findViewById(R.id.dat_email);
		    	email.setText(user.getUserName()+"@gmail.com");
		    	EditText log = (EditText) findViewById(R.id.dat_log);
				log.setText(user.toString());
				EditText log2 = (EditText) findViewById(R.id.data_v);
				log2.setText(user.toString());
				
		    	Intent itSend = new Intent(android.content.Intent.ACTION_SEND);
		    	itSend.setType("plain/text");
		    	itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ email.getText().toString()});
		    	itSend.putExtra(android.content.Intent.EXTRA_SUBJECT,log.getText());
		    	itSend.putExtra(android.content.Intent.EXTRA_TEXT, log2.getText());
		    	startActivity(itSend);
		    }
		});
	}
	public void Discard(View v){
    	Intent seguent = new Intent(this,Principal.class);
    	startActivity(seguent);
    	
    }
	


}
