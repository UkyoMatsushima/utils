package main.java.util;

public class NumberUtils {

	/** 
	 * 文字列をIntegerに変換します。
	 * 変換できれば整数を、できなければnullを返します。
	 */
	public Integer parseToIntegerElseNull(String str) {
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException | NullPointerException e) {
			return null;
		}
	}

	/** 
	 * 文字列をIntegerに変換します。
	 * 変換できれば整数を、できなければ第2引数を返します。
	 */
	public Integer parseToInteger(String str, Integer integer) {
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException | NullPointerException e) {
			return integer;
		}
	}

	/** 
	 * 文字列をLongに変換します。
	 * 変換できれば整数を、できなければnullを返します。
	 */
	public Long parseToLongElseNull(String str) {
		try {
			return Long.parseLong(str);
		} catch(NumberFormatException | NullPointerException e) {
			return null;
		}
	}

	/** 
	 * 文字列をLongに変換します。
	 * 変換できれば整数を、できなければ第2引数を返します。
	 */
	public Long parseToLong(String str, Long l) {
		try {
			return Long.parseLong(str);
		} catch(NumberFormatException | NullPointerException e) {
			return l;
		}
	}
}