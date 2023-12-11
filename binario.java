import java.util.Scanner;

public class binario {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int dec = 0, resto, conta = 0, num = 0;
        System.out.println("Inserisci un byte in binario \n");
        String bin = tastiera.nextLine();

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                num += 1 << (bin.length() - 1 - i);
            }
            conta++;
        }

        if (conta < 8) {
            System.out.println("Il numero non è un byte");
        } else {
            System.out.println("E' un byte e vale " + num);
        }
    }
}
