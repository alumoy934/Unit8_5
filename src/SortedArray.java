import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private int [] array;
    private int numElements;

    public SortedArray(int capacity){

        numElements = 0;
        array = new int[capacity];

        for (int i = 0; i< array.length; i++){
            array[i] = -1;
        }

    }

    public void put (int value){
        array[numElements] = value;
        numElements++;
        Arrays.sort(array,0,numElements);
    }

    public void view_array (){
       System.out.println(Arrays.toString(array));
    }

    public int getSize(){
        return array.length;
    }

    public int getNumElements(){
        return numElements;
    }

    public int getElementAt(int value){
        return array[value-1];
    }

    public void removeElement (int pos) {
        if (pos <= numElements) {
            array[pos - 1] = array[pos];
            removeElement(pos + 1);
        }

    }

    public boolean isEmpty(){
        if (numElements == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (numElements == array.length){
            return true;
        }else {
            return false;
        }
    }

    public boolean existElement(int value) {
        boolean found = false;

        for (int i = 0; i < numElements; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean existElementbinary(int element){
        return binarySearch(element, 0, numElements-1);
    }

    private boolean binarySearch (int element, int minorIndex, int upperIndex){
        boolean found = false;
        int middle = array[(upperIndex-1)/2];

        while ((minorIndex < upperIndex) && found == false){

        }

        return found;
    }


    public static void main(String[] args) {

        SortedArray v = new SortedArray(10);
        v.put(5);
        v.put(10);
        v.put(35);
        v.put(1);
        v.put(25);
        v.view_array();
        System.out.println("The size of array is: " + v.getSize());
        System.out.println("Number of elements inserted into array: " + v.getNumElements());

        Scanner in = new Scanner(System.in);
        System.out.println("View element at position: ");
        int position = in.nextInt();
        System.out.println("Elment at position " + position + " is: " + v.getElementAt(position));

        System.out.println();
        v.removeElement(3);
        v.view_array();
        System.out.println("Number of elements inserted into array: " + v.getNumElements());
        System.out.println("Array Empty: " + v.isEmpty());
        System.out.println("Array Full: " + v.isFull());

        System.out.println("Value 25 exist into array: " + v.existElement(25));
        System.out.println("Value 20 exist into array: " + v.existElement(20));

    }



}//class
