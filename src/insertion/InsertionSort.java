package insertion;
public class InsertionSort{

    public void insertionSort(String[] lista){
        String temp;
        int j;
 
       for(int i =  1; i < lista.length; i++) { 
           temp = lista[i]; 
           j = i- 1; 
          
          while(j >= 0 && temp.charAt(0) < lista[j].charAt(0) ) {
    
                lista[j+1] = lista[j];
                j = j-1;
          }
 
          lista[j+1] = temp;
       }
    }
    
}