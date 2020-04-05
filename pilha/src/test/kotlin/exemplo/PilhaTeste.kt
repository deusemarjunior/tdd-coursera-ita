package exemplo

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertFalse

class PilhaTeste {

    @Test
    fun pilhaVazia(){
        var pilha = Pilha()
        assert(pilha.estaVazia())
        Assert.assertEquals(0,pilha.tamanho())
    }

    @Test
    fun empilhaUmElemento(){
        var pilha = Pilha()
        pilha.empilha("primeiro")
        assertFalse(pilha.estaVazia())
        Assert.assertEquals(1 ,pilha.tamanho())
        Assert.assertEquals("primeiro",pilha.topo())
    }
}
