package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
//        throw NotImplementedError("Not implemented")
        val e = "exception"
        return when (blockB) {
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            String::class -> {
                blockA.filterIsInstance<String>().joinToString(separator = "")
            }
            LocalDate::class -> {
                (blockA.filterIsInstance<LocalDate>().max() as LocalDate).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> e
        }
    }
}
