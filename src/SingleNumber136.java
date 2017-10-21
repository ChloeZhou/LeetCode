/**
 * Created by keyingzhou on 10/21/17.
 */
public class SingleNumber136 {
    //Given an array of integers, every element appears twice except for one. Find that single one.
    public int singleNumberI(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
    //Single Number II
    // Given an array of integers, every element appears
    // three times except for one, which appears exactly once.
    // Find that single one.
    public int singleNumberII(int[] nums) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int sum = 0;
            for(int n: nums)
                if((n >> i & 1) == 1)
                    sum++;
            sum %= 3;
            res |= sum<<i;
        }
        return res;
    }
    //Single Number III
    //Given an array of numbers nums, in which exactly two elements appear only
    // once and all the other elements appear exactly twice.
    // Find the two elements that appear only once.
    //O(n) time complexity, O(1) space complexity
    public int[] singleNumberIII(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int bit = xor & ~(xor - 1);
        int num1 = 0;
        int num2 = 0;
        for (int num : nums) {
            if ((num & bit) > 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        int[] result = new int[2];
        result[0] = num1;
        result[1] = num2;
        return result;
    }
}
