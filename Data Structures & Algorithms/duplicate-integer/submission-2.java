class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        boolean value = false;
        //int i = 0;

        for(int num : nums){
            if(!mySet.contains(num)){
                mySet.add(num);
            }
            else{
                return true;
            }
        }
        //System.out.println(mySet);
        return value;
    }
}