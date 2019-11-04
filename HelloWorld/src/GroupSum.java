import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupSum{
    
    public static void main(String[] args) {
         int arr[]     = {12,10,9,11,8,6,7,1,3,2,4,5};
         int groupOf   = 3;      
         sort(arr, groupOf);
    }

    private static void sort(int[] arr, int groupOf) {

         List<Integer> result = new ArrayList<Integer>();
         List<Integer> lt = new ArrayList<Integer>(); 
         
         for (int i = 0; i< arr.length; i++) {           
             lt.add(arr[i]);
             if((i+1)%groupOf ==0){
                  Collections.sort(lt);
                  Collections.reverse(lt);
                  result.addAll(lt);
                  lt.clear();
             }
         }
         System.out.println(result);
    }
}


