    class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
          for(int i=b;i>=2;i--){
             if(a%i==0&&b%i==0){
                 return i;
             }
         }
        return 1;
    }
}


public class Solution {
    public int getSum(int a, int b) {  
         
        if (b == 0) return a;
        else {
            int xorSum = a ^ b;
            int carry = (a & b) << 1;
            return getSum(xorSum, carry);
        }
    }
}
 