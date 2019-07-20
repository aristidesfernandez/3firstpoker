
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author romar
 */
public class imprime {
    public int imprimem(int a[][]){
        int d= 0;
        int[] array = new int[9];
        int cont=0;
        
        for(int j=0;j<=4;j++){
            for(int i=0;i<=1;i++){
                array[cont]=a[j][i];
                cont++;
            }
        }
        
        return d;
    }
   
        
        
}
   
