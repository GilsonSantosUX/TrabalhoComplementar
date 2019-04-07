package quick;
public class QuickSort{

    public void  quickSort(String v[], int esquerda, int direita){
		if(esquerda < direita){
		  int j = separar(v,esquerda,direita);
		  quickSort(v,esquerda,j-1);
		  quickSort(v,j+1,direita);
		}
	}
	
	private int separar(String[] v,int esq,int dir){
	  int i = esq+1;
	  int j = dir;
	  int pivo = v[esq].charAt(0);
	  
	  while(i <= j){
	    if(v[i].charAt(0) <= pivo) i++;
	    else if(v[j].charAt(0) > pivo) j--;
	    else if(i<=j){
	      trocar(v,i,j);
	      i++;
	      j--;
	    }
	  }
	  
	  trocar(v,esq,j);
	  return j;
	}
	
	private void trocar(String[] v,int i,int j){
	  String aux = v[i];
	  v[i] = v[j];
	  v[j] = aux;
	}
}