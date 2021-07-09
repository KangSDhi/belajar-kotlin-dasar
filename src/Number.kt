fun main(){

    // integer point number
    var age: Byte = 127
    var distance: Short = 2000
    var height: Int = 170
    var balance: Long = 1000000000L
    println(balance)

    // floating point number
    var sample: Float = 10.10F
    var sample0: Double = 9000000.0
    println(sample0)

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b1011
    println(binaryLiteral)

    // underscore in number
    var x: Byte = 3_0
    var y: Int = 1_7_0
    var xy: Long = 100_000_000L
    println(xy)

    var number: Int = 1000
    // conversion
    var byte: Byte = number.toByte()

    println(byte)
}