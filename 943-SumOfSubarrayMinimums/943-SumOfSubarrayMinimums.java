// Last updated: 02/01/2026, 10:08:51
class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n=arr.length;
       int nse[]=new int[n] ;
       int psw[]=new int[n] ;
       Stack<Integer> s=new Stack<>();
        findNse(arr,nse,n,s);
        findPse(arr,psw,n,s);
        long total=0;
        int mod=1000000000+7;

        for(int i=0;i<n;i++){
            int l=i-psw[i];
            int r=nse[i]-i;
            total = (total + arr[i] * 1L * l * r) % mod;
        }
        return (int)total;
    }
    void findPse(int arr[],int pse[],int n,Stack<Integer> s){
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&arr[i]<arr[s.peek()]){
                s.pop();
            }
            pse[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        s.clear();
    }   
    void findNse(int arr[],int nsw[],int n,Stack<Integer> s){
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&arr[i]<=arr[s.peek()]){
                s.pop();
            }
            nsw[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        s.clear();
    }   
}