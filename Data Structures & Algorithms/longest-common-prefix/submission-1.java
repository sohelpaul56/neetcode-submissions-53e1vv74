class Solution {
    public String longestCommonPrefix(String[] strs) {
    String ans=strs[0];
    for(int i=1;i<strs.length;i++){
        ans=common(ans,strs[i]);
    }
    return ans;
    }
    public String common(String s1,String s2){
     // StringBuilder sb=new StringBuilder();
     String sb="";
      int n=Math.min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb+=s1.charAt(i);
            }else
            
            break;
        }
       // return sb.toString();

       return sb;
    }
}