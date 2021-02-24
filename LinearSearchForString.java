package linearsearchforstring;
public class LinearSearchForString {

    public static void main(String[] args) {
        String[] arr={"Amrita", "Ana", "Sima", "Tina", "Melissa"};
        String item="Tina";
        
        for (int index=0; index<arr.length; index++){
            if (arr[index]==item){
                System.out.println("Element is at " + index + " position");
            }
        }
    }  
}
