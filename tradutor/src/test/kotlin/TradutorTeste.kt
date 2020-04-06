import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TradutorTeste {

    @Test
    fun tradutorSemPalavras(){
       var t = Tradutor()
        assertTrue(t.estaVazio())
    }

    @Test
    fun  umaTraducao(){
        var t = Tradutor()
        t.adiconaTraducao("bom","good")
        assertFalse (t.estaVazio())
        assertEquals("good",t.traduzir("bom"))
    }
}