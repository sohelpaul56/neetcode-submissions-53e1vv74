class Number implements Comparable<Number> {
    int num;
    int freq;

    public Number(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }

    @Override
    public int compareTo(Number that) {
        return that.freq - this.freq; // max heap by frequency
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Number(entry.getKey(), entry.getValue()));
        }

        int index = 0;

        while (index < k) {
            Number number = pq.poll();
            ans[index] = number.num;
            index++;
        }

        return ans;
    }
}