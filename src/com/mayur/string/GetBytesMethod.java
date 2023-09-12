package com.mayur.string;

public class GetBytesMethod {

	public static void main(String[] args) {
		
		String s1 ="Mayur Chokte";

		byte[] barr =s1.getBytes();
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
		
		byte[] bytes = s1.getBytes();
		for(int i =0 ;i<bytes.length;i++) {
			
			System.out.print(bytes[i]+" ");
		}
	
	}
}
