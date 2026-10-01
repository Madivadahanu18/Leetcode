class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] a=new int[2*n];
      int index=0;
      for(int i=0;i<n;i++){
        a[index++]=nums[i];
        a[index++]=nums[i+n];
      }
      return a;
    }
}