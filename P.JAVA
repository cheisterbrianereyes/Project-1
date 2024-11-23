import java.util.Arrays;


class Main {
    public static void main(String[] args) {
       
       int[] numbers = {10, 20, 30, 40, 50};
       
   
      boolean isSorted = true;
      for (int i = 0; i < numbers.length-1; i++){
          if ( numbers[i] > numbers[ i + 1]){
              isSorted = false;
              
          }
      }
     if( isSorted == true){
        System.out.println("The Array is sorted in ascending order"); 
     }
      else {
        System.out.println("The Array is not sorted in ascending order"); 
      }
     }
    }

