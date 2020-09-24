abstract class Pessoa(nome:String,rg:String){
    var listaLivro = mutableListOf<Livro>()
        var nome = nome
        var rg = rg
        var historicoAluguel = mutableListOf<String>()


}