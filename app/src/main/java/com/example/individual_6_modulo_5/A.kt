import kotlin.math.ceil
import java.text.NumberFormat
import java.util.Locale

// Función suma que recibe un número de tipo Double y otro de tipo Float y retorna la suma
fun suma(num1: Double, num2: Float): Double {
    return num1 + num2
}

// Función redondeo que redondea hacia arriba un número de tipo Double
fun redondeo(num: Double): Double {
    return ceil(num)
}

// Función muestraResultado que formatea el número como moneda
fun muestraResultado(num: Double) {
    val formatoMoneda = NumberFormat.getCurrencyInstance(Locale("es", "ES")) // Formato de moneda espaÃ±ola
    println(formatoMoneda.format(num))
}

fun main() {
    // Ejemplo de uso de las funciones
    val numero1 = 45.67
    val numero2 = 12.34f

    // Uso de la función suma
    val resultadoSuma = suma(numero1, numero2)
    println("Resultado de la suma: $resultadoSuma")

    // Uso de la función redondeo
    val resultadoRedondeo = redondeo(resultadoSuma)
    println("Resultado redondeado: $resultadoRedondeo")

    // Uso de la función muestraResultado para mostrar el nÃºmero en formato de moneda
    muestraResultado(resultadoRedondeo)
}