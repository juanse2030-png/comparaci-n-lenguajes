object PromedioNotas {
  def main(args: Array[String]): Unit = {
    print("Ingrese la primera nota: ")
    val nota1 = scala.io.StdIn.readDouble()

    print("Ingrese la segunda nota: ")
    val nota2 = scala.io.StdIn.readDouble()

    print("Ingrese la tercera nota: ")
    val nota3 = scala.io.StdIn.readDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    println("El promedio es: " + promedio)

    if (promedio >= 3.0) {
      println("El estudiante aprueba.")
    } else {
      println("El estudiante reprueba.")
    }
  }
}