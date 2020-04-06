import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TradutorTeste {

    lateinit var t: Tradutor

    @Before
    fun iniciaTradutor(){
        t = Tradutor()
    }

    @Test
    fun tradutorSemPalavras(){
        assertTrue(t.estaVazio())
    }

    @Test
    fun  umaTraducao(){
        t.adiconaTraducao("bom","good")
        assertFalse (t.estaVazio())
        assertEquals("good",t.traduzir("bom"))
    }

    @Test
    fun  duasTraducoes(){
        t.adiconaTraducao("bom","good")
        t.adiconaTraducao("mau","bad")
        assertEquals("good",t.traduzir("bom"))
        assertEquals("bad",t.traduzir("mau"))
    }

    @Test
    fun  duasTraducoesMesmaPalavra(){
        t.adiconaTraducao("bom","good")
        t.adiconaTraducao("bom","nice")
        assertEquals("good, nice",t.traduzir("bom"))
    }

    @Test
    fun  traduzirFrase(){
        t.adiconaTraducao("guerra","war")
        t.adiconaTraducao("é","is")
        t.adiconaTraducao("ruim","bad")
        assertEquals("war is bad",t.traduzirFrase("guerra é ruim"))
    }
}