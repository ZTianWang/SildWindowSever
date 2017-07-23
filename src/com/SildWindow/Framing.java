package com.SildWindow;

public class Framing {

//	private String str=null;
	
	public StringBuffer ZeroBitInput(String str){
//		this.str=str;
		StringBuffer strb=new StringBuffer(str);
		char[] b=new char[strb.length()];
		int count=0;
		for(int i=1;i<str.length();i++){
			b[i]=str.charAt(i);
		    if(b[i]=='1'){
		    	count++;
		    	if(count==5){
		    		strb.insert(i+1, "0");
//		    		System.out.println(strb);
		    	}
		    }
		    else{
		    	count=0;
		    }
		}
		return strb;
	}
	
    
    public static void main(String[] args) {
//    	System.out.println(string);
	}
    
}
