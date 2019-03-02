package main.java.util;

public class NumberUtils {

	/**
	 * 文字列をIntegerに変換する。
	 * 変換できなければnullを返す。
	 */
	public static Integer parseToInteger(String str) {
		try {
			return Integer.parseInt(str);
		} catch(Exception e) {
			return null;
		}
	}

	/** 
	 * 文字列をIntegerに変換する。
	 * 変換できなければ第二引数を返す。
	 */
	public static Integer parseToInteger(String str, Integer integer) {
		try {
			return Integer.parseInt(str);
		} catch(Exception e) {
			return integer;
		}
	}

	/** 
	 * 文字列をLongに変換する。
	 * 変換できなければnullを返す。
	 */
	public static Long parseToLong(String str) {
		try {
			return Long.parseLong(str);
		} catch(Exception e) {
			return null;
		}
	}

	/**
	 * 文字列をLongに変換する。
	 * 変換できなければ第二引数を返す。
	 */
	public static Long parseToLong(String str, Long l) {
		try {
			return Long.parseLong(str);
		} catch(Exception e) {
			return l;
		}
	}
}