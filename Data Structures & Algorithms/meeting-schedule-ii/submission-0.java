class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    if(intervals.size()==0 || intervals==null) return 0;
    Collections.sort(intervals,(a,b)-> a.start-b.start);
    pq.offer(intervals.get(0).end);

     for (int i = 1; i < intervals.size(); i++) {

            Interval current = intervals.get(i);

            if (current.start >= pq.peek()) {
                pq.poll();
            }
            pq.offer(current.end);
        }

        return pq.size();
    }
}
