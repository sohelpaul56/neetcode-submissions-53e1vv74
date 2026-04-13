class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[26];
        int j=0;
        int maxfreq=0;
        int maxwindow=0;
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'A']++;
           maxfreq=Math.max(maxfreq,arr[s.charAt(i)-'A']);
           while(((i-j+1)-maxfreq)>k){
           arr[s.charAt(j)-'A']--;
           j++;
           }
           maxwindow=Math.max(maxwindow,i-j+1);
        }
        return maxwindow;
    }
}
