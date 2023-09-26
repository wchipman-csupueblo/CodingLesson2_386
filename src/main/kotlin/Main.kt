import java.util.*

fun main(args: Array<String>) {
    sumAverageDoubleArray()
    stringArrayFunction()
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