class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>(); // keys will be the integer values of arrays and the value will be the index of the array.
        for(int i=0;i<nums.length;i++){
            int findMe = target-nums[i];
            if(map.containsKey(findMe)){
                return new int[] {map.get(findMe),i};
            }
            map.put(nums[i],i);
        }
        
        return null;
    }
}