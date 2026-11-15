13LC043_MultiplyStrings_Medium
class Solution {
    public String multiply(String num1, String num2) {

        int n = num1.length();
        int m = num2.length();

        int[] arr = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int mul = a * b + arr[i + j + 1];

                arr[i + j + 1] = mul % 10;
                arr[i + j] += mul / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int x : arr) {
            if (sb.length() > 0 || x != 0) {
                sb.append(x);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}