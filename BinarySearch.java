package binarysearch;
public class BinarySearch {

    public static void main(String[] args) {
        // For binary searching, it should be a sorted array.
        int[] arr={2,3,5,7,9,23,67,89,99};
        int item=67, li=0, hi=arr.length-1, mi=(li+hi)/2;
          
        while (li<=hi){
            if (arr[mi]==item){
                System.out.println("Element is at " + mi + " position");
                break;
            }
            else if (arr[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            
            mi=(li+hi)/2;                  
        }
        if(li>hi){
            System.out.println("Element not found");
        }
    }   
}
