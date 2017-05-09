package Array;

import java.util.ArrayList;
import java.util.List;

public class FourFourEight {

	public static void main(String[] args) {
		int[] arr = new int[]{4,3,2,7,8,2,3,1};
		Solution solution = new Solution();
		List<Integer> res = new ArrayList<>();
		res = solution.findDisappearedNumbers(arr);
		for (Integer integer : res) {
			System.out.print(integer + " ");
		}
	}
	public static class Solution {
	    public List<Integer> findDisappearedNumbers(int[] nums) {
	    	List<Integer> res = new ArrayList<>();
	    	if (nums == null || nums.length == 0) {
				return res;
			}
	    	/*遍历数组，将数值转换为数组下标，判断是否大于0，大于0的将这个下标对应的数值变为负数，使用Math.abs取绝对值就是为了将负数变为原来的数值*/
	    	for (int i = 0; i < nums.length; i++) {
				int val = Math.abs(nums[i]) - 1;
				if (nums[val] > 0) {
					nums[val] = -nums[val];
				}
			}
	    	/*遍历转换后的数值，如果有数值大于0的就进行记录*/
	    	for (int i = 0; i < nums.length; i++) {
				if (nums[i] > 0) {
					res.add(i + 1);
				}
			}
			return res;
	    }
	}

}
