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
	    	/*�������飬����ֵת��Ϊ�����±꣬�ж��Ƿ����0������0�Ľ�����±��Ӧ����ֵ��Ϊ������ʹ��Math.absȡ����ֵ����Ϊ�˽�������Ϊԭ������ֵ*/
	    	for (int i = 0; i < nums.length; i++) {
				int val = Math.abs(nums[i]) - 1;
				if (nums[val] > 0) {
					nums[val] = -nums[val];
				}
			}
	    	/*����ת�������ֵ���������ֵ����0�ľͽ��м�¼*/
	    	for (int i = 0; i < nums.length; i++) {
				if (nums[i] > 0) {
					res.add(i + 1);
				}
			}
			return res;
	    }
	}

}
