class Solution {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> aSet = new HashSet<>();
            for(int i=0; i<nums.length;i++){
                if(aSet.contains(nums[i])) return true;
                aSet.add(nums[i]);
            }
        return false;

    }   
}