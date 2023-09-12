package com.capita.String;
public class StringMethodsPrgm {

	public static void main(String[] args) {
//
//		String str = "Mayur";
//		String str1 = "Nilesh";
//		String str2 = "java t point";

//		// lenght method 
//		System.out.println("Lenght of String is " + str.length());
//		System.out.println("Lenght of String is " + str1.length());
//		System.out.println("Lenght of String is " + str2.length());
//		
//		if(str2.length()>0) {
//			System.out.println("String is not empty and length is:"+str2.length());
//		}
//		str="";
//		if(str.length()==0) {
//			System.out.println("String is empty now:"+str.length());}
//		String str11 ="Welcome To JavaTpoint";
//		
//		int size = str11.length();
//		System.out.println("Reverse of the string:"+ "'" + str11 + "'" + "is");
//		for(int i = 0; i<size;i++) {
//			System.out.println(str11.charAt(str11.length()-i-1));
//		}
//
//		// contain method
//		if (str.contains("Mayur")) {
//			System.out.println("contain");
//		} else {
//			System.out.println("not contain");
//		}

//		// equals and equalIngoreCase
//		if ("mayur".equalsIgnoreCase(str)) {
//			System.out.println("Both string is same");
//		} else {
//			System.out.println("Both string is not same");
//		}
//
//		// concate
//		str = str.concat(" Chokte");
//		System.out.println("String after concatination " + str);
//
//		// CharAt
//		String name = "Mayur Chokte";
//		char ch = name.charAt(6);
//		System.out.println(ch);
//
//		// compareTo
//		String s1 = "hello";
//		String s2 = "hello";
//		String s3 = "meklo";
//		String s4 = "hemlo";
//		String s5 = "flag";
//
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareTo(s5));
//
//		// endwith
//		if (str1.endsWith("h")) {
//			System.out.println("end with values");
//		} else {
//			System.out.println("not end with values");
//		}
//
//		// trim
//		String sample = "     Nilesh chokte   ";
//		System.out.println(sample.trim().length());
//
//		// format()
////		String name1 = "mayur";
////		String sf1=String.format("name is %m",name1);
////		String sf2=String.format("name is %f",30.11);
////		String sf3=String.format("name is %30.11f",30.11);
////		
////		System.out.println(sf1);
////		System.out.println(sf2);
////		System.out.println(sf3);
//		
		// getbytes()
//		String s11 ="ABCDEFGHI";
//		String s12 ="abcdefgh";
//		byte[]barr=s12.getBytes();
//		byte[]bar=s12.getBytes();
//		for(int i=0;i<bar.length;i++) {
//			System.out.println(bar[i]);
//		}
//		
//		//Replace method()
//		String r1="javatpoint is a very good website";
//		String replaceString=r1.replace("very", "better");
//		System.out.println(replaceString);
//		
//		//ReplaceAll()
//		String s="My name is Khan. My name is Bob. My name is Sonoo.";  
//		String replaceString1=s.replaceAll("is","had");
//		System.out.println(replaceString1); 
//		
//		
//		//startsWith()
//		String ss1="java string split method by javatpoint";
//		System.out.println(ss1.startsWith("ja"));
//		System.out.println(ss1.startsWith("java string"));
//		System.out.println(ss1.startsWith("java String"));
//		
//		//split()
//		String s111 ="java string split method by javatpoint";
//		String[]words=s111.split("\\s");
//		for(String w:words) {
//			System.out.println(w);
//		}

//		String strSubString="NileshChkote         ";
//		System.out.println(strSubString.trim().substring(1));
//		System.out.println(strSubString.substring(1,8));

//		String name = "My name is mayur chokte from kurha and belong to amravati district";
//		String[] split = name.split("\\s");
//		int count =0;
//		for (String value : split) {
//			++count;
//		}
//		System.out.println("total count is "+count);

		// toUpperCase()
//	String s1="hello string";
//	String s1upper=s1.toUpperCase();
//	System.out.println(s1upper);
//	

		// toLowerCase()
//		String s1="HELLO STRING";
//		String s1lower=s1.toLowerCase();
//		System.out.println(s1lower);

		// isEmpty()
//		String s1="";
//		String s2="javatpoint";
//		String s3="M";
//		
//		System.out.println(s1.isEmpty());
//		System.out.println(s2.isEmpty());
//		System.out.println(s3.isEmpty());
//		
//		String s1 = "mayur chokte";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());

//		String camel = "nilesh chokte from kurha and district Amravati";
//
//		String[] split = camel.split("\\s");
//
//		StringBuffer stringBuffer = new StringBuffer();
//
//		int count = 1;
//		for (String value : split) {
//			for (char c : value.toCharArray()) {
//				if (count == 1) {
//					stringBuffer.append(Character.toUpperCase(c));
//				} else {
//					stringBuffer.append(Character.toLowerCase(c));
//				}
//				++count;
//			}
//			count = 1;
//			stringBuffer.append(" ");
//		}
//
//		System.out.println(stringBuffer.toString());
//
//		
//		// getbyte mean calculating ascii value of each character.
//		String s1="abcdef";  
//		byte[] barr=s1.getBytes();  
//		for(int i=0;i<barr.length;i++){  
//		System.out.println(barr[i]);  
//		}  
//		
//		
//		
//		int temp =0;
//		
//		temp =x ;
//		x= y;
//		y = temp;
//		
//		System.out.println(x + " and " + y);
//		
		// x= 20 and y=10
		// Swaping two number without using third one
//		int x=10;
//		int y=20;
//		
//		x = x + y;
//		y = x - y;
//		x = x - y;
//		System.out.println("The Value of is " + x + " and y is " + y);
//		

		// swapping two strings without using third one.
//		String s1 = "lexicography";
//		String s2 = "Alex Xander";
//
//		s1 = s1 + s2;
//		System.out.println("The total value is " + s1);
//
//		System.out.println("s1 is "+ s1.substring(s1.length()-s2.length()));
//		System.out.println("s2 is "+ s1.substring(0,s1.length()-s2.length()));
//			  	
//		

		String sampleString = "My name is nilesh chokte kurha from chodhood";

		String stringBuffer = makeOddUpperCase(sampleString);
		String stringBuffer1 = makeEvenUpperCase(sampleString);
		System.out.println(stringBuffer1);
		System.out.println("");
		System.out.println("");
		System.out.println(stringBuffer);
	}

	

	private static String makeEvenUpperCase(String sampleString) {
		String[] split = sampleString.split("\\s");
	 StringBuilder stringBuilder = new StringBuilder();

		int count =0;
		for (String values : split) {
			++count;
			if(count % 2 ==0) {
				stringBuilder.append(values.toUpperCase() + " ");
			}else {
				stringBuilder.append(values.toLowerCase() + " ");
			}
		}
		return stringBuilder.toString();
	}



	private static String makeOddUpperCase(String sampleString) {
		String[] split = sampleString.split("\\s");
		StringBuffer stringBuffer = new StringBuffer();

		int count =0;
		for (String values : split) {
			++count;
			if(count % 2 ==0) {
				stringBuffer.append(values.toLowerCase() + " ");
			}else {
				stringBuffer.append(values.toUpperCase() + " ");
			}
		}
		return stringBuffer.toString();
	}
}

//split
//substring- single parameter and double parameter.
//isempty.
//equals and equalsIgnoreCase
// lenght
// compareTo.