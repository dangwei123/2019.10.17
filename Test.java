1.
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
（先后次序不同算不同的结果）。

public class Solution {
    public int JumpFloor(int target) {
         if(target<=2){
             return target;
         }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}

2.
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
         int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}

3.
给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。

在此过程之后，我们得到一些数组 B。

返回 B 的最大值和 B 的最小值之间可能存在的最小差值。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/smallest-range-i
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int smallestRangeI(int[] A, int K) {
        if(A.length<2){
            return 0;
        }
        Arrays.sort(A);
        int tmp=A[A.length-1]-A[0];
        if(tmp<=2*K){
            return 0;
        }else{
            return tmp-2*K;
        }
    }
}

