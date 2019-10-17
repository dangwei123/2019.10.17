1.
请你帮忙给从 1 到 n 的数设计排列方案，使得所有的「质数」都应该被放在「质数索引」（索引从 1 开始）上；你需要返回可能的方案总数。

让我们一起来回顾一下「质数」：质数一定是大于 1 的，并且不能用两个小于它的正整数的乘积来表示。

由于答案可能会很大，所以请你返回答案 模 mod 10^9 + 7 之后的结果即可。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/prime-arrangements
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int numPrimeArrangements(int n) {
         if (n <= 1)
            return 1;
        int count = 0;
        for (int i = 3; i <= n; i+=2) {
             int j=2;
            for (j = 2; j<= i/j; j++)
                if (i % j == 0) {
                    break;
                }
           if(j>i/j){
               count++;
           }
        }
        count++;
        return (int)(fun(count) * fun(n - count)% 1000000007);
    }
    
    public long fun(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++)
            res = (res * i)% 1000000007 ;
        return res;
}
}

2.
实现 pow(x, n) ，即计算 x 的 n 次幂函数。
class Solution {
    public double myPow(double x, int n) {
        double pow=1.0;
        for(int i=n;i!=0;i/=2){
            if(i%2!=0){
                pow*=x;
            }
            x*=x;
        }
        return n>0?pow:1/pow;
    }
}

