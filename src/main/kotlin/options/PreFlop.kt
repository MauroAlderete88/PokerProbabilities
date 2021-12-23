package options

class PreFlop(jugadores:Int?, cartas:String?) {

    private val jugadores : Int? = jugadores
    private val cartas : String? = cartas

    var FirstCard =""
    var SecondCard =""
    var players = 0

    /**
     * Este metodo es una tuberia de funciones que va de clase en clase
     * para ejecutar el calculo en tod0 el proceso. El proceso seria :
     *  pre-flop - flop - turn - river
     */
    fun executeAllGame(){
        convertHand()
        mensaje()
    }


    /**
     * Obtiene la primera carta, la segunda carta y la cantidad de players.
     */
    private fun convertHand(){
        if (cartas?.length==4){
             FirstCard = cartas?.substring(0,2)
             SecondCard = cartas?.substring(2,4)

            if (jugadores?:0 >=1 || jugadores?:0 <=8){
             players = jugadores!!
            }else{
             println("Numero de jugadores incorrectos. (1 al 8)")
            }

        } else{
            println("Las cartas fueron mal ingresada. Revisar en ayuda el glosario.")
        }
    }

    private fun updatePlayers(){
        print("Ingresar numero actual -> ")
        players = readLine()?.toInt() ?: players
        mensaje()
    }

    private fun mensaje(){
        println("(a)ActualizarPlayers    (c)Continuar a flop    (s)Salir")
        when(readLine()){
            "a"-> updatePlayers()
            "c"-> println()
            "s"-> println()
            else->{ println("No existe ese valor")
                 mensaje() }
        }
    }



}