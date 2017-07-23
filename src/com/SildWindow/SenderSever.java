package com.SildWindow;

import java.net.Socket;

public class SenderSever {
	
	private long timeout = 5000;
	
	public long getTimeout(){
		return timeout;
	}
	
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	
	public static void main(String[] args){
		try {
			Socket recSocket = new Socket("localhost",8866);
			DateSend dateSend = new DateSend(recSocket);
			AckRec ackRec = new AckRec(recSocket);
			dateSend.start();
			ackRec.start();
		} catch (Exception e) {
			System.out.println("建立连接失败:"+e);
		}
	}
	
}

