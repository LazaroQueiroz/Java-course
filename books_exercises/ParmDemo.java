class Factor{
    boolean IsFactor(int a, int b){
        if(a == 0 ^ b == 0){
            return false;
        }else if (a==b & b == 0){
            return true;
        }else{
            return a%b==0|b%a==0;
        }
    }
}

class ChkNum{
    boolean IsEven(int num){
        return num%2==0;
    }
}

class ParmDemo{
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        Factor f = new Factor();

        if(e.IsEven(10)) System.out.println("10 is even");
        if(f.IsFactor(10, 90)) System.out.println("10 is factor of 90");
    }
}
