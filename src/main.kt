fun main(){
    var livraria = Livraria("Amazon","23/09/2020")

    var livro1 = Livro(1,"Harry Potter Pedra Filosofal","J.K Rowling",
        "10/02/2018",20.0,5.0,"Disponivel","Fantasia")

    var livro2 = Livro(2,"Harry Potter Camara Secreta","J.K Rowling",
        "10/02/2019",20.0,10.0,"Alugado","Fantasia")

    var livro3 = Livro(3,"Harry Potter Prisioneiro de Askaban","J.K Rowling",
        "10/02/2019",20.0,10.0,"Vendido","Fantasia")

    var livro4 = Livro(4,"Harry Potter Ordem da Fenix","J.K Rowling",
        "10/02/2019",50.0,20.0,"Vendido","Fantasia")

    var livro5 = Livro(5,"Harry Potter Enigma do Principe","J.K Rowling",
        "10/02/2019",30.0,15.0,"Alugado","Fantasia")

    var colecao1 = Colecao(1,"Harry Potter","J.K Rowling",
        "23/02/2020",100.0,50.0,"Disponivel","Fantasia")

    var colecao2 = Colecao(2,"Senhor dos Aneis","R.R Tolkien",
        "23/02/2020",100.0,50.0,"Disponivel","Obra Prima")

    var colecao2 = Colecao(2,"Biblia","Padre Kielmon",
        "23/02/2020",100.0,50.0,"Disponivel","Ficção")    

    var cliente = Cliente("Luan","1232134325","")
    var cliente = Cliente("Guilherme","1140028922","")

    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro3)
    livraria.cadastrarLivro(livro4)
    livraria.cadastrarLivro(livro5)
    livraria.cadastrarColecao(colecao1, mutableListOf(livro1,livro2))
    livraria.alugarLivro(1,cliente)
    println("---- Historico do Cliente ----")
    cliente.mostrarHistorico()

    println("------- Verificando Estoque ------")
    livraria.verificarEstoque()


}















