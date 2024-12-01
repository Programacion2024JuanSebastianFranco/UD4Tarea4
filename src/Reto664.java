import java.util.Scanner;

public class Reto664 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        short puentes;
        short carriles;
        short altura;

        puentes = scan.nextShort();

        do {

            short min = 801;

            for (short i = 0; i < puentes; i++){

                carriles = scan.nextShort();

                short maxC = 0;

                for (short j = 0; j < carriles; j++){

                    altura = scan.nextShort();

                        if (altura > maxC) {
                            maxC = altura;
                        }
                }
                if( maxC < min) {
                    min = maxC;
                }
            }

            System.out.println(min);

        } while(puentes != 0);


    }
}
