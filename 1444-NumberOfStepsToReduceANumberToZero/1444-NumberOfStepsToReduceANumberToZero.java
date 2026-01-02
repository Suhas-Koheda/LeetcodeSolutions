// Last updated: 02/01/2026, 10:08:19
class Solution {
    public int numberOfSteps(int num) {
        return check(num, 0);
    }
    public static int check(int n,int count) {
	if(n==0) {
		return count;
	}
	if(n%2==0) {
		return check(n/2,count+1);
	}
	return check((n-1),count+1);
}
}