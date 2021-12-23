import options.AboutMe
import options.PreFlop

fun main(args: Array<String>) {
    var bandera = true
    val ManagerIU = ManagerIU()

    println(" *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *   *  *  *  *  *  *  *  *  *  *")
    println(" * Bienvenidos a mi programa,este es un programa de calculo para manos de poker variante holdem*")
    println(" *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *   *  *  *  *  *  *  *  *  *  *")

    println()
    do {
        println(" *  *  *  *  *  *  *  * menu de navegacion  *  *  *  *  *  *  *  *  *  *  *")
        println(" (1)preflop  (2)flop  (3)turn  (4)river  (5)Ayuda  (6)AcercaDe  (7)Salir ")
        print("Tu opcion -> ")


        when(readLine()){
            "1"-> ManagerIU.preFlop()
            "2"-> ManagerIU.flop()
            "3"-> ManagerIU.turn()
            "4"-> ManagerIU.river()
            "5"-> ManagerIU.help()
            "6"-> ManagerIU.about()
            "7"-> bandera = false
            else-> println("Por favor seleccione una opcion del menu.")
        }

    } while (bandera);run {
        println("*** Programa finalizado ***")
    }
}

class ManagerIU(){

    fun preFlop() {
        val PreFlop = PreFlop(4,"asda")
        PreFlop.executeAllGame()

    }

    fun flop() {
        TODO("Not yet implemented")
    }

    fun turn() {
        TODO("Not yet implemented")
    }

    fun river() {
        TODO("Not yet implemented")
    }

    fun help() {
        TODO("Not yet implemented")
    }

    fun about() {
       val AboutMe = AboutMe()
           AboutMe.presentation()
    }


}