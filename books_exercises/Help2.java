public class Help2{
    public static void main(String[] args) 
        throws java.io.IOException{
        char choice, ignore;
        do{
            System.out.println("Help on:\n1.if\n2.switch\n3.for\n3.while\n4.do while");
            choice = (char) System.in.read();
            do{
                ignore = (char) System.in.read(); 
            }while(ignore!='\n');

            switch(choice){
                case '1':
                    System.out.println("ifs does that...");
                    break;
                case '2':
                    System.out.println("switches does that...");
                    break;
                case '3':
                    System.out.println("fors does that...");
                    break;
                case '4':
                    System.out.println("whiles does that...");
                    break;
                case '5':
                    System.out.println("do whiles does that...");
                    break;
            }
        }while(choice < '1' | choice > '5');
    }
}

