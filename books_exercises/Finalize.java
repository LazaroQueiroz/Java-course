class FDemo{
    int x;

    FDemo(int i){
        x = i;
    }

    protected void finalize(){
        System.out.printf("Finalizing object %d", x);
    }

    void generator(int j){
        FDemo f = new FDemo(j);
    }
}

class Finalize{
    public static void main(String[] args) {
        int count;
        FDemo f = new FDemo(12);
        for(count = 1; count<1000; count++){
            f.generator(count);
        }
    }
}
