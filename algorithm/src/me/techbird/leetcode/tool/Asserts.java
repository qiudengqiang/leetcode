package me.techbird.leetcode.tool;

public class Asserts {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("test no passed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
