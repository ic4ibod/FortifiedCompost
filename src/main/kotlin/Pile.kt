import java.awt.PageAttributes.PrintQualityType
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

class Pile {

    var pile: MutableList<Cube> = mutableListOf()

    fun cubeAdd(newCube: Cube): Unit {
        this.pile.add(newCube)
    }

    fun emptyPile(): Unit {
        this.pile.clear()
    }

    fun getAverages(): Unit {
    }

}