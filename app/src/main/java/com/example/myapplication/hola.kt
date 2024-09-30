package com.example.myapplication

    fun main(){
        //Ejercicio 1
        var edad=60
        var nombre="Gaspar"
        var altura=1.25f
        //Ejercicio 2
        val PI=3.14159f
        var radio=1
        var c=rad(PI,radio)
        println(c)
        //Ejercicio 3
        saludar("Pepito",54);
        //Ejercicio 4
        informacionPersonal("Pepe",54,"Madrid")
        //Ejercicio 5
        println(cToF(33f))
        println(fToC(77f))
    }
    //Ejercicio 2
    fun rad(a: Float, b: Int): Float {
        var c=a*(b*b)
        return c
    }
    //Ejercicio 3
    fun saludar(a: String="",b: Int=1){
        println("Hola $a, tienes $b años.")
    }
    //Ejercicio 4
    fun informacionPersonal(no: String="", ed: Int=1, ciu: String=""){
        println("Hola $no, tienes $ed y vives en $ciu")
    }

    //Ejercicio 5
    fun cToF(cel: Float): Float{
        var c=(cel-32)*5/9
        return c
    }
    fun fToC(cel: Float): Float{
        var c=(cel*9/5)+32
        return c
    }
