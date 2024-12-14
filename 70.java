class Solution {
public:
    int climbStairs(int n) {
        int n1,n2;
    int temp=0;
    for(int i=0;i<=n;i++){
        if(i==0){
            n1=0;
            n2=1;
        }
        else{
            temp=n2;
            n2=n2+n1;
            n1=temp;
        }
    }
    return n2;
    }
};
