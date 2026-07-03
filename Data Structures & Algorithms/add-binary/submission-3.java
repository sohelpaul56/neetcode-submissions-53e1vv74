class Solution {
    public String addBinary(String a, String b) {
        int x = a.length();
        int y = b.length();

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while (x > 0 || y > 0 || carry != 0) {

            int bitA = 0;
            int bitB = 0;

            if (x > 0) {
                bitA = a.charAt(x - 1) - '0';
                x--;
            }

            if (y > 0) {
                bitB = b.charAt(y - 1) - '0';
                y--;
            }

            int sum = bitA + bitB + carry;

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}