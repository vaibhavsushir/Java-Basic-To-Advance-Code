import java.util.Scanner;
class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Month Switch\n");
        System.out.print("Enter Your Number: ");
        int monthnum = input.nextInt();
        String Monthname = getMonthName(monthnum);
        System.out.println("Your Month Name Is: "+Monthname);


    }

    public static String getMonthName(int monthnum){
        String monthname = switch(monthnum){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default -> "Invalid Month Number";

        };
        return monthname;

    }



}
