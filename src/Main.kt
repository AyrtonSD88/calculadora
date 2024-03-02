import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    menu()
}



fun menu() {
    println("1. Retangulo")
    println("2. Triangulo Equilatero")
    println("3. Triangulo Isosceles")
    println("4. Triangulo Escaleno")
    println("5. Circunferencia")
    println("6. Losango")
    println("7. Trapezio")
    println("0. Sair")

    when (readLine()?.toIntOrNull()) {
        1 -> calcularAreaRetangulo()
        2 -> calcularAreaTrianguloEquilatero()
        3 -> calcularAreaTrianguloIsosceles()
        4 -> calcularAreaTrianguloEscaleno()
        5 -> calcularAreaCircunferencia()
        6 -> calcularAreaLosango()
        7 -> calcularAreaTrapezio()
        else -> {
            println("Opção inválida.")
            menu()
        }
    }
}

fun calcularAreaTrianguloEquilatero() {
    println("Digite o lado do triângulo equilátero:")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (sqrt(3.0) / 4) * lado.pow(2)
    println("A área do triângulo equilátero é: $area")
    menu()
}

fun calcularAreaTrianguloIsosceles() {
    println("Digite a base do triângulo isósceles:")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o lado igual do triângulo isósceles:")
    val ladoIgual = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (base / 4) * sqrt(4 * ladoIgual.pow(2) - base.pow(2))
    println("A área do triângulo isósceles é: $area")
    menu()
}

fun calcularAreaTrianguloEscaleno() {
    println("Digite o lado A do triângulo escaleno:")
    val ladoA = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o lado B do triângulo escaleno:")
    val ladoB = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o lado C do triângulo escaleno:")
    val ladoC = readLine()?.toDoubleOrNull() ?: 0.0
    val s = (ladoA + ladoB + ladoC) / 2
    val area = sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC))
    println("A área do triângulo escaleno é: $area")
    menu()
}

fun calcularAreaCircunferencia() {
    println("Digite o raio da circunferência:")
    val raio = readLine()?.toDoubleOrNull() ?: 0.0
    val area = Math.PI * raio.pow(2)
    println("A área da circunferência é: $area")
    menu()
}

fun calcularAreaLosango() {
    println("Digite a diagonal maior do losango:")
    val diagonalMaior = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite a diagonal menor do losango:")
    val diagonalMenor = readLine()?.toDoubleOrNull() ?: 0.0
    val area = (diagonalMaior * diagonalMenor) / 2
    println("A área do losango é: $area")
    menu()
}

fun calcularAreaTrapezio() {
    println("Digite o comprimento da base maior do trapézio:")
    val baseMaior = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o comprimento da base menor do trapézio:")
    val baseMenor = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite a altura do trapézio:")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    val area = ((baseMaior + baseMenor) * altura) / 2
    println("A área do trapézio é: $area")
    menu()
}

fun calcularAreaRetangulo() {
    println("Digite a largura do retângulo:")
    val largura = readLine()?.toDoubleOrNull() ?: 0.0

    println("Digite a altura do retângulo:")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val area = largura * altura
    println("A área do retângulo é: $area")
    menu()
}