fun main(args: Array<String>) {
    // Your code here!
    

    var codeId = 850;


    var codeDesctiption = when {
        codeId == 250 -> "programmer"
        codeId == 450 -> "systemengineer"
        codeId == 650 -> "projectleader"
        codeId == 850 -> "productmanager"
        else -> "staff"
    };


    println(codeDesctiption)
}
