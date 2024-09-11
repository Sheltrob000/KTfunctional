fun main() {
    val celToFah: (Double) -> Double = {
        it * (9.0 / 5.0) + 32
    }

    val kelToCel: (Double) -> Double = {
        it + 273.15
    }

    val fahToKell : (Double) -> Double = {
        (5.0/9.0) * (it - 32) + 273.15
    }

    printFinalTemperature(27.0, "Celsius", "Farenheight", celToFah)
    printFinalTemperature(350.0, "kelvin","Celcius", kelToCel)
    printFinalTemperature(10.0, "Fahrnheit", "Kelvin", fahToKell)

}






    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ) {
        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
    }