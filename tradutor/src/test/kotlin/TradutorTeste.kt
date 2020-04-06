import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TradutorTeste {

    @Test
    fun tradutorSemPalavras(){
       var t = Tradutor()
        assertTrue(t.estaVazio())
    }
}