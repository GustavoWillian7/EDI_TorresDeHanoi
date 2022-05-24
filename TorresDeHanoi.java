import java.util.Scanner;

public class TorresDeHanoi {
	static void hanoi(int n, int O, int D, int A) {

		if (n > 0) {
			hanoi(n - 1, O, A, D);
			hanoi(n - 1, A, D, O);
		}

	}
	public static void main (String[] args) {

		int n;
		double x;
    double tempoSegundos = 0;
    double tempoMinutos = 0;
    double tempoHoras = 0;
    boolean timer = true;
    boolean timer2 = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = scan.nextInt();

		long tempoInicial = System.currentTimeMillis();

		TorresDeHanoi.hanoi(n, 1, 3, 2);

		x = Math.pow(2, n) - 1;
		System.out.println("Número total de movimentos = " + Math.round(x));

		long tempoFinal = System.currentTimeMillis();
		tempoSegundos = (tempoFinal - tempoInicial) / 1000;

        while (timer == true) {
            if (tempoSegundos > 60) {
                tempoMinutos++;
                tempoSegundos = tempoSegundos - 60;
            } else {
                timer = false;
            }
	    }
        while (timer2 == true) {   
            if (tempoMinutos > 60) {
                tempoHoras++;
                tempoMinutos = tempoMinutos - 60;
            } else {
                timer2 = false; 
            }
        }
		System.out.printf("Tempo de execução = " + Math.round(tempoHoras) + ":" + Math.round(tempoMinutos) + ":" + Math.round(tempoSegundos) + ":" + tempoFinal);
	}
}
