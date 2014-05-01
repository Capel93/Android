package com.example.pruebarapidezperceptiva;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{
	private String userName;
	private int intent;
	private int maxIntents;
	private long init;
	private long fin;
	//private boolean finished=false;
	//private int mData;
	
	public User(String UserName,int maxIntents){
		this.userName = UserName;
		this.maxIntents = maxIntents;
		Date time = new Date();
		this.init = time.getTime();
		this.intent = 1;
	}
	
	private User(Parcel in) {
         //mData = in.readInt();         
         intent = in.readInt();
         maxIntents = in.readInt();
         init = in.readLong();
         fin = in.readLong();
         userName = in.readString();


    }
	
	public static final Parcelable.Creator<User> CREATOR
    = new Parcelable.Creator<User>() {
		public User createFromParcel(Parcel in) {
			return new User(in);
		}

		public User[] newArray(int size) {
			return new User[size];
		}
	};
	
	public String toString(){
		return "Name:"+userName+" Intent: "+intent+" MaxIntents: "+maxIntents;
	}
	public void setIntent(int intent){
		this.intent=intent;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public int getIntent(){
		return this.intent;
	}
	public int getMaxIntent(){
		return this.maxIntents;
	}

	/*public boolean getFinished(){
		return finished;
	}*/
	
	public long getFin(){
		return fin;
		
	}
	public void calcTime(){
		Date time = new Date();
		fin = time.getTime()-init;
	}
	
	public String getTime(){
		return "Seconds = "+fin*1000;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		//dest.writeInt(mData);
		dest.writeInt(intent);
		dest.writeInt(maxIntents);
		dest.writeLong(init);
		dest.writeLong(fin);
		dest.writeString(userName);
	}
}
