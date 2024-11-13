public class IfStatement {
    public static void main(String[] args) {
        //If statement, decision making
        int num1=10;
        if (num1>10) {
            System.out.println("Greater than 10");
            //more statement
        }
        //If-else statement
        if (num>20){
            System.out.println("Greater than 20");
        }else{
            System.out.println{"Lesser than 20"};
        }

        //If-else-if
        if(num1>10){
            System.out.println("Num is 10");
        }else if(num1==9){
            System.out.println("Num is 9");
        }else{
            System.out.println("Num is unknowm")
        }

        //if-else-if ladder //multiple elkse if
        String bevarage = "Coke";
        if (bevarage == "Fanta"){
            System.out.println("Orange Drink");
        }else if(bevarage = "Coke"){
            System.out.println("Black Drink");
        }else if(bevarage = "Sprite"){
            System.out.println("Clear Drink");
        }else{
            System.out.println("Clear Drink");
        }

        //Nested if
        if (bevarage == "Coke"){
            if (num1=10){
                System.outprintln("Coke and 10");
            }else{
                System.outprintln("Only coke");
            }
        }else{
            if (num1==10){
                System.outprintln("Only 10");
            }else{
                System.outprintln("No coke and 10");
            }
        }
        //Task 1
        // make a variable int day and assign value
        // if day is 1-> print Sunday
        // if day is 2-> print Monday
        // if day is 3-> print Tuesday
        // if day is 4-> print Wednesday
        // if day is 5-> print Thursday
        // if day is 6-> print Friday
        // if day is 7-> print Saturday
        //if day is not in number -> print Unknown Day

        //Task 2
        //Make a variable avgMark and a char variable gender
        // if avgMark is greater than 80 and gender is 'M' print "Good Boy"
        // if avgMark is greater than 80 and gender is 'F' print "Good Girl"
        // if avgMark is not greater than 80 and gender is 'M' print "Good Boy"
        // if avgMark is not greater than 80 and gender is 'F' print "Good Girl"
        
        int day=7
        if (day==1){
            System.out.println("Sunday");
        }else if(day==2){
            System.out.println("Monday");
        }else if(day==3){
            System.out.println("Tuesday");
        }else if(day==4){
            System.out.println("Wednesday");
        }else if(day==5){
            System.out.println("Thursday");
        }else if(day==6){
            System.out.println("Friday");
        }else if(day==7){
            System.out.println("Satrurday");
        }else{
            System.out.println("Unknown Day");
        }


    }
}
