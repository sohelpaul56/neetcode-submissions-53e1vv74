class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int x=str1.length();
        int y=str2.length();
        if(!(str1+str2).equals(str2+str1)) return "";
        return str2.substring(0,gcd(x,y));
    }
    private int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}