class Solution {
    private int getval(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
        int val=getval(s.charAt(i));
        if(i < s.length()-1 && val < getval(s.charAt(i+1))){
                sum -= val;
            }else{
                sum += val;
            }
        }
        return sum;
    }
}