class Livraria(nome:String,dataCriacao:String){
    var listaLivro = mutableListOf<Livro>()
    lateinit var colecao : Colecao

    var nome = nome
    var dataCriacao = dataCriacao

    fun cadastrarLivro(livro:Livro){
        listaLivro.add(livro)
    }

    fun cadastrarColecao(colecao:Colecao,list: List<Livro> ){
        this.colecao = colecao
        this.colecao.listaLivroColecao.add(list)
    }

    fun consultaLivro(codigo:Int){
        var indexLivro : Int = -1

        for (x in 0..listaLivro.size -1){
            if(listaLivro[x].codigo == codigo){
                indexLivro = x
            }
        }

        if(indexLivro != -1)
        {
            println("Codigo: ${listaLivro[indexLivro].codigo} " +
                    "- Titulo: ${listaLivro[indexLivro].titulo} " +
                    "- Autor: ${listaLivro[indexLivro].autor} - " +
                    "ano de Lançamento: ${listaLivro[indexLivro].anoLancamento} " +
                    " - Preco de Venda : ${listaLivro[indexLivro].precoVenda} " +
                    "- Preco de Aluguel: ${listaLivro[indexLivro].precoAluguel} " +
                    "- Estado AtuaL: ${listaLivro[indexLivro].estadoAtual}")
        }
        else{
            println("Esse livro não existe")
        }


        if(colecao.codigo.equals(codigo))
        {
            println("Codigo: ${colecao.codigo} " +
                    "- Titulo: ${colecao.titulo} " +
                    "- Autor: ${colecao.autor} - " +
                    "ano de Lançamento: ${colecao.anoLancamento} " +
                    " - Preco de Venda : ${colecao.precoVenda} " +
                    "- Preco de Aluguel: ${colecao.precoAluguel} " +
                    "- Estado AtuaL: ${colecao.estadoAtual}")
        }
        else{
            println("Essa coleção não existe")
        }



    }

    fun alugarLivro(codigoColecao: Int,cliente: Cliente){
        if(colecao.codigo == codigoColecao){
            cliente.historicoAluguel.add("Coleção ${colecao.codigo} - ${colecao.titulo}")
            colecao.estadoAtual = "Alugado"
        }
        else
        {
            println("Essa coleção não existe")
        }
    }

    fun venda(codigoColecao:Int){
        if(colecao.codigo == codigoColecao)
        {
            println("Coleção: ${colecao.titulo}")
        }
        else
        {
            println("Essa coleção não existe")
        }
    }

    fun verificarEstoque(){
        var livroDisponivel: Int = 0
        var livroAlugado: Int = 0
        var livroVendido : Int = 0
        var totalAlugados : Double = 0.0
        var totalVendido: Double = 0.0

        listaLivro.forEach{ livro ->
            if(livro.estadoAtual == "Disponivel"){
                livroDisponivel += 1
            }

            if(livro.estadoAtual == "Alugado"){
                livroAlugado += 1
                totalAlugados += livro.precoAluguel
            }
            if(livro.estadoAtual == "Vendido"){
                livroVendido += 1
                totalVendido += livro.precoVenda
            }
        }

        println("Livros Disponiveis: $livroDisponivel")
        println("Livros Alugados: $livroAlugado - Valor total dos alugados: ${totalAlugados}")
        println("Livros Vendidos: $livroVendido - Valor total das vendas: $totalVendido")
    }
}