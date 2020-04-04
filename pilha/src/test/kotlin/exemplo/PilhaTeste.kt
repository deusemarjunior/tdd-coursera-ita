package exemplo

import org.junit.Assert
import org.junit.Test

class PilhaTeste {

    @Test
    fun pilhaVazia(){
        var pilha = Pilha()
        assert(pilha.estaVazia())
        Assert.assertEquals(0,pilha.tamanho())
    }
}