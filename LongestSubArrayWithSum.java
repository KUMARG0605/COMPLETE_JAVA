class Solution {
    public int LongestSubArrayWithSum(int[] arr) {
        // Your code goes here
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
          sum+=arr[i];
          if(sum==0){
            ans=i+1;
          }
          else{
            if(hm.get(sum)!=null){
              ans=Math.max(ans,i-hm.get(sum));
            }
            else{
              hm.put(sum,i);
            }
          }
        }
        return ans;
    }
}

/*
You are given an integer array arr of size n which contains both positive and negative integers. Your task is to find the length of the longest contiguous subarray with sum equal to 0.



Return the length of such a subarray. If no such subarray exists, return 0.


Examples:
Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]

Output: 5

Explanation:

The subarray [-2, 2, -8, 1, 7] sums up to 0 and has the maximum length among all such subarrays.

Input: arr = [2, 10, 4]

Output: 0

Explanation:

There is no subarray whose elements sum to 0.
*/
