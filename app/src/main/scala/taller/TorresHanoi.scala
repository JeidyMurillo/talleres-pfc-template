package taller

class TorresHanoi {
  def movsTorresHanoi(n: Int): BigInt = {
  if (n == 0) BigInt(0)
  else BigInt(2).pow(n) - 1
}

def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
  if (n == 0) Nil
  else {
        // Mover n-1 discos de t1 a t2 usando t3 como intermediaria
        val movimientosPrevios = torresHanoi(n - 1, t1, t3, t2)
        
        // Mover el disco n de t1 a t3
        val moverDisco = (t1, t3)
        
        // Mover n-1 discos de t2 a t3 usando t1 como intermediaria
        val movimientosPosteriores = torresHanoi(n - 1, t2, t1, t3)
        
        movimientosPrevios ::: (moverDisco :: movimientosPosteriores)
        }
    }

}

