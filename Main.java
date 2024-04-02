import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(num>num2 && num<num3){
            System.out.println("num is the greatest of three");
        }
        else if(num2>num && num2>num3){
            System.out.println("num2 is the greatest");
        }
        else if(num3>num2 && num3>num){
            System.out.println("num3 is the greatest");
        }
        else{
            if(num==num2){
                if(num>num3){
                    System.out.println("num and num2 are greatest and equal");
                }
                else{
                    System.out.println("num3 is  the greatest");
                }

            }
            if(num2==num3){
                if(num2>num) {
                    System.out.println("num2 and num3 are greatest and equal");
                }
                else{
                    System.out.println("num is the greatest");
                }
            }
            if (num==num3){
                if(num>num2){
                    System.out.println("num and num3 are greatest and equal");
                }
                else{
                    System.out.println("num2 is the greatest");
                }

            }
        }

    }
}