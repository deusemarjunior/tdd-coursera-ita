package exemplo

import org.junit.Assert
import org.junit.Test
import java.util.*
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
    @Test
    fun empilhaDesempilha(){
        var pilha = Pilha()
        pilha.empilha("primeiro")
        pilha.empilha("segundo")
        Assert.assertEquals(2 ,pilha.tamanho())
        Assert.assertEquals("segundo",pilha.topo())
        var desemplilhado = pilha.desempilha()
        Assert.assertEquals(1 ,pilha.tamanho())
        Assert.assertEquals("segundo", desemplilhado)

    }
}
