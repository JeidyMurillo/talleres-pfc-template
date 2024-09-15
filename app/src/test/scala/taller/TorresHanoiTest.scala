package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite {
    val torresHanoi = new TorresHanoi()

    // Pruebas para movsTorresHanoi
    test("Los movimientos de la Torre de Hanoi con 2 discos deben ser: 3") {
        assert(torresHanoi.movsTorresHanoi(2) == BigInt(3))
    }

    test("Los movimientos de la Torre de Hanoi con 3 discos deben ser: 7") {
        assert(torresHanoi.movsTorresHanoi(3) == BigInt(7))
    }

    test("Los movimientos de la Torre de Hanoi con 4 discos deben ser: 15") {
        assert(torresHanoi.movsTorresHanoi(4) == BigInt(15))
    }

    test("Los movimientos de la Torre de Hanoi con 5 discos deben ser: 31") {
        assert(torresHanoi.movsTorresHanoi(5) == BigInt(31))
    }

    test("Los movimientos de la Torre de Hanoi con 6 discos deben ser: 63") {
        assert(torresHanoi.movsTorresHanoi(6) == BigInt(63))
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
