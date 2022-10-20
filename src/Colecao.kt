class Colecao(codigo: Int, titulo: String, autor: String, anoLancamento: String, precoVenda: Double,
              precoAluguel: Double, estadoAtual: String, genero: String,
):Livro(codigo, titulo, autor,
    anoLancamento,
    precoVenda, precoAluguel, estadoAtual, genero
){

    var listaLivroColecao = mutableListOf<List<Livro>>()

}
