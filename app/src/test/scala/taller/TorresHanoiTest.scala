package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TorresHanoiTest extends AnyFunSuite {
    val torresHanoi = new TorresHanoi()

    // Pruebas para movsTorresHanoi
    test("Los movimientos de la Torre de Hanoi con 0 discos deben ser: 0") {
        assert(torresHanoi.movsTorresHanoi(0) == BigInt(0))
    }

    test("Los movimientos de la Torre de Hanoi con 1 disco deben ser: 1") {
        assert(torresHanoi.movsTorresHanoi(1) == BigInt(1))
    }

    test("Los movimientos de la Torre de Hanoi con 2 discos deben ser: 3") {
        assert(torresHanoi.movsTorresHanoi(2) == BigInt(3))
    }

    test("Los movimientos de la Torre de Hanoi con 3 discos deben ser: 7") {
        assert(torresHanoi.movsTorresHanoi(3) == BigInt(7))
    }

    test("Los movimientos de la Torre de Hanoi con 4 discos deben ser: 15") {
        assert(torresHanoi.movsTorresHanoi(4) == BigInt(15))
    }

    // Pruebas para torresHanoi
    test("Torre Hanoi con 0 discos debe devolver lista vacía") {
        assert(torresHanoi.torresHanoi(0, 1, 2, 3) == List())
    }

    test("Torre Hanoi con 1 disco debe devolver un movimiento de la torre 1 a la torre 3") {
        assert(torresHanoi.torresHanoi(1, 1, 2, 3) == List((1, 3)))
    }

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
  
}
