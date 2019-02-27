package udemy.fausto.com.ej_3_6_naipes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------->")

        val carta1 = Carta(Numero.Caballo, Palo.ESPADAS)
        val carta2 = Carta(Numero.Sota, Palo.BASTOS)
        val carta3 = Carta(Numero.Tres, Palo.ESPADAS)
        val carta4 = Carta(Numero.Caballo, Palo.OROS)

        val jugador1Mus = arrayOf(carta1, carta2, carta3, carta4)
        println(jugador1Mus[0].numero)
        println(jugador1Mus[0].palo)
    }
}

enum class Numero(num: Int) {
    As (1),
    Dos(2),
    Tres(3),
    Cuatro(4),
    Cinco(5),
    Seis(6),
    Siete(7),
    Sota(10),
    Caballo(11),
    Rey(12)
}

enum class Palo{
    OROS,
    COPAS,
    ESPADAS,
    BASTOS
}

class Carta (val numero: Numero, val palo: Palo)