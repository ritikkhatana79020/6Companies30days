package Milestone1;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 10;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }

    static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j=i;j<nums.length;j++){
                prod = prod * nums[j];
                if(prod < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
