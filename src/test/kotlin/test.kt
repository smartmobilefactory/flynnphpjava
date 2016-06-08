import org.testng.annotations.Test
import java.io.File
import kotlin.test.assertTrue

@Test
class FirstTest {

    fun test() {
        val file = File("src/test/resources/hello.txt")
            assertTrue(file.canRead(), "Cannot read $file")
    }
}
