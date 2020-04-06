class Tradutor {

    private var traducao: String? = null;

    fun estaVazio(): Boolean {
        return (traducao == null)
    }

    fun adiconaPalavra(palavra: String, traducao: String) {
        this.traducao = traducao
    }

    fun traduzir(palavra: String): String? {
        return  this.traducao
    }

}
