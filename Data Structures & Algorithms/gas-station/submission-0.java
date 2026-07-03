class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        for(int x:gas) totalgas+=x;

        int totalcost=0;
        for(int x:cost) totalcost+=x;

        if(totalgas<totalcost) return -1;

        int start=0;
        int calculategas=0;

        for(int i=0;i<cost.length;i++){
           calculategas+=gas[i]-cost[i];
           if(calculategas<0){
            start=i+1;
            calculategas=0;
           }
        }
        return start;
    }
}