/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class SeatReservation_Frane {
    public static void main(String[] args) {
        int[][] int2DArray = new int[7][5];
        int[] reserved_seats = new int[35];
        
        //display available seats
        for (int r=0;r<5;r++){   
            //System.out.println(r);
            for(int c=0;c<7;c++){ 
               //System.out.print(int2DArray[c][r] + " ");
               int rowCol1 = r*7;
               int col = c+rowCol1+1;
               int2DArray[c][r] =  col;
               System.out.print((col) + " ");
            }
            System.out.println();
        }
    
        while (true) {
        //get user input
        System.out.println("Enter seat number to reserve: ");
        Scanner scan = new Scanner(System.in);
        int seatNumber = 0;
        
            //checking seat number
            while (seatNumber<1 || seatNumber>35) {
                seatNumber = scan.nextInt();
                boolean seatTaken = false;
                for(int i = 0; i < 35; i++) {
                    if(reserved_seats[i] == seatNumber){
                        seatTaken = true;
                        break;
                    }
                }
                
                if (seatTaken) {
                    System.out.println("Seat is taken; please enter new seat number."); 
                } else if ((seatNumber>=1 && seatNumber<=35)) {
                    System.out.println("Seat successfully reserved");
                } else {
                    System.out.println("Invalid input; please enter seat number again.");
                }
            }
            
            //storing input
    
            for(int i = 0; i < 35; i++){
              if(reserved_seats[i] == 0){
                reserved_seats[i] = seatNumber; //index_reserved = i; 
                break;
              }
            }
            
            /*//checking eme
            for(int i = 0; i < 35; i++){
                System.out.print(reserved_seats[i] + " ");
            }*/
            System.out.println();
            
            //reserving seats
            for (int r=0;r<5;r++){   
                //System.out.println(r);
                for(int c=0;c<7;c++){ 
                   //System.out.print(int2DArray[c][r] + " ");
                   boolean seatTaken = false;
                    for(int i = 0; i < 35; i++) {
                        if(reserved_seats[i] == int2DArray[c][r]){
                            seatTaken = true;
                            System.out.print("X ");
                            break;
                        }
                    }
                    if (!seatTaken) {
                        System.out.print(int2DArray[c][r] + " ");
                    }    
                }
                System.out.println();
            }        
        } 
    }
}


