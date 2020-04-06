class Tradutor {

    var traducoes = HashMap<String,String>()

    fun estaVazio(): Boolean {
        return traducoes.isEmpty()
    }

    fun adiconaTraducao(palavra: String, palavraTraduzida: String) {
        var traducao = palavraTraduzida
        if (traducoes.containsKey(palavra)){
            traducao = traduzir(palavra) + ", " + traducao
        }
        traducoes[palavra]= traducao
    }

    fun traduzir(palavra: String): String? {
        return  traducoes.get(palavra)
    }

    fun traduzirFrase(frase: String): String {
        var palavras = frase.split(" ")
        var fraseTraduzida = ""
        for(palavra :String in palavras){
            var traducao = traduzir(palavra)
            traducao = primeiraTraducao(traducao)
            fraseTraduzida += " " + traducao
        }
        return fraseTraduzida.trim()
    }

    private fun primeiraTraducao(traducaoParam: String?): String? {
        var traducao = traducaoParam
        if (traducao != null && traducao.contains(","))
            traducao = traducao.substring(0, traducao.indexOf(","))
        return traducao
    }
}
