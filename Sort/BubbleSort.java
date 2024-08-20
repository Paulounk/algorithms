package Sort;

//O(n²)
public class BubbleSort {
    public static void main(String[] args){
        Integer[] numbers = new Integer[]{3,6,2,1,8,4,4,7};
        int aux = 0;
        boolean controle;

        for(int i=0; i<numbers.length-1; i++){
            controle = true;
            for(int j=0; j<numbers.length-1; j++){

                if(numbers[j] > numbers[j+1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                    controle = false;
                }
            }
            if(controle){
                break;
            }
        }

        for(int item : numbers){
            System.out.print(item + " ");
        }
    }
}
