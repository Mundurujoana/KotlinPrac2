fun main() {
//In earlier codelabs, you learned about basic data types in Kotlin such as Int, Double, Boolean, and String. They allow you to store a certain type of value within a variable. But what if you want to store more than one value? That is where having a List data type is useful.
//
//A list is a collection of items with a specific order. There are two types of lists in Kotlin:
//
//Read-only list: List cannot be modified after you create it.
//Mutable list: MutableList can be modified after you create it, meaning you can add, remove, or update its elements.
//INTRODUCTION TO LISTS
//    CREATE A LISTS
    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    println("List:" +numbers)

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
    val colors = listOf("green", "orange", "blue")
  var resveEl =colors.reversed()
    println(resveEl)
    println("The reversed list:"+colors)
    var sortEl =colors.sorted()
    println("The sorted list:"+sortEl)

    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")

    //INTRODUCTION TO MUTABLE LISTS
    //Mutable lists are lists that can be modified after creation.
// You can add, remove, or change items.
    val entrees = mutableListOf<String>()
    println("The list: $entrees")

   //ADDING ELEMENTS
    var adEL = entrees.add("noodles")
    println("The new added element: $adEL")
    println(entrees)
    var addMoree = listOf<String>("macroon", "rice", "wheat", "sphageti")
    println("The new list: ${entrees.addAll(addMoree)} ")
    println(entrees)

    //REMOVE ELEMENTS FROM THE LIST
    var remEl = entrees.remove("sphageti")
    println(remEl)
    println(entrees)

//Remove an item that doesn't exist in the list
    //The remove() method returns false, because the element does not exist and
    // therefore could not be removed
    println(entrees.remove("beans"))
    println(entrees)

//Remove an item using removeAt() with an index
// You can also specify the index of the element to remove.
// Use removeAt() to remove the item at index 0.
println("Remvove the third element:"+ " " +entrees.removeAt(2))
    println(entrees)

    // Clear out the list
    var clearELS = entrees.clear()
    println(entrees)

    // Check if the list is empty
    println("is Empty?"+entrees.isEmpty())
    println(entrees)


  //LOOP THROUGH A LIST
  //While loops, A while loop doesn't need to involve a list

    var guestperFam = listOf(1,2,3,4)
    var totalGuest = 0
    var index = 0

    while(index< guestperFam.size) {
        totalGuest += guestperFam[index]
        index++
    }
    println("The Totol guest count:"+ totalGuest)

    //For loops
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names)
         println("$name- the char is ${name.length}")

}
