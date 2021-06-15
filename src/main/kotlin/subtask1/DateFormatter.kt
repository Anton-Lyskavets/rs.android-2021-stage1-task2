package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*

class DateFormatter {
    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        return try {
            val dayInt = day.toInt()
            val monthInt = month.toInt()
            val yearInt = year.toInt()
            val date = LocalDate.of(yearInt, monthInt, dayInt)
            val localeRu = Locale("ru", "RU")
            val dayWeek = date.dayOfWeek.getDisplayName(TextStyle.FULL, localeRu)
            val formatDate = date.format(DateTimeFormatter.ofPattern("dd MMMM, "))
            formatDate + dayWeek
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
