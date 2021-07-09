fun main(){
    var firstName: String = "Sigit"
    var lastName: String = "Boworaharjo"
    var address: String = """
        >Desa Tulungrejo,
        >RT. 06 RW. 01
        >Kec. Trucuk
        >Kab. Bojonegoro
    """.trimMargin(">")
    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}