/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenametodoburbuja;

import java.util.Scanner;

/**
 *
 * @author Carlos Pinilla
 */
public class OrdenaMetodoBurbuja {
    
    int longVector;
    private int vector[];
    private Scanner teclado = new Scanner(System.in);
    
    public OrdenaMetodoBurbuja(){ //constructor
        LongitudVector();
        LlenaVector();
        OrdenaVector();
        for(int i=0 ; i<longVector ; i++ ){
            System.out.println("Valor "+vector[i]+"\t");
        }
    }
    private void LongitudVector() {
        System.out.print("Digite la longitud del vector: ");
        longVector = teclado.nextInt();
        vector = new int [longVector];
    }
    private void LlenaVector(){
        for(int i=0 ; i<longVector ; i++){
            System.out.print("Digite los valor " +(i+1)+ " : ");
            vector[i]= teclado.nextInt();
        }
    }
    private void OrdenaVector(){
        for(int i=0 ; i<longVector ; i++ ){
            for (int j=i+1 ; j<longVector ; j++){
                int aux;
                if(vector[j]<vector[i]){
                    aux=vector[j];
                    vector[j]=vector[i];
                    vector[i]=aux;
                }
            }
        }   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrdenaMetodoBurbuja ordenaBurbuja = new OrdenaMetodoBurbuja();
        // TODO code application logic here
    }
    
}