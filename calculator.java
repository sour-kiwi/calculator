import java.util.Scanner;
public class calculator {
    Scanner input1= new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    public void add(){
        System.out.println("Enter first number");
        double x = input1.nextDouble();
        System.out.println("Enter second number");
        double y = input2.nextDouble();
        double result = x + y;
        System.out.println("Addition result");
        System.out.println(result);
    }
    public void subtract(){
        System.out.println("Enter first number");
        double x = input1.nextDouble();
        System.out.println("Enter second number");
        double y = input2.nextDouble();
        double subResult = x-y;
        System.out.println("Subtraction Result");
        System.out.println(subResult);
    }
    public void multiplication(){
        System.out.println("Enter first number");
        double x = input1.nextDouble();
        System.out.println("Enter second number");
        double y = input2.nextDouble();
        double timResult = x*y;
        System.out.println("Multiplication result");
        System.out.println(timResult);
    }
    public void division(){
        System.out.println("Enter first number");
        double x = input1.nextDouble();
        System.out.println("Enter second number");
        double y = input2.nextDouble();
        if(y == 0){
            System.out.println("Error. Please try again. Divisor cannot be divided by 0.");
        }

        double divResult = x/y;
        System.out.println("Division Result");
        System.out.println(divResult);
    }
    public void square(){
        System.out.println("Enter number");
        double x = input1.nextDouble();
        double sqResult = x*x;
        System.out.println("Square result");
        System.out.println(sqResult);
    }
    public void sqRoot(){
        System.out.println("Enter number");
        double x = input1.nextDouble();
        double sqRootResult = Math.sqrt(x);
        System.out.println("Square root result");
        System.out.println(sqRootResult);

    }
    public void calculate(){
        if(i==1){

        }
    }

}
class demo{
    public static void main(String [] args){
        calculator bob = new calculator();
        Scanner choices = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square");
        System.out.println("6.Square Root");
        int choice = choices.nextInt();
        switch(choice){
            case 1:
                bob.add();
                break;
            case 2:
                bob.subtract();
                break;
            case 3:
                bob.multiplication();
                break;
            case 4:
                bob.division();
                break;
            case 5:
                bob.square();
                break;
            case 6:
                bob.sqRoot();
                break;

            default:
                System.out.println("Enter a valid number: 1,2,3,4,5 or 6");
        }
    }
}