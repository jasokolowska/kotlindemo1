package entities

class Motorcycle (brand: String, val maxSpeed: Int, val color: Color = Color.RED) : Vehicle(brand){

    override fun run() {
        println("Motorcycle started")
    }

    override fun stop() {
        println("Motorcycle stopped")
    }


}


