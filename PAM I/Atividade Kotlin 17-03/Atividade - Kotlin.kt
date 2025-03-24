fun main() {
    val numero = 10
    if (numero > 0) {
        println("Número positivo")
    } else {
        println("Número negativo ou zero")
    }
    val opcao = 2
    when (opcao) {
        1 -> println("Opção 1 escolhida")
        2 -> println("Opção 2 escolhida")
        3 -> println("Opção 3 escolhida")
        else -> println("Opção inválida")
    }

    // Caso 3: Estrutura de repetição FOR
    for (i in 1..5) {
        println("Contagem: $i")
    }

    // Array para os próximos casos
    val lista = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    // Caso 4: Exibir todos os itens do array
    println("Elementos do array:")
    for (item in lista) {
        println(item)
    }

    // Caso 5: Exibir o 6º elemento do array (índice 5)
    println("O 6º elemento do array é: ${lista[5]}")

    // Caso 6: Estrutura de repetição usando While
    var contador = 0
    while (contador < 5) {
        println("While loop contador: $contador")
        contador++
    }

    // Orientação a Objetos com funções matemáticas
    println("Soma: ${soma(5, 3)}")
    println("Subtração: ${subtracao(10, 4)}")
    println("Multiplicação: ${multiplicacao(6, 7)}")
    println("Divisão: ${divisao(20, 4)}")
}

// Caso 7: Função de soma
fun soma(a: Int, b: Int): Int {
    return a + b
}

// Caso 8: Função de subtração
fun subtracao(a: Int, b: Int): Int {
    return a - b
}

// Caso 9: Função de multiplicação
fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

// Caso 10: Função de divisão
fun divisao(a: Int, b: Int): Int {
    if (b == 0) {
        println("Erro: divisão por zero")
        return 0
    }
    return a / b
}
