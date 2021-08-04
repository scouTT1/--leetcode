import sun.font.TrueTypeFont;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public int str2int(String s) {
        int a = 0;
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i) - 97;
        }
        a = Integer.valueOf(str).intValue();
        return a;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = str2int(firstWord);
        int b = str2int(secondWord);
        int c = str2int(targetWord);
        return a + b == c;

    }

    public String maxValue(String n, int x) {
        StringBuilder str = new StringBuilder(n);
        if (n.charAt(0) == '-') {
            int place = n.length();
            for (int i = 1; i < n.length(); i++) {
                if (str.charAt(i) - 48 > x) {
                    place = i;
                    break;
                }
            }
            str.insert(place, x);
            return str.toString();
        }
        int place = n.length();
        for (int i = 0; i < n.length(); i++) {
            if (str.charAt(i) - 48 < x) {
                place = i;
                break;
            }
        }
        str.insert(place, x);
        return str.toString();
    }

    public int countGoodSubstrings(String s) {
        //滑动窗口加map
        int a = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 2) != s.charAt(i + 1)) {
                a++;
            }

        }
        return a;
    }

    public int compute(int[][] grid, int m, int n, int len) {
        int result = 0;
        for (int i = 0; i < len; i++) {

        }
        return result;
    }

    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxlen = Math.min(m / 2 + 1, n / 2 + 1);
        int b = 0;
        int[] result = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < maxlen; k++) {
                    result[b] = compute(grid, i, j, k);
                }
            }
        }


        //再来个排序
        return Arrays.copyOfRange(result, 0, 3);
    }

    public int test(ArrayList<String> a){
        if(a==null){
            return -1;

        }
        return a.size();
    }

    public boolean findRotation(int[][] mat, int[][] target) {
       //三种遍历方式
       int n =mat[0].length;
       boolean flag=true;
       a:for(int i=n-1;i>=0;i--){
           for(int j=0;j<n;j++){
               if(target[j][i]!=mat[n-1-i][j]){
                   flag=false;
                   break a;
               }
           }
       }
       if(flag)return true;
       b:for(int i=n-1;i>=0;i--){
           for(int j=n-1;j>=0;j--){
               if(target[i][j]!=mat[n-1-i][n-1-j])
                   flag=false;
                   break b;
           }
       }
       if(flag)return true;
       c:for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(target[n-1-j][i]!=mat[i][j]){
                   flag=false;
                   break c;
               }
           }
       }
       return flag;
    }

    public int reductionOperations(int[] nums) {
        int[] a = new int[50000];
        //题目是说数不同的数有多少个，先排个序然后用hashmap来做映射
        //计算公式为x*（n-rank） x是当前数字的数量 n是不同的数的数量 rank是这个数字的大小排号

        return 0;
    }

    public void dijkstra(int[][] dis,int source,int target){}
    //未完成
    public int numBusesToDestination(int[][] routes, int source, int target) {
        int len=100001;
        int[][] dis=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                dis[i][j]=(i==j?0:100001);
            }
        }
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length+routes[i].length;j++){
                int start=routes[i][j];
                /*for(int k=0;k<routes[i].length;k++){
                    int end=routes[i][k];

                    dis[start][end]=dis[start][end]>k-j?k-j:dis[start][end];
                }*/

            }
        }
        return 0;
    }

    public int[] buildArray(int[] nums) {

            int[] ans= new int[nums.length];
            for(int i=0;i<nums.length;i++){
                ans[i]=nums[nums[i]];
            }
            return ans;

    }

    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] time=new double[dist.length];
        for(int i=0;i<dist.length;i++){
            time[i]=Double.valueOf(dist[i])/Double.valueOf(speed[i]);
        }
        Arrays.sort(time);
        int k;
        for(k=0;k<time.length;k++){
            if(k<time[k]){
                continue;
            }
            break;
        }
        return k;



    }

    public static final long MOD = (long)(1e9 + 7);
    public long comp(long n, long x) {
        if(n == 0) return 1L;
        long tmp = comp(n / 2, x);
        if(n % 2 == 0) { // 偶数时，求平方得f(n)
            return tmp * tmp % MOD;
        }else {
            // 奇数多乘一个x，f(n/2) * f(n/2) * x
            return tmp * tmp * x % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long x = (long)(n / 2);     // 求奇数个数
        long y = (long)(n - n / 2); // n - 奇数 = 偶数
        return (int)(comp(x, 4) * comp(y, 5) % MOD);
    }

    public int longestCommonSubpath(int n, int[][] paths){
        return 1;
    }

    public int hIndex(int[] citations) {
        return 1;

    }
    public boolean[] isThree(int n) {
        boolean[] a = new boolean[n];
        a[2]= true;
        for(int i=3;i<n;i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(a[j]==true&&i%j==0){
                    flag=false;
                    break;
                }
            }
            a[i]=flag;
        }
        return a;

    }
}