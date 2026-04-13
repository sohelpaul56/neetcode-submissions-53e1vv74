class Solution {
    public boolean isAnagram(String s, String t) {
    int m=s.length();
    int n=t.length();
    if(m!=n) return false;
    int[] arr1=new int[26];
    int[] arr2=new int[26];
    for(int i=0;i<m;i++){
        char c=s.charAt(i);
       arr1[c-'a']++;
    }
     for(int i=0;i<n;i++){
        char c=t.charAt(i);
       arr2[c-'a']++;
    }
    for(int j=0;j<26;j++){
        if(arr1[j]!=arr2[j]) return false;
    }
    return true;
    }
}
