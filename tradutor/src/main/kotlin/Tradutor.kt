class Tradutor {

    var traducao = HashMap<String,String>()

    fun estaVazio(): Boolean {
        return traducao.isEmpty()
    }

    fun adiconaTraducao(palavra: String, palavraTraduzida: String) {
        traducao[palavra]= palavraTraduzida
    }

    fun traduzir(palavra: String): String? {
        return  traducao.get(palavra)
    }
}
