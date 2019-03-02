package main.java.util;

public class NumberUtils {

	/** 
	 * �������Integer�ɕϊ����܂��B
	 * �ϊ��ł���ΐ������A�ł��Ȃ����null��Ԃ��܂��B
	 */
	public Integer parseToIntegerElseNull(String str) {
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException | NullPointerException e) {
			return null;
		}
	}

	/** 
	 * �������Integer�ɕϊ����܂��B
	 * �ϊ��ł���ΐ������A�ł��Ȃ���Α�2������Ԃ��܂��B
	 */
	public Integer parseToInteger(String str, Integer integer) {
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException | NullPointerException e) {
			return integer;
		}
	}

	/** 
	 * �������Long�ɕϊ����܂��B
	 * �ϊ��ł���ΐ������A�ł��Ȃ����null��Ԃ��܂��B
	 */
	public Long parseToLongElseNull(String str) {
		try {
			return Long.parseLong(str);
		} catch(NumberFormatException | NullPointerException e) {
			return null;
		}
	}

	/** 
	 * �������Long�ɕϊ����܂��B
	 * �ϊ��ł���ΐ������A�ł��Ȃ���Α�2������Ԃ��܂��B
	 */
	public Long parseToLong(String str, Long l) {
		try {
			return Long.parseLong(str);
		} catch(NumberFormatException | NullPointerException e) {
			return l;
		}
	}
}