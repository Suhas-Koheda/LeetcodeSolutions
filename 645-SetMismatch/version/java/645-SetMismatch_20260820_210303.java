// Last updated: 20/08/2026, 21:03:03
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int xor=0;
4        for(int i=0;i<nums.length;i++){
5            xor=xor^nums[i];
6            xor=xor^(i+1);
7        }
8        int n=nums.length;
9        int bit=0;
10        while(true){
11            if((xor&(1<<bit))!=0){
12                break;
13            }
14            bit++;
15        }
16        int zero=0;
17        int ones=0;
18        for(int i=0;i<nums.length;i++){
19            if( (nums[i]&(1<<bit))!=0)ones=ones^nums[i];
20            else zero=zero^nums[i];
21        }
22        for(int i=0;i<nums.length;i++){
23            if( ((i+1)&(1<<bit))!=0)ones=ones^(i+1);
24            else zero=zero^(i+1);
25        }
26        int count=0;
27        for(int i=0;i<n;i++){
28            if(nums[i]==zero)count++;
29        }
30        if(count==2) return new int[]{zero,ones};
31        else return new int[]{ones,zero};
32    }
33}