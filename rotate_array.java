
class Solution {
    public static void rev(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    } 
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        int n=arr.length;
        d=d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        /* int temp[]=new int[n];
         for(int i=0;i<n-d;i++){
             temp[i]=arr[d+i];
         }
         for(int i=0;i<d;i++){
             temp[n+i-d]=arr[i];
         }
         for(int i=0;i<n;i++){
             arr[i]=temp[i];
       }*/
    }
}
