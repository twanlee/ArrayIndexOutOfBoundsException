import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arr = new ArrayIndexOutOfBoundsException();
        Integer[] array = arr.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter random index: ");
        int x = sc.nextInt();
        try {
            System.out.println("Element at index " + x + " is: " + array[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out bound");
        }

    }
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new     Integer[100];
        System.out.println("Elements in arr: ");
        for (int i=0; i<100; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}

