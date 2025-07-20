class Solution {
    public int[] asteroidCollision(int[] arr) {
        // Arrays.sort(asteroids);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                s.push(arr[i]);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(arr[i])){
                    s.pop();
                }
                if(!s.isEmpty()&&s.peek()==Math.abs(arr[i])){
                    s.pop();
                }
                else if(s.isEmpty()||s.peek()<0){
                    s.push(arr[i]);
                }
            }
        }
        int ans[]=new int[s.size()];
        int k=s.size()-1;
        System.out.println(k);
        while(!s.isEmpty()){
            ans[k--]=s.pop();
        }
        return ans;
    }
}