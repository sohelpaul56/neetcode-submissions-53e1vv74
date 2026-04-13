class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int s = 1;
        int e = 0;

        for(int p : piles){
            e = Math.max(e, p);
        }

        while(s <= e){
            int mid = s + (e - s) / 2;

            int hours = totalHours(piles, mid);

            if(hours <= h){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return s;
    }

    public int totalHours(int[] piles, int k){
        int hours = 0;

        for(int p : piles){
            hours += Math.ceil((double)p / k);
        }

        return hours;
    }
}