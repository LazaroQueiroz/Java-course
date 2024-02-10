class ShowBits{
    int numbits;
    
    ShowBits(int i){
        numbits = i;
    }

    void show(long val){

        long mask = 1;

        mask <<= numbits-1;
        
        int spacer = 0;
        for(; mask!=0; mask >>>=1){
            if((val & mask)!=0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if(spacer == 8){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}


class ShowBitsDemo{
    public static void main(String[] args) throws java.io.IOException{
        System.out.print("Type the size of the number in bits to be converted: ");  
        String numbitsS = "";
        for(;;){
            char c = (char) System.in.read();
            if(c == '\n') break;
            numbitsS += c;
        }

        int numbits = Integer.valueOf(numbitsS);
        ShowBits b = new ShowBits(numbits); 
        for(int i=0; i<10; i++){
            String numS = ""; 
            for(;;){
                char c = (char) System.in.read();
                if(c=='\n') break;
                numS += c;

            }
            long num = Integer.valueOf(numS);
            b.show(num);
        }
    }
}
