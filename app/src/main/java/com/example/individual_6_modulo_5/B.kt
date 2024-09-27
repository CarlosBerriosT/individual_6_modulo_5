package com.example.individual_6_modulo_5

// Data class Superhero
data class Superhero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    var photo: String
)

// Función que permite ingresar y mostrar superhéroes
fun agregarSuperheroes(): MutableList<Superhero> {
    val listaSuperheroes = mutableListOf<Superhero>()
    var continuar = true

    while (continuar) {
        // Pedimos los datos del superhéroe
        println("Ingrese el nombre del superhéroe:")
        val nombreSuperhero = readLine() ?: ""

        println("Ingrese la editorial del superhéroe:")
        val editorial = readLine() ?: ""

        println("Ingrese el nombre real del superhéroe:")
        val nombreReal = readLine() ?: ""

        println("Ingrese la URL de la foto del superhéroe:")
        val urlFoto = readLine() ?: ""

        // Creamos un objeto Superhero y lo agregamos a la lista
        val heroe = Superhero(nombreSuperhero, editorial, nombreReal, urlFoto)
        listaSuperheroes.add(heroe)

        // Preguntamos si desea agregar más superhéroes
        println("¿Desea agregar otro superhéroe? (si/no)")
        val respuesta = readLine()?.lowercase() ?: "no"
        continuar = respuesta == "si"
    }

    // Imprimir los datos de todos los superhéroes
    for (heroe in listaSuperheroes) {
        println("\nSuperhéroe: ${heroe.superhero}")
        println("Editorial: ${heroe.publisher}")
        println("Nombre Real: ${heroe.realName}")
        println("Foto: ${heroe.photo}")
    }

    return listaSuperheroes
}

fun main() {
    // Llamada a la función para agregar superhéroes
    agregarSuperheroes()
}