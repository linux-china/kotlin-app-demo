import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.Instant

fun main() {
    println("Hello, ${World.get()}!")
    val now: Instant = Clock.System.now()
    println(now.toLocalDateTime(TimeZone.currentSystemDefault()))
}
