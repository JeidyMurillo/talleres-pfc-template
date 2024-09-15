package taller

import scala.annotation.tailrec

class EjercicioMaxlist {

    // Función recursión lineal
    def maxLin(l: List[Int]): Int = {
        if (l.isEmpty) throw new IllegalArgumentException("La lista no debe estar vacía")
        if (l.exists(_ < 0)) throw new IllegalArgumentException("La lista no debe contener números negativos")
        if (l.tail.isEmpty) l.head
        else math.max(l.head, maxLin(l.tail))
    }

    // Función recursión de cola
    def maxIt(l: List[Int]): Int = {
        @tailrec
        def maxItAux(l: List[Int], max: Int): Int = {
            if (l.isEmpty) max
            else maxItAux(l.tail, math.max(l.head, max))
        }

        if (l.isEmpty) throw new IllegalArgumentException("La lista no debe estar vacía")
        if (l.exists(_ < 0)) throw new IllegalArgumentException("La lista no debe contener números negativos")
        else maxItAux(l, Int.MinValue)
    }
}
