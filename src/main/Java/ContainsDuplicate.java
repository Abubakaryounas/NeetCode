class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet=new HashSet<Integer>();
        for(int n:nums){
            if(!hashSet.add(n)){
                return true;
            }
        }
        return false;
        // for(int i=0;i<nums.length;i++){
        //     if(hashSet.contains(nums[i])){
        //         return true;
        //     }
        //     else{
        //         hashSet.add(nums[i]);
        //     }

        // }
        // return false;

    }
}