package exemplo

import java.util.*

class Pilha {

    private var elemento: String? = null
    private var quantidade: Int = 0

    fun estaVazia(): Boolean {
        return (elemento == null);
    }

    fun tamanho(): Int {
        return quantidade
    }

    fun empilha(elemento: String) {
        this.elemento = elemento
        quantidade++
    }

    fun topo(): String? {
        return elemento
    }

}
