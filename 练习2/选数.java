package 练习2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class 选数 {
    public static void main(String[] args) {
        int n,k,count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        List<List<Integer>> res = s.subsetsWithDup(arr);
        for(List list:res){
            if(list.size() == k){
                int sum = 0;
                for(int i=0;i<list.size();i++){
                    sum += (int)list.get(i);
                }
                if (isPrime(sum)) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      Arrays.sort(nums);
      boolean jud[]=new boolean[nums.length];
      List<List<Integer>> valueList=new ArrayList<List<Integer>>();
      dfs2(nums,-1,valueList,jud);
      return valueList;
    }
  
      private void dfs1(int[] nums, int index, List<List<Integer>> valueList, boolean[] jud)   {
          List<Integer>list=new ArrayList<Integer>();
          for(int i=0;i<nums.length;i++)
          {
              if (jud[i]) {
                 list.add(nums[i]);
              }
          }
          valueList.add(list);
          for(int i=index+1;i<nums.length;i++)
          {//第一个元素 或 当前元素不和前面相同  或者相同且前面被使用了可以继续进行
              if((i==0)||(nums[i]!=nums[i-1])||(i>0&&jud[i-1]&&nums[i]==nums[i-1]))
              {
                  jud[i]=true;
                  dfs1(nums, i, valueList,jud);
                  jud[i]=false;
              }
          }
      }
      private void dfs2(int[] num,int index,List<List<Integer>> valueList,boolean jud[]) {
        {//每进行递归函数都要加入到结果中
            List<Integer>list=new ArrayList<Integer>();
            for(int i=0;i<num.length;i++)
            {
                if (jud[i]) {
                    list.add(num[i]);
                }
            }
            valueList.add(list);
            System.out.println(list);
        }
        {
            for(int i=index+1;i<num.length;i++)
            {
                jud[i]=true;
                dfs2(num, i, valueList,jud);
                jud[i]=false;
            
            }
        }
    }
  }
/*Description
已知 n 个整数 x1,x2,…,xn，以及1个整数k(k<n)。从n个整数中任选k个整数相加，可分别得到一系列的和。
例如当n=4,k=3。4个整数分别为3,7,12,19时，可得全部的组合与它们的和为：
3+7+12=22 */