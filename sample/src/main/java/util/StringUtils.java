package main.java.util;

public class StringUtils {

	/**
	 * Integerを文字列に変換する。
	 * 変換できなければnullを返す。 
	 */
	public String toString(Integer integer) {
		try {
			return integer.toString();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Integerを文字列に変換する。
	 * 変換できなければ第2引数を返す。 
	 */
	public String toString(Integer integer, String str) {
		try {
			return integer.toString();
		} catch (Exception e) {
			return str;
		}
	}

	/**
	 * Longを文字列に変換する。
	 * 変換できなければnullを返す。 
	 */
	public String toString(Long l) {
		try {
			return l.toString();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Longを文字列に変換する。
	 * 変換できなければ第2引数を返す。 
	 */
	public String toString(Long l, String str) {
		try {
			return l.toString();
		} catch (Exception e) {
			return str;
		}
	}
}