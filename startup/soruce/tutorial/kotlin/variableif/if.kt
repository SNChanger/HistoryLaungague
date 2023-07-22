fun main(args: Array<String>) {
    // Your code here!
    

    var attackCard = 1500;
    var defenseCard  = 2500;
    
    if (attackCard == defenseCard) {
        println("game result draw")
    } else if (attackCard > defenseCard) {
        println("attackcard win")
    } else {
        println("attackcard lose")
    }

    
}
