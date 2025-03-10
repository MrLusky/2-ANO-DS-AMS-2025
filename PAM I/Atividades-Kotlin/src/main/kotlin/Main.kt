fun main() {
    //EXERCÍCIO 1 & 2

    var nome = "Lucas"
    println("Meu nome é $nome")
    //A existência desse comentário junto do código elimina ambos os exercícios 1 e 2


    //EXERCÍCIO 3

    val a = 90
    val b = 40

    val multi = a * b
    val divis = a / b
    val soma = a + b
    val subtra = a - b

    println("Soma: $soma" + ", " + "subtração: $subtra" + ", " + "divisão: $divis" + ", " + "multiplicação: $multi")

    //EXERCÍCIO 4

    val c = 90
    val d = 40

    val areaRetangulo = c * d

    println("A área do retângulo é: $areaRetangulo")

    //EXERCÍCIO 5

    fun exibirMensagem(mensagem: String) {
        println(mensagem)
    }
        exibirMensagem("Toma uma mensagem na sua tela XD")

    //EXERCÍCIO 6

    val arrayInt :Array<Int> = arrayOf(1, 2, 3, 4)

    //passando o índice 2 para acessar o valor da posição 2 do array

    val x = arrayInt[2]
    println(x)

    //na prática, ele vai mostrar o número 3, porque dentro do Array, os elementos são lidos como "0, 1, 2, 3"

    //EXERCÍCIO 7

    val lista = mutableListOf(1, 2, 3, 4) //esse "mutable" serve para alterar os valores da lista mesmo sendo uma variável imutável
    lista.add(5)

    println(lista)

    //EXERCÍCIO 8

    val senha = "123"

    if(senha == "123"){
        println("Acesso concedido")
    } else {
        println("Senha incorreta")
    }

    //EXERCÍCIO 9

    val e = 10
    val f = 5

    if(e > f){
        println("$e é maior que $f")
    } else {
        println("$e é menor que $f")
    }

    //EXERCÍCIO 10

    val lista2 = listOf(1, 2, 3, 4)

    for (i in lista2) {
        println("Item: $i")
    }
}