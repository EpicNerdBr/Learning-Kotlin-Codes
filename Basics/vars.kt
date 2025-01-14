package org.EpicNerd

fun main() {
    val totalTickets = 8
    var totalBucketsOfPopcorn = 9
    var totalCustomers = 7

    // Exibindo a situação inicial
    println("Existem $totalTickets ingressos, $totalBucketsOfPopcorn baldes de pipoca e $totalCustomers clientes na fila.")

    // Um cliente desistiu
    totalCustomers--  // Também poderíamos definir diretamente: totalCustomers = 6

    // Exibindo a situação após a desistência
    println("Após uma desistência, existem $totalTickets ingressos, $totalBucketsOfPopcorn baldes de pipoca e $totalCustomers clientes na fila.")
}
