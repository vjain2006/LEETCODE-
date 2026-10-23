class Solution {
public:
    int subtractProductAndSum(int n) {
        int digit=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            digit*=rem;
            sum+=rem;
            n=n/10;
        }
        return digit-sum;
    }
};
         