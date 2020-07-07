package me.techbird.leetcode.recursion;

public class CountDigitOne {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(f(1999));
    }
    /**
     * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
     * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次
     * @param n
     * @return
     */
    public static int countDigitOne(int n) {
        if ( n <= 0 ) return 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String string = String.valueOf(i);
            if(string.contains("1")) {
                char[] array = string.toCharArray();
                for (int j = 0; j < array.length; j++) {
                    if(array[j] == '1') {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    //利用递归
    public static int f(int n) {
        if ( n <= 0 ) return 0;
        String string = String.valueOf(n);
        int high = string.charAt(0)-'0';
        int pow = (int)Math.pow(10, string.length()-1);
        int last = n-high*pow;
        System.out.println(high+"-"+pow+"-"+last);
        if (high == 1) {
            return f(pow-1) + last + 1 + f(last);
        } else {
            return pow + high*f(pow-1) + f(last);
        }
    }
}