package com.tatsuyaoiw.docker;

public class Main {
	public static void main(String[] args) {
		String str = "ATS";
		if (args.length > 0) {
			str = args[0];
		}
		System.out.printf("Hello %s!", str);
	}
}
