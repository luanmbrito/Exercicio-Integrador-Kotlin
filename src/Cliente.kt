class Cliente(nome: String, rg:String,compras:String) : Pessoa(nome,rg) {
    var compras = compras


    fun mostrarHistorico(){
        println("Nome: $nome - RG: $rg")
        println("------ Meu Historico ----")
        historicoAluguel.forEach{
            println(it)
        }
    }
}