/**
 * Created by keyingzhou on 10/21/17.
 */
public class MajorityElement169 {
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
}
