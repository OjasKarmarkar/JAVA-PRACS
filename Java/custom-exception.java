package Java;
import java.util.Scanner;

class CustomEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of your child : ");
        int marks = sc.nextInt();

        try {
            if(marks>100 || marks<0){
                sc.close();
                throw new UserException();
            }else{
                System.out.println("Good human");
            }
        } catch (UserException userException) {
            System.out.println("Handled");
        }

        sc.close();

    }

}

class UserException extends Exception{
    UserException(){
        System.out.println("Marks has to be within the range 0-100 ");
    }
}
