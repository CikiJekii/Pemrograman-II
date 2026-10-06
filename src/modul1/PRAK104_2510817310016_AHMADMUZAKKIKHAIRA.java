package modul1;

import java.util.Scanner;

public class PRAK104_2510817310016_AHMADMUZAKKIKHAIRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuInput = input.nextLine();

        System.out.print("Tangan Bagas: ");
        String bagasInput = input.nextLine();

        String[] abu = abuInput.split(" ");
        String[] bagas = bagasInput.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            char Abu = abu[i].charAt(0);
            char Bagas = bagas[i].charAt(0);

            if (Abu == Bagas) {
                continue;
            }

            if ((Abu == 'B' && Bagas == 'G')
                    || (Abu == 'G' && Bagas == 'K')
                    || (Abu == 'K' && Bagas == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}
