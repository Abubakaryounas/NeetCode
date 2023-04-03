fun main(args: Array<String>) {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for (n in nums) {
            if (!hashSet.add(n)) {
                return true
            }
        }
        return false
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