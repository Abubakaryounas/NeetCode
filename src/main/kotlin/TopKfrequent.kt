package main.kotlin


/*
Given an integer array nums and an integer k,
 return the k most frequent elements.
  You may return the answer in any order.
 */

class TopKfrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       val map= HashMap<Int, Int>()

        for (num in nums){
            if (map.containsKey(num))
            {
                map.replace(num, map.get(num)?.plus(1) ?: 0)
              //  map.computeIfPresent(num){ _, value -> value + 1 }
            }
            else
                map.put(num,1)
        }
        return map.toSortedMap().keys.toIntArray().sliceArray(0..k-1)

    }
}



