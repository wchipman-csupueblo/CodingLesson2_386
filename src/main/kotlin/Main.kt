import java.util.*

fun main(args: Array<String>) {
    //sumAverageDoubleArray()
    //stringArrayFunction()
    isFoundInIntArray()
}

fun sumAverageDoubleArray() {
    val s = Scanner(System.`in`)

    println("Enter number of elements in the double array")
    val size = s.nextInt()

    val doubleArray = DoubleArray(size)

    println("Enter Array Elements: ")

    for(i in doubleArray.indices){
        print("doubleArray[$i]: ")
        doubleArray[i] = s.nextDouble()
    }

    var sum: Double = 0.toDouble()

    for( i in doubleArray.indices) {
        sum += doubleArray[i]
    }

    val avg = sum/doubleArray.size

    println("Array: ${doubleArray.contentToString()}")
    println("Sum of Elements: $sum")
    println("Average of Elements: $avg")



    println("Sum of Elements: ${doubleArray.sum()}")
    println("Average of Elements: ${doubleArray.average()}")
}

fun stringArrayFunction() {
    val s = Scanner(System.`in`)

    println("Enter number of elements in the String array:")
    val size = s.nextInt()

    val strArray = Array<String>(size){""}

    println("Enter String Array Elements: ")
    for (i in strArray.indices) {
        print("strArray[$i]: ")
        strArray[i] = readlnOrNull().toString()
    }
    println("String Array Elements: ${strArray.contentToString()}")

    val reversedArray = strArray.reversedArray()
    println("Reversed string array elements: ${reversedArray.contentToString()}")

    val ascSortedArray = strArray.sortedArray()
    println("Sorted Asc string array elements: ${ascSortedArray.contentToString()}")

    val desSortedArray = strArray.sortedArrayDescending()
    println("Sorted descending string array elements: ${desSortedArray.contentToString()}")
}

fun isFoundInIntArray() {
    val scanner = Scanner(System.`in`)

    print("enter number of elements in the array: ")
    val size = scanner.nextInt()

    val intArray = IntArray(size)

    println("Enter Int Array Elements:")
    for(i in intArray.indices) {
        print("intArray[$i]: ")
        intArray[i] = scanner.nextInt()
    }
    println("Array: ${intArray.contentToString()}")

    println("Enter integer number to be searched in Array: ")
    val num = scanner.nextInt()

    var isFound = false
    var itemAt = 0

    for(item in intArray) {
        if(item == num) {
            isFound = true
            itemAt = intArray.indexOf(item)
            break
        }
    }

    if (isFound){
        println("$num found in Array at index $itemAt")
    } else {
        System.err.println("$num not found in array")
    }

    val isFound2 = intArray.contains(num)
    if (isFound2) {
        println("$num found in Array")
    }else {
        System.err.println("$num not found in array")
    }

}