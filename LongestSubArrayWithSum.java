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

