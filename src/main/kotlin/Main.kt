fun main() {
    // Crear una estructura de datos con 5 personas
    val personas = listOf(
        Persona("Julia", 64.7, 1.72),
        Persona("Carlos", 80.5, 1.80),
        Persona("Elena", 55.0, 1.65),
        Persona("Pedro", 70.2, 1.75),
        Persona("Luisa", 60.8, 1.68)
    )

    // Recorrer la estructura y mostrar saludo y descripción completa de cada persona
    for (persona in personas) {
        println(persona.saludar())
        println(persona.obtenerDesc())
        println()
    }
}
