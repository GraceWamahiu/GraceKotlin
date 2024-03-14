fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
    //Decrement
    var num = 100
    while (num >= 95){
        println(num)
        num--
    }

    //Do... While loop
    var x = 20
    do {
        println(x)
        x++
    }while (x <= 25)

    //For Loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }
    var marks = arrayOf(30,40,50)
    for (Mark in marks) {
        println("Mark is $Mark")
    }

    //Range
    for (number in 30..35){
        println(number)
    }
    for (letter in 'a' .. 'd'){
        println("Letter is $letter")
    }





}
