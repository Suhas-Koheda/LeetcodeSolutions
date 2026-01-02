// Last updated: 02/01/2026, 10:09:58
class Solution {
    public int candy(int[] ratings) {
        int sum=1;
        int i=1;
        while(i<ratings.length){
            if(ratings[i]==ratings[i-1]){
                sum+=1; 
                i++;
                continue;   
            }
            int peak=1;
            while(i<ratings.length && ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<ratings.length && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(down>peak){
                sum=sum+(down-peak);
            }
        }
        return sum;
    }
}