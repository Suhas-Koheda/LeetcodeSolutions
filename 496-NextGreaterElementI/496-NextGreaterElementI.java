// Last updated: 02/01/2026, 10:09:22
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int nge[]=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            if(s.isEmpty()){
                nge[i]=-1;
            }   
            else{
                while(!s.isEmpty() && nums2[i]>=s.peek()){
                    s.pop();
                }
                nge[i]=s.isEmpty()?-1:s.peek();
            }
            s.push(nums2[i]);
        }
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            h.put(nums2[i],nge[i]);
        }
        int ans[]=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            ans[k++]=h.get(nums1[i]);
        }
        return ans;
    }
}