class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        for(int i=0;i<n;i++){
            ans[i] = nums1[i];
        }
        for(int i=0;i<m;i++){
            ans[i+n] = nums2[i];
        }
        Arrays.sort(ans);
        int len = n+m;
        if(len%2!=0){
            return (double)ans[len/2];
        }
        else{
            return ((double) ans[len/2]+ans[len/2 -1])/2;
        }
    }
}
