package com.SildWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Timer;

public class AckRec extends Thread{

	private Socket socket;
	private DateSend dateSend;
	private long timeout = 5000;
	
	public  AckRec(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			boolean ackIsRec = true;
			String ackLine;
			int i = 0,j = 0;
				while (ackIsRec) {
					Resend resend = new Resend(dateSend,j);
					Timer timer= new Timer(true);
					if (j != 10) {
						timer.schedule(resend, timeout);
					}
					BufferedReader ackReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					Thread.sleep(1000);
					ackLine = ackReader.readLine();
					System.out.println("receive--"+ackLine+"--"+i);
					i++;
					j++;
					if (i==8) {
						i = 0;
					}
//					if (ackLine.equals(null)) {
//						ackIsRec = false;
//					}
					
					timer.cancel();
				}
//			ackReader.close();
		} catch (Exception e) {
//			System.out.println("socket:"+socket);
			System.out.println(e);
		}
	}
	
	
}
