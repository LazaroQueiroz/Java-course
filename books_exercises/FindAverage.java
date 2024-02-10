class Average{
    int arrSize; 
    int avArr[];
    Average(int s){
        arrSize = s;
        avArr = new int[arrSize];
    }


    double getAverage(){
        double average = 0;
        for(int el : avArr){
            average += el;
        }
        average /= arrSize;
        return average;
    }
}

class FindAverage{
    public static void main(String[] args) throws java.io.IOException{
        System.out.print("Type an array size: "); 
        String arrSizeS = "";
        for(;;){
            char c = (char) System.in.read(); 
            if(c=='\n') break;
            arrSizeS += c;
        }
        int arrSize = Integer.valueOf(arrSizeS);
        Average av = new Average(arrSize);
        
        for(int i=0; i<av.arrSize; i++){
            String elS = "";
            for(;;){
                char c = (char) System.in.read();
                if(c=='\n') break;
                elS+= c;
            }
            int el = Integer.valueOf(elS);
            av.avArr[i] = el;
        }
        System.out.println(av.getAverage());
    }
}
