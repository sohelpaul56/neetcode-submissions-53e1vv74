class Solution {

    public int candy(int[] ratings) {

        int n = ratings.length;

        int ans = 1;

        int i = 1;

        while (i < n) {

            if (ratings[i] == ratings[i - 1]) {
                ans++;
                i++;
                continue;
            }

            int up = 0;

            while (i < n && ratings[i] > ratings[i - 1]) {
                up++;
                ans += 1 + up;
                i++;
            }

            int down = 0;

            while (i < n && ratings[i] < ratings[i - 1]) {
                down++;
                ans += down;
                i++;
            }

            if (down > up)
                ans += down - up;
        }

        return ans;
    }
}