class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        int count=0;
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
        int s=intervals[i][0];
        int e=intervals[i][1];
        if (end > s) {
    count++;
    end = Math.min(end, e);
} else {
    end = e;
}
        }
       return count;
    }
}
