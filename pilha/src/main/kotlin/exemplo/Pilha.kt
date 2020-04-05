package exemplo

import java.util.*

class Pilha {

    var elementos = Array(10){ String()}
    var quantidade: Int = 0

    fun estaVazia(): Boolean {
        return quantidade == 0;
    }

    fun tamanho(): Int {
        return quantidade
    }

    fun empilha(elemento: String) {
        this.elementos[quantidade] = elemento
        quantidade++
    }

    fun topo(): String {
        return elementos[quantidade-1]
    }

    fun desempilha(): String {
        var topo:String = topo()
        quantidade--
        return topo
    }

}
