package linearsearcheforinteger;

public class LinearSearcheForInteger {

    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,14,32,51,3,6};
        int item=6;
        int temp=o;
        
        for (int index=0; index<arr.length; index++){
            if (arr[index]==item){
                System.out.println("Element is at " + index + " position");
                temp=temp+1;
            }
        }
        if (temp==0){
           System.out.println("Element not found"); 
        }
    } 
}
