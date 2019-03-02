package main.java;

import main.java.util.NumberUtils;
import main.java.util.StringUtils;

public class Main {

	public static void main(String[] args) {
		System.out.println(NumberUtils.class);
		System.out.println(StringUtils.toString(3l, null));
		System.out.println(NumberUtils.parseToLong("3"));
	}
}