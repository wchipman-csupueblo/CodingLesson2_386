import java.util.*

fun main() {
    sumAverageDoubleArray()
    stringArrayFunction()
    isFoundInIntArray()
    addTwoIntMatrices()
    multiplyIntMatrices()
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

    val strArray = Array(size){""}

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

fun addTwoIntMatrices() {
    val rows: Int
    val columns: Int

    val scanner = Scanner(System.`in`)

    println("Enter the number of rows and columns of the matrix:")
    rows = scanner.nextInt()
    columns = scanner.nextInt()

    val matrixA = Array(rows){IntArray(columns)}
    val matrixB = Array(rows){IntArray(columns)}

    val matrixSum = Array(rows){IntArray(columns)}

    println("Enter the elements of the first matrix($rows X $columns):")
    for(i in matrixA.indices){
        for(j in matrixA[i].indices) {
            print("matrixA[$i][$j]:")
            matrixA[i][j] = scanner.nextInt()
        }
    }

    println("Enter the elements of the second matrix($rows X $columns):")
    for(i in matrixB.indices){
        for(j in matrixB[i].indices) {
            print("matrixB[$i][$j]:")
            matrixB[i][j] = scanner.nextInt()
        }
    }
    println("Matrix A:")
    for(i in matrixA.indices){
        println("${matrixA[i].contentToString()} ")
    }
    println("Matrix B:")
    for(i in matrixB.indices){
        println("${matrixB[i].contentToString()} ")
    }

    for(i in matrixSum.indices){
        for(j in matrixSum[i].indices){
            matrixSum[i][j]=matrixA[i][j]+matrixB[i][j]
        }
    }
    println("Sum of the Matrices:")
    for(i in matrixSum.indices){
        println("${matrixSum[i].contentToString()} ")
    }
}

fun multiplyIntMatrices() {
    /*
     A = [3 7]
         [4 9]
     B = [6 2]
         [5 8]
        Now each of the elements of product matrix AB can be calculated as follows:

        AB11 = 3 × 6 + 7 × 5 = 53
        AB12 = 3 × 2 + 7 × 8 = 62
        AB21 = 4 × 6 + 9 × 5 = 69
        AB22 = 4 × 2 + 9 × 8 = 80

     AB = [53 62]
          [69 80]

      **Matrix 1 has to have the same number of columns and Matrix 2 has rows**

    C = [3, 4, 5, 6]
        [7, 8, 9, 8]
        [3, 2, 1, 2]

    D = [3, 4]
        [2, 3]
        [4, 5]
        [6, 7]

    CD = [73, 91]
         [121, 153]
         [29, 37]
    */
    val scanner = Scanner(System.`in`)

    print("Enter the number of rows and columns of First matrix : ")
    val rows1   = scanner.nextInt()
    val column1 = scanner.nextInt()

    print("Enter the number of rows and columns of Second matrix : ")
    val rows2   = scanner.nextInt()
    val column2 = scanner.nextInt()

    if(column1 != rows2){
        println("No of Column in first Matrix must be Equal to no of rows in second Matrix !!")
        return
    }

    val matrixA     = Array(rows1) { IntArray(column1) }
    val matrixB     = Array(rows2) { IntArray(column2) }
    val productMatrix   = Array(rows1) { IntArray(column2) }

    println("Enter the Elements of First Matrix ($rows1 X $column1} ): ")
    for(i in matrixA.indices){
        for(j in matrixA[i].indices){
            print("matrixA[$i][$j]: ")
            matrixA[i][j]=scanner.nextInt()
        }
    }

    println("Enter the Elements of Second Matrix ($rows2 X $column2} ): ")
    for(i in matrixB.indices){
        for(j in matrixB[i].indices){
            print("matrixB[$i][$j]: ")
            matrixB[i][j]=scanner.nextInt()
        }
    }

    println("Matrix A : ")
    for(i in matrixA.indices){
        println("${matrixA[i].contentToString()} ")
    }

    println("Matrix B : ")
    for(i in matrixB.indices){
        println("${matrixB[i].contentToString()} ")
    }

    for(i in productMatrix.indices){
        for(j in productMatrix[i].indices){
            for(k in matrixB.indices)
                productMatrix[i][j]=productMatrix[i][j] + (matrixA[i][k] * matrixB[k][j])
        }
    }

    println("Product of the Matrices:")
    for(i in productMatrix.indices){
        println("${productMatrix[i].contentToString()} ")
    }
}
