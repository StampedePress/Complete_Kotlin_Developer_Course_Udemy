/**
 *  Date: 06/15/2017
 *
 *  Lesson: 17
 *
 *  Description:
 *  An expanded version of the lesson, including conditional logic
 *  and compares users birth day and month for a more accurate age reading.
 *
 */
  import java.util.*

 fun main(args:Array<String>){

    println("--- What's Your Age ---")

    //Input
    print("Please enter your month of birth(1-12): ")
    var MOB:Int = readLine()!!.toInt()
    print("Please enter your day of birth(1-31): ")
    var DOB:Int = readLine()!!.toInt()
    print("Please enter your year of birth: ")
    var YOB:Int = readLine()!!.toInt()

    //Variables
    var month = Calendar.getInstance().get(Calendar.MONTH)
    var day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?

    //Process
    if(month <= MOB && day < DOB) {
        year--
        age = year - YOB
    } else {
        age = year - YOB
    }

    //Output
     println("You are $age year's old.")
}