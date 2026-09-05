class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        boolean value = false;
        int i = 0;

        while(!value && i < nums.length){
            if(!mySet.contains(nums[i])){
                mySet.add(nums[i]);
            }
            else{
                value = true;
            }
            
            i++;

        }
        System.out.println(mySet);
        return value;
    }
}