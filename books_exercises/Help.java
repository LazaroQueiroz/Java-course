import java.io.IOException;

public class Help{
    public static void main(String[] args) 
        throws java.io.IOException {
        boolean flag = false;
        while(!flag){
            System.out.println("Help on:\n1. if\n2. switch\nChoose one: ");
            char choice = (char) System.in.read(); 
            flag = true;
            switch(choice){
                case '1':
                    System.out.println("The if:");
                    System.out.println("if(condition): statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The switch:");
                    System.out.println("switch(expression){");
                    System.out.println("case constant:");
                    System.out.println("statement sequence;");
                    System.out.println("break;");
                    System.out.println("// ...");
                    System.out.println("default: statements;");
                    break;
                default:
                    flag = false;
                    System.out.println("Oops, looks like you entered an invalid choice! Try again");

            }
        }
        
    }
}
