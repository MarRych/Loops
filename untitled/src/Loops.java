import java.util.Scanner;

    public class Loops{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Count from 1 to 10
            int i = 1;
            //inkrementacion
            while(i<=10){
                System.out.println(i);
                i++;
            }
            System.out.println("Loop finished!");


            //Loop for;
            for(int j=1; j<=10; j++) {
                System.out.println(j);
            }

            //Display odd numbers from 1-30 range
            for(int j=1; j<=30; j++ ) {
                if(j%2==1) {
                    System.out.print(j +" ");
                }}

            System.out.println();
            //shortcut, jumps every 2 numbers
            for(int j=1; j<=30; j=j+2) {
                System.out.print(j +" ");
            }


            //Unknown number game:

		int unknownNumber = 7;
		int number = 0;
		while (number != unknownNumber) {
            number = scanner.nextInt();
		}

		System.out.println("Bravo, you guessed!");

    }
}



