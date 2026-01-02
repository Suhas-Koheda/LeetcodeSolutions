// Last updated: 02/01/2026, 10:06:35
class Solution {
    public boolean checkDivisibility(int n) {
    if(n==0)   {
        return false;
    }
        return n%(digitSum(n)+digitProd(n))==0;
    }
    int digitSum(int n){
        if(n==0){
            return 0;
        }
        int k=n;
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }

    int digitProd(int n){
        if(n==0){
            return 0;
        }
        int k=n;
        int prod=1;
        while(n>0){
            prod=prod*(n%10);
            n=n/10;
        }
        return prod;
    }
}