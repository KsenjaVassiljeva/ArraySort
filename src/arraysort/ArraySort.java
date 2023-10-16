/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author admin
 */
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Random random= new Random();
        int[] array1 = new int[20];
        for (int i=0; i<array1.length; i++){
            array1[i] = random.nextInt(20-0+1)+0;
        }
        System.out.println("no sort:"+Arrays.toString(array1));
       for(int j=0; j<array1.length-1; j++){
            for(int i =0; i<array1.length-1; i++){
                if (array1[i] < array1[i+1]);{
                    array1[i]=array1[i]+array1[i+1];
                    array1[i+1]=array1[i]-array1[i+1];
                    array1[i]=array1[i]-array1[i+1];
                }
            }
        
        }
        System.out.println("sort:"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sort:"+Arrays.toString(array1));
        int a=1;
            int b=1;
            a=a+b;
            b=a-b;
            a=a-b;
        System.out.printf("a=%d,b=%d%n",a,b);
        System.out.println("---------------------------------------");
        int[][] array2 =new int[10][10];
        System.out.println("Sort:");
        for (int i=0; i<array2.length; i++) {
            for (int j=0; j<array2.length; j++) {
                for (int k=0; k<array2.length; k++) {
                    for (int m=0; m<array2.length; m++) {
                        if(array2[i][j]>array2[k][m]){
                            array2[i][j] = array2[i][j] +array2[k][m];
                            array2[k][m] = array2[i][j] -array2[k][m];
                            array2[i][j] = array2[i][j] -array2[k][m];
                        }
                        System.out.printf("%3d", array2[i][j]);
                    }
                    System.out.println();
                }
            }
        }
      
    }
}

