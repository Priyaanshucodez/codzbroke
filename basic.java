/*import java.util.Scanner;
class FirstClass{    
    public static void main(String[] args){
    int n;
    Scanner scanner = new Scanner(System.in);
    n= scanner.nextInt();
    for(int i=2; i<n; i++){
        boolean isprime=true;
        for(int j=2; j<((i/2))+1;j++){
            if (i%j==0){
                isprime=false;
                System.out.print(i+"is not a prime \n");
                break;
            }
        }
        if(isprime==true){
            System.out.print(i+" is a prime \n");
        }
    }
    }
}*/
/*public class basic{
       public static void main(String[] args){
       char var='c';
       switch(var){
             case 'a':
                 System.out.println("vowel");
                 break;
             case 'e':
                 System.out.println("vowel");
                 break;
             case 'i':
                 System.out.println("vowel");
                 break;
             case 'o':
                 System.out.println("vowel");
                 break;
             case 'u':
                 System.out.println("vowel");
                 break;
             default:
                  System.out.println("Consonant");
                  break;
       }
             
       }
       }    
*/
/*import java.util.Scanner;
public class basic{
    public static void main(String[] args){
          int year;
          Scanner scanner = new Scanner(System.in);
          year= scanner.nextInt();
          if(year%4==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
}
}*/
/*public class basic{
    public static void main(String[] args){
            // Parse command line arguments to doubles
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            // Multiply the numbers
            double product = num1 * num2;
            // Display the product
            System.out.println("Product: " + product);
}
}*/
/*public class basic{
    public static void main(String[] args){ 
    int num1=Integer.parseInt(args[0]);
    int num2=Integer.parseInt(args[1]);
    double product = num1 * num2;
    System.out.println("Product: " + product);
}
}*/
/* 
public class basic{
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        if (num1%2==0){ 
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}*/
/*public class basic{
    public static void main(String[] args){
              int radius =Integer.parseInt(args[0]);
              Double area=3.14*radius*radius;
              System.out.println("Area of the circle : "+area);
}
}*/
/*public class basic{
    public static void main(String[] args){
        String name=args[0];
        System.out.println("Welcome,"+args[0]+" Sir");
    }
}*/
/*import java.util.Scanner;
public class basic{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=scanner.next().charAt(0);
        System.out.println("Ascii code is : "+(int) (ch));
    }
    }
*/
/*public class basic{
    public static void main(String args[]){
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int Sum=num1+num2;
            System.out.println("Sum of two numbers is :"+ Sum);
        }
}*/
/*import java.util.Scanner;
public class basic{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 =s.nextInt();
        System.out.println("Enter the second number: ");
        int num2 =s.nextInt();
        System.out.println("Elements before swapping  "+num1+" "+num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("Elements after swapping  "+num1+" "+num2);
        }
}*/
/*import java.util.Scanner;
       public class basic{
              public static void main(String args[]){
                     Scanner s=new Scanner(System.in);
                     System.out.println("Enter the first character:");
                     char c1=s.next().charAt(0);
                     System.out.println("Enter the second character:");
                     char c2=s.next().charAt(0);
                     System.out.println("Characters in alphabetical order");
                     if ((int) c1 < (int) c2){
                        System.out.println(c1);
                        System.out.println(c2);
                     }
                     else{
                        System.out.println(c2);
                        System.out.println(c1); 
                                         }                   
 }
}      
*/
        



