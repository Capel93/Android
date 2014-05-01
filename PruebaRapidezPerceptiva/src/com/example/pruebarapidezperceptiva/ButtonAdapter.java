package com.example.pruebarapidezperceptiva;


import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;



public class ButtonAdapter extends BaseAdapter {

		private Context mContext;
		public ButtonAdapter (Context c){
			mContext = c;
		}
	    public int getCount() {
	        return 0;
	    }
	    

	    public Object getItem(int position) {
	        return null;
	    }

	    public long getItemId(int position) {
	        return 0;
	    }
	    public String[] numblist = {   
	    		"1",
	    		"2",
	    		"3asdf",
	    		"4dfasdafdaf0",
	    		"adsfafsa"
	    		
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
	    	//btn.setOnClickListener((android.view.View.OnClickListener) new MyOnClickListener(position));  
	    	btn.setId(position);
	    	btn.setText(numblist[position]);
	    	return btn;
	    }
	 
	    
	    class MyOnClickListener implements OnClickListener{
	    	private final int position;
	    	
	    	public MyOnClickListener(int position){
	    		this.position = position;
	    	}
	    	
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
			
	    }


}
