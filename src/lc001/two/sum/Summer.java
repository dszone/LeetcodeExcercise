package lc001.two.sum;

import java.util.HashMap;

public class Summer {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums==null || nums.length<2) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }

}