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
}
