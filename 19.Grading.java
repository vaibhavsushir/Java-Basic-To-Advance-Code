import java.util.Scanner; 
class Grading {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter To Grade Calculator");
        System.out.print("Enter Your Percent marks: ");
        int a=input.nextInt();
        if(a>=90){
            System.out.println("Grade,You Have Got A");
        }
        else if(a>=75){
            System.out.println("Grade,You Have Got B");
        }else if(a>=60){
            System.out.println("Grade,You Have Got C");
        }else if(a>=30){
            System.out.println("Grade,You Have Got D");
        }else{
            System.out.println("Sorry,You Are Fail Don't Quit Try Again");
        }
    }
}

