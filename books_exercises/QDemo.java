import java.util.Scanner;

class Queue{
    char[] q;
    int putloc, getloc;

    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    boolean put(char a){
        if(putloc == q.length){
            System.out.println("---Queue is full---");
            return false;
        }
        q[putloc++] = a;
        return true;
    }

    char get(){
        char head = q[getloc++];
        return head;
    }

}

class QDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Type the desired size of your Queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        while(true){
            System.out.print("Who do you want to insert in this queue? ");
            char prsn = sc.next().charAt(0); 

            if(!q.put(prsn)) break;
        }
        for(int i=0; i<q.q.length; i++){
            System.out.println("Out of the Queue: "+q.get()); 
        }
        sc.close();
    }
}
