import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int conta = 0, num = 0,controllo=0;
        System.out.println("Inserisci un byte in binario \n");
        String bin = tastiera.nextLine();

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                num += 1 << (bin.length() - 1 - i);
            }
            conta++;
        }
        for(int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1'||bin.charAt(i) == '0') {

            }
            else{
                controllo++;
            }
        }
            conta++;
        if (conta < 8||controllo>0) {
            System.out.println("Il numero non è un byte");
        } else {
            System.out.println("E' un byte e vale " + num);
        }
    }
}
