// Last updated: 02/01/2026, 10:06:45
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int ans[]=new int[nums.length-k+1];
        int m=0;
        int max=0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<k;i++){
            freq[nums[i]]++;
        }
        int maxfreq=0;
        int smax=0;
        maxfreq=findmax(freq);
        smax=findSecondMax(freq,maxfreq);
         ans[m++] = calculateXSum(freq, x);
        System.out.println(maxfreq+ " "+smax);
        System.out.println(Arrays.toString(freq));
        for(int i=k;i<nums.length;i++){
            int out=nums[i-k];
            freq[out]--;
            int in=nums[i];
            freq[in]++;
            maxfreq=findmax(freq);
            smax=findSecondMax(freq,maxfreq);
             ans[m++] = calculateXSum(freq, x);
            System.out.println(maxfreq+ " "+smax);
            System.out.println(Arrays.toString(freq));
        }
        return ans;
    }
    public int findmax(int[] freq){
         int maxNum = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }
    public int findSecondMax(int[] freq, int maxNum) {
        int secondMaxNum = -1;
        for (int i = 0; i < freq.length; i++) {
            if (i != maxNum && (secondMaxNum == -1 || freq[i] >= freq[secondMaxNum])) {
                secondMaxNum = i;
            }
        }
        return secondMaxNum == -1 ? maxNum : secondMaxNum;
    }
    public int calculateXSum(int[] freq, int x) {
        List<int[]> freqList = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                freqList.add(new int[]{i, freq[i]});
            }
        }

        freqList.sort((a, b) -> b[1] != a[1] ? b[1] - a[1] : b[0] - a[0]);

        int sum = 0;
        for (int i = 0; i < Math.min(x, freqList.size()); i++) {
            sum += freqList.get(i)[0] * freqList.get(i)[1];
        }

        return sum;
    }
}