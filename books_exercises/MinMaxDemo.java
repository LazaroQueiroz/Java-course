class MinMax{
    int arr[];
    MinMax(int a[]){
        arr = a;
    }

    int min(){
        int min = arr[0];
        for(int n : arr){
            if(n<min) min = n;
        }
        return min;
    }
    int max(){
        int max = arr[0];
        for(int n : arr){
            if(n>max) max = n;
        }
        return max;
    }
}

class MinMaxDemo{
    public static void main(String[] args) throws java.io.IOException{
        System.out.print("Type the size of the array: ");     
        String sizeS = "";
        for(;;){
            char c = (char) System.in.read();
            if(c=='\n') break;
            sizeS += c;
        }
        int size = Integer.valueOf(sizeS);

        int arr[] = new int[size];

        System.out.print("Type your array elements separated by a blank space: ");     

 outer: for(int i=0; i<size; i++){
            String numS = "";
            for(;;){
                char c = (char) System.in.read();
                if(c=='\n') break outer;
                if(c==' ') break;
                numS += c; 
            }
            int num = Integer.valueOf(numS);
            arr[i] = num;
        }
        MinMax mm = new MinMax(arr);

        System.out.println("Maior valor: "+mm.max());
        System.out.println("Menor valor: "+mm.min());

    }
}
