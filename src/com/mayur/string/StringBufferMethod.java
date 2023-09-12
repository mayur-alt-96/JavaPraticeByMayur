package com.mayur.string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBufferMethod Stringbuffer = new StringBufferMethod();
		System.out.println(Stringbuffer.appendData(null));
	}

	private String appendData(String string) {
		StringBuffer buffer = new StringBuffer("Mayur");
		addingSpace(buffer);
		buffer.append("Chokte");
		return buffer.toString();
	}
	private void addingSpace(StringBuffer buffer) {
		buffer.append("/");
		buffer.append("_");
		buffer.append(" /");
	}

}
