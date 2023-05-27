import java.util.Arrays;
import java.util.Scanner;


public class Atividade4 {
    
        static int quantidade;
        static double maior = 0;
        static double menor = 999999999;
        static double soma = 0, media, mediana;
    
        
    public static double getMediana(double[] numeros){    
	double mediana;
        
	Arrays.sort(numeros);
        
        int tam = numeros.length;
        
        if(tam % 2 == 0){ //par
            tam = tam / 2;
            mediana = (numeros[tam - 1] + numeros[tam]) / 2.0;
        }else{  //impar
            tam = (tam + 1) / 2;
            mediana = numeros[tam - 1];
        } 
        return mediana;
    }
    
    public static double getMedia(double[] numeros){    
	double media;
        
	media = soma / quantidade;
        return media;
    }
     
    public static double getMaior(double[] numeros){    
	for(int i = 0; i < quantidade; i++){
        if(numeros[i] > maior){ 
	      maior = numeros[i];
            }
      }
        return maior;
    }
    
     public static double getMenor(double[] numeros){    
	for(int i = 0; i < quantidade; i++){
        if(numeros[i] < menor){ 
             menor = numeros[i];
            }
    }
        return menor;
} 
     
    
    public static void main(String args[]){  
   
        Scanner teclado = new Scanner(System.in);
    

        System.out.print("Insira a quantidade de numeros a serem coletados:\n");
        
        quantidade = teclado.nextInt();
        
        double[] numeros = new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            numeros[i] = teclado.nextDouble(); 
            
            soma += numeros [i];
        }
 
        System.out.println("Mediana = " + getMediana(numeros));
        System.out.println("Media = " + getMedia(numeros));
        System.out.println("Maior valor = " + getMaior(numeros));
        System.out.println("Menor valor = " + getMenor(numeros));

    }
    
}