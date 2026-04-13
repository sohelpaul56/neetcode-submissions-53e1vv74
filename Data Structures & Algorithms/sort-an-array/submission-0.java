class Solution {

    public void merge(int[] nums,int s,int m,int e){

        int n1 = m - s + 1;
        int n2 = e - m;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++)
            arr1[i] = nums[s+i];

        for(int j=0;j<n2;j++)
            arr2[j] = nums[m+1+j];

        int i=0,j=0,k=s;

        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                nums[k++] = arr1[i++];
            }else{
                nums[k++] = arr2[j++];
            }
        }

        while(i<n1){
            nums[k++] = arr1[i++];
        }

        while(j<n2){
            nums[k++] = arr2[j++];
        }
    }

    public void mergesort(int[] nums,int s,int e){

        if(s >= e) return;

        int m = s + (e - s)/2;

        mergesort(nums,s,m);
        mergesort(nums,m+1,e);

        merge(nums,s,m,e);
    }

    public int[] sortArray(int[] nums) {

        mergesort(nums,0,nums.length-1);
        return nums;
    }
}