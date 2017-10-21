/**
 * Created by keyingzhou on 10/21/17.
 */
public class MajorityElement169 {
    //first solution: compare one by one
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                res = nums[i];
            } else if (res == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
   /* //Second Solution: bit manipulation
    public int majorityElement(int[] nums) {
        int[] bit = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num >> (31 - i) & 1) == 1) {
                    bit[i]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            bit[i] = bit[i] > nums.length / 2 ? 1:0;
            res += bit[i] * (1 << (31 - i));
        }
        return res;
    }
    Follow UP:
    majority element that appears more than ⌊ n/3 ⌋ times.
    <number1, counter1>
    <number2, counter2>
            if x== number1 counter1++
            if x == number2 counter2++
            if counter1 == 0 number1 = x, counter1 = 1
            if counter2 == 0 number2 = x, counter2 = 1
            else counter1—, counter2--
    find two candidates, then repeat more than [n / 2];


    majority element that appears more than ⌊ n/k ⌋ times.
            HashMap: Time O(nk) Space O(n)*/
}
