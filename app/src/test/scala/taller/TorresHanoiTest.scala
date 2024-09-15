package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite {
    val torresHanoi = new TorresHanoi()

    // Pruebas para movsTorresHanoi
    test("Los movimientos de la Torre de Hanoi con 4 discos deben ser: 15") {
        assert(torresHanoi.movsTorresHanoi(4) == BigInt(15))
    }

    test("Los movimientos de la Torre de Hanoi con 5 discos deben ser: 31") {
        assert(torresHanoi.movsTorresHanoi(5) == BigInt(31))
    }

    test("Los movimientos de la Torre de Hanoi con 6 discos deben ser: 63") {
        assert(torresHanoi.movsTorresHanoi(6) == BigInt(63))
    } 

    test("Los movimientos de la Torre de Hanoi con 7 discos deben ser: 127") {
        assert(torresHanoi.movsTorresHanoi(7) == BigInt(127))
    }

    test("Los movimientos de la Torre de Hanoi con 8 discos deben ser: 255") {
        assert(torresHanoi.movsTorresHanoi(8) == BigInt(255))
    }

    test("Los movimientos de la Torre de Hanoi con 9 discos deben ser: 511") {
        assert(torresHanoi.movsTorresHanoi(9) == BigInt(511))
    }

    // Pruebas para torresHanoi
    test("Torre Hanoi con 2 discos debe devolver los movimientos correctos") {
        assert(torresHanoi.torresHanoi(2, 1, 2, 3) == List((1, 2), (1, 3), (2, 3)))
    }

    test("Torre Hanoi con 3 discos debe devolver los movimientos correctos") {
        assert(torresHanoi.torresHanoi(3, 1, 2, 3) == List((1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)))
    }

    test("Torre Hanoi con 4 discos debe devolver los movimientos correctos") {
        assert(torresHanoi.torresHanoi(4, 1, 2, 3) == List(
        (1, 2), (1, 3), (2, 3), 
        (1, 2), (3, 1), (3, 2), (1, 2), 
        (1, 3), (2, 3), (2, 1), (3, 1), 
        (2, 3), (1, 2), (1, 3), (2, 3)
        ))
    }

    test("Torre Hanoi con 5 discos debe devolver los movimientos correctos") {
        assert(torresHanoi.torresHanoi(5, 1, 2, 3) == List(
          (1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3), 
          (1, 2), (3, 2), (3, 1), (2, 1), (3, 2), (1, 3), (1, 2), (3, 2), 
          (1, 3), (2, 1), (2, 3), (1, 3), (2, 1), (3, 2), (3, 1), 
          (2, 1), (2, 3), (1, 3), (1, 2), (3, 2), (1, 3), (2, 1), (2, 3), (1, 3)
        ))
    }

    test("Torre Hanoi con 6 discos debe devolver los movimientos correctos") {
        val movimientosGenerados = torresHanoi.torresHanoi(6, 1, 2, 3)
        println(movimientosGenerados)
        val movimientosEsperados = List(
        (1, 2), (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2), (1, 3), 
        (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3), (1, 2), 
        (3, 1), (3, 2), (1, 2), (3, 1), (2, 3), (2, 1), (3, 1), (3, 2), 
        (1, 2), (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2), (1, 3), 
        (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3), (2, 1), 
        (3, 1), (3, 2), (1, 2), (3, 1), (2, 3), (2, 1), (3, 1), (2, 3), 
        (1, 2), (1, 3), (2, 3), (1, 2), (3, 1), (3, 2), (1, 2), (1, 3),
        (2, 3), (2, 1), (3, 1), (2, 3), (1, 2), (1, 3), (2, 3)
    )
        assert(movimientosGenerados == movimientosEsperados)
    }
}
