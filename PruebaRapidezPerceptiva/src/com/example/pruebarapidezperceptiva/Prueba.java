package com.example.pruebarapidezperceptiva;


import java.util.ArrayList;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.graphics.Color;


public class Prueba extends Activity {

	private Integer criteri;
	/*private Integer count=0;
	private Integer limit=1;
	private String alias;*/
	//private Bundle info;
	private User user_prueba;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prueba);
		
		/*Bundle info = getIntent().getBundleExtra("info");
		this.limit = info.getInt("maxIntents");
		this.count = info.getInt("intent");
		this.alias = info.getString("alias");
		Log.d("info", "info = "+alias+" count ="+count+" limit="+limit);*/
		
		this.user_prueba = (User)getIntent().getParcelableExtra("user");
		
    	Log.d("Temps", user_prueba.toString());

		
		GridView grid= (GridView)findViewById(R.id.gridview);
		grid.setAdapter(new ButtonAdapter(this));
		criteri = (int) Math.floor(Math.random()*24);
		
		/*grid.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            if(position == criteri){
	            	Intent seguent = new Intent(this,Salir.class);
	            	startActivity(seguent);
	            }else{
	            	Intent seguent = new Intent(this,Prueba.class);
	            	startActivity(seguent);
	            }
	        }
	    });*/
	}
	 
	public class ButtonAdapter extends BaseAdapter {
		
		private Context mContext;
		private ArrayList<Integer> mNum = new ArrayList();
		public ButtonAdapter (Context c){
			mContext = c;
			
		}
	    public int getCount() {
	        return 25;
	    }
	    

	    public Object getItem(int position) {
	        return null;
	    }

	    public long getItemId(int position) {
	        return 0;
	    }
	    private String[] words={
	    		"a","b","c","d","e","f","g","h","i","j","k","l",
	    		"m","n","o","p","q","r","s","t","u","v","w","x",
	    		"y","z"
	    };
	    
	    public View getView(int position, View convertView, ViewGroup parent) {
	    	Button btn;
	    	if(convertView == null){
	 			btn = new Button(mContext);
	 			btn.setLayoutParams(new GridView.LayoutParams(50,50));
	 			btn.setPadding(8, 8, 8, 8);
	    	}else{
	    		btn =(Button) convertView;
	    	}
	    	
			
	    	btn.setTextColor(Color.BLACK);
	    	btn.setBackgroundResource(R.drawable.grayrectanglebutton);
	    	btn.setOnClickListener(new MyOnClickListener(position));  
	    	btn.setId(position);
	    
			//btn.setText(String.valueOf((int) (Math.random()*10)));
	    	//btn.setText(words[position]);
	    	
	    	if(position==criteri){
	    		Integer valorDado = (int) Math.floor(Math.random()*24);
		    	btn.setText(words[valorDado]);
	    	}else{
	    		btn.setText(String.valueOf((int) (Math.random()*10)));
	    	}
	    	
	    	return btn;
	    }
	   
	    class MyOnClickListener implements OnClickListener{
	    	private final int position;
	    	
	    	public MyOnClickListener(int position){
	    		this.position = position;
	    	}
	    	
			
			public void onClick(View v){
				someFuction(this.position);
				
			}


			private void someFuction(int position) {
				if(position == criteri && user_prueba.getIntent()<user_prueba.getMaxIntent()){
	            	Intent seguent = getIntent();
	            	/*count++;
	            	Bundle info = new Bundle();
	            	info.putInt("intent", count);
	            	info.putInt("maxIntents", limit);
	            	info.putString("alias", alias);
	            	seguent.putExtra("info", info);*/
	            	Log.d("Prova", "Contador: "+user_prueba.getIntent()+" Limit:"+user_prueba.getMaxIntent());
	            	
	            	user_prueba.setIntent(user_prueba.getIntent()+1);
	            	
	            	seguent.putExtra("user", user_prueba);
	            	
	            	startActivity(seguent);
	            }else{
	            	Intent seguent = new Intent(Prueba.this,Results.class);
	            	
	            	user_prueba.calcTime();
	            	Log.d("Temps", "Temps: "+user_prueba.getTime());
	            	seguent.putExtra("user", user_prueba);
	            	
	            	startActivity(seguent);
	            }
			}
			
	    }
	


}
	
}
