fun main() {
    print("Ingrese la primera nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Ingrese la segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Ingrese la tercera nota: ")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    println("El promedio es: $promedio")

    if (promedio >= 3.0) {
        println("El estudiante aprueba.")
    } else {
        println("El estudiante reprueba.")
    }
}
