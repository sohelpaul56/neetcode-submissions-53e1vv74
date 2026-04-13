class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int sc=0;
        int ec=n-1;
        int sr=0;
        int er=m-1;
        while(sr <= er && sc <= ec){
        // sc->ec
        for(int i=sc;i<=ec;i++){
        ans.add(matrix[sr][i]);
        }
        sr++;
        //sr->er
        for(int i=sr;i<=er;i++){
        ans.add(matrix[i][ec]);
        }
        ec--;
        //ec->sc
        if(sr<=er){
        for(int i=ec;i>=sc;i--){
        ans.add(matrix[er][i]);
        }
        er--;
        }
        //er->sr
        if(sc<=ec){
        for(int i=er;i>=sr;i--){
        ans.add(matrix[i][sc]);
        }
        sc++;
        }
        }
        return ans;
    }
}
