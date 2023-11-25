import java.util.Scanner

fun main(args: Array<String>) {
    val store = Store()
    val user = User("kylymbek","Улица Кожонбердиева106 ").apply { balance += 75000 }

    val scanner = Scanner(System.`in`)
    store.printAllProducts()
    println("Введите ID товара для покупки: ")
    val product = scanner.nextInt()

    with(store){
        buy(product,user)
    }
}
