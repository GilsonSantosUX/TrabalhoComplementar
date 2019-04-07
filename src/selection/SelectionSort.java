package selection;
public class SelectionSort{

    public void seletcionSort(String[] lista){
        int index;
        for(int i=0; i<lista.length; i++) {
            index = i;
            for(int j=i+1; j< lista.length; j++) {          
                if(lista[j].charAt(0)<lista[index].charAt(0)) {
                    index = j;
                }
            }
            if(index != i){
                trocar(lista,i,index);
            }
                    
        }
    }

    private static void trocar(String[] lista,int i,int j){
        String temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

}