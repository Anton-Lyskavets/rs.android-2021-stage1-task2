package subtask2

import java.util.*

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
//        throw NotImplementedError("Not implemented")
        val A = a.toUpperCase(Locale.ROOT)
        val aA = A.toCharArray()
        val bB = b.toCharArray()
        var count = 0
        var x = 0
        for (i in bB.indices) {
            for (j in x until aA.size) {
                if (bB[i] == aA[j]) {
                    count += 1
                    x = j+1
                    break
                }
            }
        }
        return if (count == bB.size) {
            "YES"
        } else "NO"
    }
}
