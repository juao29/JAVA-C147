package ex1;

public class referencia {
    public static void main(String[] args){
        int []IntArray = {10, 20, 30, 40, 50};

        for(int i=0; i < IntArray.length; i++){
            System.out.print(IntArray[i] + " ");
        }
        modify(IntArray);

        System.out.println("n/=== Array after calling method ===");
        for(int i=0; i < IntArray.length; i++){
            System.out.print(IntArray[i] + " ");
        }
    }
    static void modify(int []array){

        for(int i=0; i < array.length; i++){
            array[i] = array[i] / 2;
        }
    }
}
