class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

    if (intervals == null || intervals.size() == 0)
    return true;

        Collections.sort(intervals, (a, b) -> a.start - b.start);

        int s = intervals.get(0).start;
        int e = intervals.get(0).end;

        int n = intervals.size();

        for (int i = 1; i < n; i++) {

            int start = intervals.get(i).start;
            int end = intervals.get(i).end;

            if (e > start)
                return false;

            s = start;
            e = end;
        }
        return true;
    }
}