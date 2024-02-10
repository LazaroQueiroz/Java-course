class Help{
    boolean IsValid(char what){
        return (what <= '7' & what >= '1') | what == 'q';
    }
    void showMenu(){
        System.out.println("Choose a number to get help:");
        System.out.println("\t1.if");
        System.out.println("\t2.else");
        System.out.println("\t3.while");
        System.out.println("\t1.for");
        System.out.println("\t1.do while");
        System.out.println("\t1.break");
        System.out.println("\t1.continue");
        System.out.println("press Q to exit.");
        
    }
    void helpOn(int what){
        switch (what) {
            case '1':
                System.out.println("ifs...");
                break;
            case '2':
                System.out.println("else...");
                break;
            case '3':
                System.out.println("while...");
                break;
            case '4':
                System.out.println("for...");
                break;
            case '5':
                System.out.println("do while...");
                break;
            case '6':
                System.out.println("break...");
                break;
            case '7':
                System.out.println("continue...");
                break;
            default:
                break;
        }
    }
}

class HelpClassDemo{
    public static void main(String[] args) 
        throws java.io.IOException{
        Help hp = new Help();

        char choice; 
        do{
            hp.showMenu();
            choice = (char) System.in.read();

            char ignore;
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');

            hp.helpOn(choice);
        }while(!hp.IsValid(choice) & choice != 'q');
    }
}
