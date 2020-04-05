package exemplo

class Pilha (maximo:Int) {

    val elementos: Array<String>
    var quantidade: Int = 0


    init{
        elementos = Array(maximo){String()}
    }

    fun estaVazia(): Boolean {
        return quantidade == 0;
    }

    fun tamanho(): Int {
        return quantidade
    }

    fun empilha(elemento: String) {
        if(quantidade == elementos.size)
            throw PilhaException("Pilha Cheia! Não é possível adicionar mais elementos")
        this.elementos[quantidade] = elemento
        quantidade++
    }

    fun topo(): String {
        return elementos[quantidade-1]
    }

    fun desempilha(): String {
        if(estaVazia())
             throw  PilhaException("Pilha Vazia! Não é possível remover elementos")
        var topo:String = topo()
        quantidade--
        return topo
    }

}
