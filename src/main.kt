fun main() {

//    CREATE A LISTS
    val numbers = mutableListOf<Int>(1,2,3,4,5,6)
    println("List:" +numbers)

    //ADDING ELEMENTS
    var include = numbers.add(15)
    println("The new number:"+ include)
    var addEl = numbers.addAll(7, setOf(10,18))
    println(addEl)

    //REMOVING ELEMENTS
    var removEL = numbers.removeAt(3)
    println("The removed num:"+removEL)
    println(numbers.filter { x-> x%2==0 })

//RETRIEVE THE SIZE OF A LIST.
    var totalSize = numbers.size
    println("The size is is "+totalSize)

//    ACCESS LIST ELEMENTS.
    var accessEl = numbers[3]
    println("Third elemnt:"+accessEl)
    var getEl = numbers.get(5)
    println("Fith element:" +getEl)

//    Print the last element of the list, using numbers.size - 1
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")

//    Kotlin also supports first() and last() operations on a list.
    var first = numbers.first()
    println("First:"+first)

    var last = numbers.last()
    println("Last:"+last)
    //finding the index of number six
    //numbers.first() returns the first element of the list and numbers.last()
    // returns the last element of the list.
    println("The index of number six:" + numbers.indexOf(6))
    println("The index of number one:" + numbers.indexOf(1))

    // Use the contains() method
    var contEl = numbers.contains(6)
    println(contEl)

    var notEl = numbers.contains(8)
    println(notEl)

// Lists are read-only
    var color = listOf<String>("green", "blue", "red")

}
