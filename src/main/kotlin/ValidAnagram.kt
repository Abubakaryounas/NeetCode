class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
            if (s.length!=t.length) return false
            val frequency=HashMap<Char,Int>()
        for (i in 0 until s.length){
            var char=s[i]
            frequency[char] = frequency.getOrDefault(char,0)+1
        }
        for (i in 0 until t.length){
            var char=t[i]
            frequency[char] = frequency.getOrDefault(char,0)-1
            if (frequency[char]==0) frequency.remove(char)
        }

        return frequency.isEmpty()
      //  return s.toList().sorted()==t.toList().sorted()

    }





}