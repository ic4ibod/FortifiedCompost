import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.random.nextInt

internal class PileTest {

    val testPile = Pile()

    @Test
    fun `add a cube to the pile`() {
        val cubeOne = Cube(System.currentTimeMillis())
        cubeOne.chemProps.putAll(mapOf(
            "carbon" to 0.23,
            "nitrogen" to 0.06,
            "phosphorous" to 0.02,
            "potassium" to 0.12,
            "sulphur" to 0.01
        ))

        testPile.cubeAdd(cubeOne)

        assertEquals(1, testPile.pile.size)
    }

    @Test
    fun `add multiple cubes to the pile` () {
        testPile.emptyPile()
        val numberOfCubes = Random.nextInt(2,20)
        for ( i in 1..numberOfCubes) {
            val cube:Cube = Cube(i.toLong())
            cube.chemProps.putAll(mapOf(
                "carbon" to 0.23,
                "nitrogen" to 0.06,
                "phosphorous" to 0.02,
                "potassium" to 0.12,
                "sulphur" to 0.01
            ))
        testPile.cubeAdd(cube)
        }
        assertEquals(numberOfCubes, testPile.pile.size)
    }

    @Test
    fun `get an average from the pile` () {
        testPile.emptyPile()
        val chemProps = listOf<String>(
            "carbon",
            "nitrogen",
            "phosphorous",
            "potassium",
            "sulphur"
            )

        for (prop in chemProps)

        val localMapOfProps: MutableMap<String, Double> = mutableMapOf()
        for (i in 1..20) {
            val cube = Cube(System.currentTimeMillis())
            cube.chemProps.putAll(randProps)
            testPile.cubeAdd(cube)
        }
    }
}