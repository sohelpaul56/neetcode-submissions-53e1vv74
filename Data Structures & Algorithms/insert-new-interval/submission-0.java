class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> ans = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            if (e < start) {
                ans.add(new int[]{s, e});
            }
            else if (s > end) {

                if (!inserted) {
                    ans.add(new int[]{start, end});
                    inserted = true;
                }

                ans.add(new int[]{s, e});
            }
            else {
                start = Math.min(start, s);
                end = Math.max(end, e);
            }
        }
        if (!inserted) {
            ans.add(new int[]{start, end});
        }

        return ans.toArray(new int[ans.size()][]);
    }
}