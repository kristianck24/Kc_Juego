package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner Get = new Scanner(System.in);

        boolean ans;
        int kc[] = new int[6];
        long tablero6 [][] = {{32,36,40,44,48,52,56,60},{33,37,41,45,49,53,57,61},{34,38,42,46,50,54,58,62},{35,39,43,47,51,55,59,63}};
        long tablero5 [][]={{16,20,24,28,48,52,56,60},{17,21,25,29,49,53,57,61},{18,22,26,30,50,54,58,62},{19,23,27,31,51,55,59,63}};
        long tablero4 [][] = {{8,12,24,28,40,44,56,60},{9,13,25,29,41,45,57,61},{10,14,26,30,42,46,58,62},{11,15,27,31,43,47,59,63}};
        long tablero3 [][]={{04,12,20,28,36,44,52,60},{05,13,21,29,37,45,53,61},{06,14,22,30,38,46,54,62},{07,15,23,31,39,47,55,63}};
        long tablero2 [][] = {{2,10,18,26,34,42,50,58},{3,11,19,27,35,43,51,59},{06,14,22,30,38,46,54,62},{07,15,23,31,39,47,55,63}};
        long tablero1 [][]={{01,9,17,25,33,41,49,57},{3,11,19,27,35,43,51,59},{05,13,21,29,37,45,53,61},{07,15,23,31,39,47,55,63}};
        int x=1, y;

        System.out.println(" Piensa en un numero del 1 al 63..."); //** instrucciones del juego **//
        System.out.println(" Escribe true si se encuentra el número que estas pensando o false de lo contrario.");

        //*** Se declara un ciclo for para los 6 tableros que contienen los diferentes numeros ***//
        for (int i = 0; i <= 5; i++) {

            System.out.println(" El numero que pensaste se encuentra en esta tabla? ");
            //*** Se utilizó un switch para cambiar de tablero y mostrarlo al usuario y determine si su número
            // se encuentra en cualquiera de las opciones ***//
            switch(i){
                case 0:
                    newArray(tablero1);
                    break;
                case 1:
                    newArray(tablero2);
                    break;
                case 2:
                    newArray(tablero3);
                    break;
                case 3:
                    newArray(tablero4);
                    break;
                case 4:
                    newArray(tablero5);
                    break;
                case 5:
                    newArray(tablero6);
                    break;
                default:
                    break;
            }
            //*** Se pide la respuesta al ususario y se almacena según la respuesta seleccionada
            do {

                ans = Get.nextBoolean();

                if(ans == true){

                    y = 1;
                    kc[i] = y;
                    x = 0;
                }
                else if(ans == false){
                    y = 0;
                    kc[i] = y;
                    x=0;
                }
                else{
                    System.out.println("Ingresa true o false");
                    x=1;
                }
            }while(x == 1);

        }

        int dec =0,exp =0, digito; // conversión del numero binario a número decimal
        for(int i=0; i <= 5 ; i++){

            digito = kc[i] %10;
            dec = dec + digito * (int) Math.pow(2, exp);
            exp++;
            kc[i]=kc[i]/10;
        }
        // Se muestra la respuesta al usuario en numero decimal
        System.out.println(" El número que pensaste es el: "+ dec);


    }
    // Arreglo para acomodar los arrays de la tabla 1-6
    public static void newArray(long [][] tabla){
        for (int i = 0; i <4 ; i++){


            for(int j=0; j < 8; j++){

                System.out.print(tabla[i][j]);
                System.out.print("         ");

            }
            System.out.println("");

        }

    }
}
