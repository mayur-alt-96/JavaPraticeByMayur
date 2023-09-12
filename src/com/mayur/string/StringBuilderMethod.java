package com.mayur.string;

public class StringBuilderMethod {

	public static void main(String[] args) {

		StringBuilderMethod stringBuilderPrgm = new StringBuilderMethod();
		System.out.println(stringBuilderPrgm.appendData());

	}

	private String appendData() {

		StringBuilder builder = new StringBuilder("Nilesh");
		addingSpace(builder);
		builder.append("Chokte");
//		addingSpace(builder);
		return builder.toString();

	}

	private void addingSpace(StringBuilder builder) {
		builder.append("_");
		builder.append(" ");
	}
}
