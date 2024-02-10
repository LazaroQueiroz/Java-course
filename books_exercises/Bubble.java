import java.util.Scanner;

class BubbleSort{
    int[] arr;

    BubbleSort(int arrP[]){
        arr = arrP;
    }
    int[] sort(){
        boolean sorted;
        while(!sorted){
            sorted = true;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }
}

class Bubble{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0; i<arrSize; i++){
            arr[i] = sc.nextInt(); 
        }

        BubbleSort bs = new BubbleSort(arr);
        int[] sorted = bs.sort();
        for(int i=0; i<arrSize; i++){
            System.out.print(sorted[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
