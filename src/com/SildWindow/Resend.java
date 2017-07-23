package com.SildWindow;

import java.util.TimerTask;



public class Resend extends TimerTask{

	private DateSend dateSend;
	
	private int i;
	boolean ackIsRec = true;
	
	public  Resend(DateSend dateSend,int i) {
		this.dateSend = dateSend;
		this.i = i;
	}
	
	public void run() {
		dateSend.geti(i);
//		dateSend.geti(3);
	}
	
}
