public class GuessTheNumber{
    public static void main(String[] args) 
        throws java.io.IOException{
        char answer, ignore;
        System.out.println("choose a letter for your friend guess it!");
        char choice = (char) System.in.read(); 
        System.out.println("letter chosen!");
        do{
            System.out.print("type a letter then ENTER: ");
            answer = (char) System.in.read();

            do{
               ignore = (char) System.in.read(); 
            }while(ignore != '\n');

            if(answer > choice){
                System.out.println("Well, too high. Try again!");
            }else if(answer < choice){
                System.out.println("Well, too low. Try again!");
            }else{
                System.out.println("Nice, you guessed it!! The choice was "+choice);
            }
        }while(answer != choice);
    }
}
