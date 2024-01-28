class Persona(
    var nombre: String?,
    var peso: Double,
    var altura: Double
) {
    private fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    private fun obtenerDescImc(): TipoIMC {
        val imc = calcularIMC()

        return when {
            imc < 18.5 -> TipoIMC.PESO_INSUFICIENTE
            imc in 18.5..24.9 -> TipoIMC.PESO_SALUDABLE
            imc in 25.0..29.9 -> TipoIMC.SOBREPESO
            else -> TipoIMC.OBESIDAD
        }
    }

    fun saludar(): String {
        return "Hola, soy $nombre."
    }

    fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    fun pesoEncimaMedia(): Boolean {
        return peso >= 70
    }

    fun obtenerDesc(): String {
        val descAltura = if (alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val descPeso = if (pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val tipoIMC = obtenerDescImc()

        return "$nombre con una altura de $altura m ($descAltura) y un peso de $peso kg ($descPeso) tiene un IMC de ${calcularIMC()} ($tipoIMC)"
    }

    override fun toString(): String {
        return "Persona (Nombre: $nombre, Peso: $peso kg, Altura: $altura m)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (nombre != other.nombre) return false
        if (peso != other.peso) return false
        if (altura != other.altura) return false

        return true
    }
}
