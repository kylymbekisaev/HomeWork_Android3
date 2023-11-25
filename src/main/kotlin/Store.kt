class Store {
    val products = mapOf(
        1 to Product("Велосипед",500),
        2 to Product("Телефон",1200),
        3 to Product("Машина",2000)

    )

    fun printAllProducts() {
        products.forEach { (id, product) ->
            println("ID: $id, Название: ${product.name}, Цена: ${product.price}")
        }
    }

    fun buy(productId: Int, user: User) {
        when (productId) {
            in products.keys -> {
                val product = products[productId]
                product?.let {
                    val price = it.price
                    println("Вы купили: ${it.name}")
                    println("Списано с баланса: $price")
                    println("Адрес доставки: ${user.address}")
                    user.balance -= price
                    println("Остаток на балансе: ${user.balance}")
                }
            }
            else -> println("Вы ввели неверный id товара")
        }
    }
}