package insertion;
public class InsertionSort{

    public void insertionSort(String[] lista,int n){
        if(n <= 1) return;
    
        insertionSort(lista,n-1);
        
        String x = lista[n-1];
        int j = n-2;
        
        while((j >= 0 && lista[j].charAt(0) > x.charAt(0))){
            lista[j+1] = lista[j];
            j--;
        }
        
        lista[j+1] = x;
    }

    
    
}