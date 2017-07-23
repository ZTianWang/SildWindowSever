package com.SildWindow;

public class ChangStr {

	//将字符串转换成二进制字符串，以空格相隔
    public String StrToBinstr(String str) {
        char strChar=str.charAt(0);
//        System.out.println(strChar);
//        String result="";
        String binStr = "";
//        Framing framing = new Framing();
//        StringBuffer strb;
//        for(int i=0;i<strChar.length;i++){
        binStr =Integer.toBinaryString(strChar);
//        	strb = framing.ZeroBitInput(binStr);
//            result = binStr;
//            System.out.println(binStr+"--"+result);
//        }
        return binStr;
    }
    
    public static void main(String[] args) {
    	String st = "缕";
    	String binsString ;
    	StringBuffer strb ;
		ChangStr changStr = new ChangStr();
		binsString = changStr.StrToBinstr(st);
		Framing framing = new Framing();
		strb = framing.ZeroBitInput(binsString);
		System.out.println(strb+"--"+binsString);
		
	}
}
