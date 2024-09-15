package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EjercicioMaxlistTest extends AnyFunSuite {
    val objMaxlist = new EjercicioMaxlist()

    // Prueba función recursión lineal - lista vacía
    test("Lanzar excepción para lista vacía en maxLin") {
        assertThrows[IllegalArgumentException] {
            objMaxlist.maxLin(List())
        }
    }

    // Prueba función recursión cola - lista vacía
    test("Lanzar excepción para lista vacía en maxIt") {
        assertThrows[IllegalArgumentException] {
            objMaxlist.maxIt(List())
        }
    }

    // Prueba función recursión lineal - lista con números negativos
    test("Lanzar excepción para lista con números negativos en maxLin") {
        assertThrows[IllegalArgumentException] {
            objMaxlist.maxLin(List(5, 10, -3, 20, 5, 6, 88, 2000))
        }
    }

    // Prueba función recursión cola - lista con números negativos
    test("Lanzar excepción para lista con números negativos en maxIt") {
        assertThrows[IllegalArgumentException] {
            objMaxlist.maxIt(List(15, -1, 22, 30, 5, 10, -8))
        }
    }

    // Lista con números en orden creciente
    test("Numero maximo de la Lista (42, 43, 44, 45, 46, 47, 48, 49, 50) es 50") {
        assert(objMaxlist.maxLin(List(42, 43, 44, 45, 46, 47, 48, 49, 50)) == 50)
        assert(objMaxlist.maxIt(List(42, 43, 44, 45, 46, 47, 48, 49, 50)) == 50)
    }

    test("Numero maximo de la Lista (10, 20, 30, 40, 50, 60, 70) es 70") {
        assert(objMaxlist.maxLin(List(10, 20, 30, 40, 50, 60, 70)) == 70)
        assert(objMaxlist.maxIt(List(10, 20, 30, 40, 50, 60, 70)) == 70)
    }

    // Lista con números en orden decreciente
    test("Numero maximo de la Lista (100, 50, 25, 10, 5) es 100") {
        assert(objMaxlist.maxLin(List(100, 50, 25, 10, 5)) == 100)
        assert(objMaxlist.maxIt(List(100, 50, 25, 10, 5)) == 100)
    }

    test("Numero maximo de la Lista (12, 10, 8, 6, 4, 3, 2 , 1) es 12") {
        assert(objMaxlist.maxLin(List(12, 10, 8, 6, 4, 3, 2, 1)) == 12)
        assert(objMaxlist.maxIt(List(12, 10, 8, 6, 4, 3, 2, 1)) == 12)
    }

    // Lista de varios valores mezclados
    test("Numero maximo de la Lista (3, 14, 7, 9, 1, 18) es 18") {
        assert(objMaxlist.maxLin(List(3, 14, 7, 9, 1, 18)) == 18)
        assert(objMaxlist.maxIt(List(3, 14, 7, 9, 1, 18)) == 18)
    }

    test("Numero maximo de la Lista (5, 1, 52, 70, 5, 80, 61, 180) es 180") {
        assert(objMaxlist.maxLin(List(5, 1, 52, 70, 5, 80, 61, 180)) == 180)
        assert(objMaxlist.maxIt(List(5, 1, 52, 70, 5, 80, 61, 180)) == 180)
    }

    // Lista con valores cercanos
    test("Numero maximo de la Lista (99, 98, 100, 97, 96) es 100") {
        assert(objMaxlist.maxLin(List(99, 98, 100, 97, 96)) == 100)
        assert(objMaxlist.maxIt(List(99, 98, 100, 97, 96)) == 100)
    }

    // Lista con todos los elementos iguales
    test("Numero maximo de la Lista (7, 7, 7, 7, 7) es 7") {
        assert(objMaxlist.maxLin(List(7, 7, 7, 7, 7)) == 7)
        assert(objMaxlist.maxIt(List(7, 7, 7, 7, 7)) == 7)
    }
}
