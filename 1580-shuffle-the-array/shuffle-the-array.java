class Solution {
    public int[] shuffle(int[] nums, int n) {
        int narr[]=new int[nums.length];
        int i=0;
        for(int j=0;j<n;j++){
            narr[i]=nums[j];
            i++;
            narr[i]=nums[j+n];
            i++;
        }
        return narr;
    }
}