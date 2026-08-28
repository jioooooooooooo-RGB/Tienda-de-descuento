data class Producto(
    val nombre: String,
    val precio: Double
)
fun main() {
    println("Tiene membresia? ")

    val membresia = readLine()!!
    val productos = arrayOf(
           Producto("camisa", 1499.9),
           Producto("Pantalon", 600.0),
           Producto("Tenis", 1899.9)
    )

    println("Elige que deseas comprar? ")
    println("camisa - 1499.9 ")
    println("Pantalon - 600.0 ")
    println("Tenis - 1899.9")

    val nombre_Elegido = readLine()!!
    val producto_Elegido = productos.find {
        it.nombre.equals(nombre_Elegido, ignoreCase = true)
    }

    if (producto_Elegido != null) {
        compra(producto_Elegido, membresia)
    }
    else{
        println("No se encontro")
    }

}

fun compra(producto: Producto, membresia: String){
    var precio_final = 0.0
    var descuento = 0.80
    if(membresia == "si"){
       if(producto.nombre == "camisa"){
           precio_final = producto.precio * descuento
           println("Has elegido el producto " + producto.nombre)
           println("Y el costo final fue de " + precio_final + " por el uso de su membresia")
           println("precio original " + producto.precio)
       }
       else if(producto.nombre == "Pantalon"){
            precio_final = producto.precio * descuento
           println("Has elegido el producto " + producto.nombre)
           println("Y el costo final fue de " + precio_final + " por el uso de su membresia")
           println("precio original " + producto.precio)
       }
        else if(producto.nombre == "Tenis"){
            precio_final = producto.precio * descuento
           println("Has elegido el producto " + producto.nombre)
           println("Y el costo final fue de " + precio_final + " por el uso de su membresia")
           println("precio original " + producto.precio)
        }
    }
    else if(membresia == "no"){
        if(producto.nombre == "camisa"){
            precio_final = producto.precio
            println("Has elegido el producto " + producto.nombre)
            println("Y el costo final fue de " + precio_final)
            println("precio original " + producto.precio)
        }
        else if(producto.nombre == "Pantalon"){
            precio_final = producto.precio
            println("Has elegido el producto " + producto.nombre)
            println("Y el costo final fue de " + precio_final)
            println("precio original " + producto.precio)
        }
        else if(producto.nombre == "Tenis"){
            precio_final = producto.precio
            println("Has elegido el producto " + producto.nombre)
            println("Y el costo final fue de " + precio_final)
            println("precio original " + producto.precio)
        }
    }
    else{
        println("Error")
    }
}

