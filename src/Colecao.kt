class Colecao(codigo: Int, titulo: String, autor: String, anoLancamento: String, precoVenda: Double,
              precoAluguel: Double, estadoAtual: String,
):Livro(codigo, titulo, autor,
    anoLancamento,
    precoVenda, precoAluguel, estadoAtual
){

    var listaLivroColecao = mutableListOf<List<Livro>>()

}