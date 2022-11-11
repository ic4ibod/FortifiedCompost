import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CubeTest {

    private val cube = Cube(System.currentTimeMillis())

    @Test
    fun `make a cube and set the nitrogen value and test the return` () {
        val expected = 0.04
        cube.chemProps["nitrogen"] = 0.04
        Assertions.assertEquals(expected, cube.chemProps["nitrogen"])
    }

    @Test
    fun `make a cube and add more than one value` () {
        val expected: Map<String, Double> = mapOf(
                "carbon" to 0.23,
                "nitrogen" to 0.06,
                "phosphorous" to 0.02,
                "potassium" to 0.12,
                "sulphur" to 0.01
                )

        for ((property, value) in expected) {
            cube.chemProps[property] = value
        }

        assertEquals(expected, cube.chemProps)
    }

    @Test
    fun `test the physical properties a different way` () {
        val expected = mapOf<String, Double>(
            "wetBD" to 0.345,
            "dryBD" to 1.234
        )

        cube.physProps.putAll(expected)

        assertEquals(expected, cube.physProps)
    }
}