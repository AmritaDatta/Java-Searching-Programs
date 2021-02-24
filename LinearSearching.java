package linearsearching;

public class LinearSearching {

    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,14,32,51,3,6};
        int item=6;
        
        for (int index=0; index<arr.length; index++){
            if (arr[index]==item){
                System.out.println(index);
            }
        }
    } 
}
