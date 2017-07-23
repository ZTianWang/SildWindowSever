package com.SildWindow;

import java.io.PrintWriter;
import java.net.Socket;

public class DateSend extends Thread{
	
	private Socket socket;
	private int i;
	
	public DateSend(Socket socket){
		this.socket = socket;
	}
	
	public void geti(int i) {
		this.i = i;
	}
	
	public void run(){
//		boolean dateBegainSend = true;
		try {
			PrintWriter dateWriter = new PrintWriter(socket.getOutputStream());
			int m=0,j = 0;
			String str = "����������������" ;
			String binStr = "";
			StringBuffer zeroBitStr;
			char[] strChar=str.toCharArray();
			Framing framing = new Framing();
			for(int i=0;i<str.length();i++)	
			{
				binStr = Integer.toBinaryString(strChar[i]);
				zeroBitStr = framing.ZeroBitInput(j+binStr);
//				if (j == 3 && m == 0) {
//					zeroBitStr = new StringBuffer(j+"111111000");
//					m = 1;
//				}
//				dateWriter.println("Date"+i);
				dateWriter.println(zeroBitStr);
				dateWriter.flush();
				System.out.println("send--Date" + j+"--"+zeroBitStr+"--"+strChar[i]);
				
				j++;
				Thread.sleep(1000);
				if (j == 8) {
					j = 0;
				}
//				if (j == 10) {
//					break;
//				}
			}
//			dateWriter.close();
//			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}