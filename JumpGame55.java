package com.zhang.greedy;
/*
Jump game 55: medium          Done
Jump game II 45: Hard
Jump game III 1306: medium
Jump game IV 1345: Hard
Jump game V: 1340 Hard
Jump game VI: 1696 medium
 */
public class JumpGame55 {

    public static void main(String[] args){
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,1,0,4};

        int[] nums;
        boolean ans;

        nums = nums1;
        ans = canJump(nums);
        System.out.println(ans);

        nums = nums2;
        ans = canJump(nums);
        System.out.println(ans);
    }

    // added "static" so the main method can reference this canJump method
    public static boolean canJump(int[] nums) {
        int lastGoodPosition = nums.length -1;

        for (int index = nums.length-1; index>=0; index--){
            if (nums[index] >= (lastGoodPosition-index)){
                lastGoodPosition = index;
            }
        }
        return lastGoodPosition == 0;
    }

}
