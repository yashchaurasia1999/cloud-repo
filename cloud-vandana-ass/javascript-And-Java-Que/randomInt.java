import java.util.*;
class randomInt{

    
    public static void main(String[] args) {
        int arr []= { 1,2,3,4,5,6,7 };
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");   
        }
        
        System.out.println();
        System.out.println("Shuffled array...");
        for (int i = 0; i < arr.length; i++) {
            // list.add(arr[i]);
           int index = new Random().nextInt(7);
           int shuffle = arr[index];
           System.out.print(shuffle+ " ");
        }

    }
}