package exemplo

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.fail

class PilhaTeste {

     private var pilha: Pilha = Pilha(10)

    @Test
    fun pilhaVazia(){
        assert(pilha.estaVazia())
        Assert.assertEquals(0,pilha.tamanho())
    }

    @Test
    fun empilhaUmElemento(){
        pilha.empilha("primeiro")
        assertFalse(pilha.estaVazia())
        Assert.assertEquals(1 ,pilha.tamanho())
        Assert.assertEquals("primeiro",pilha.topo())
    }
    @Test
    fun empilhaDesempilha(){
        pilha.empilha("primeiro")
        pilha.empilha("segundo")
        Assert.assertEquals(2 ,pilha.tamanho())
        Assert.assertEquals("segundo",pilha.topo())
        var desemplilhado = pilha.desempilha()
        Assert.assertEquals(1 ,pilha.tamanho())
        Assert.assertEquals("segundo", desemplilhado)
    }

    @Test(expected = PilhaException::class)
    fun removerDaPilhaVazia(){
        pilha.desempilha()
    }

    @Test
    fun adicionarPilhaCheia(){
        for(i in 1..10){
            pilha.empilha("elemento "+ i)
        }

        var result = try {
            pilha.empilha("boom")
            fail()
        }catch (e: PilhaException){ }
    }
}
