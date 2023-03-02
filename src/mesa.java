import java.util.Scanner;

public class mesa {

	public static void clearScreen() {
		

	    System.out.print("\033[H\033[2J");

	    System.out.flush();

	}

	public static void main(String[] args) {
		 
	    System.out.println("--------MENU--------");

	    System.out.println("--Escolha uma opção--");

	    System.out.println("1. Reserva de mesa");

	    System.out.println("2. Compra mesa vip");

	    System.out.println("3. Cancelar reserva");

	    System.out.println("4. Sair do menu");

	    Scanner entrada = new Scanner(System.in);

	    int respmenu = entrada.nextInt();

	    if (respmenu == 1) {

	        // Criando linha e coluna da matriz

	        int m[][] = new int[8][10];

	        for (int l = 0; l < 8; l++) {

	            for (int c = 0; c < 10; c++) {

	                m[l][c] = 0;

	                System.out.print(m[l][c] + " ");

	            }

	            System.out.println();

	        }

	        System.out.println("Mesas disponíveis ACIMA");

	        System.out.println("DIGITE A COLUNA E A LINHA DA MESA QUE DESEJA RESERVAR");

	        Scanner teclado = new Scanner(System.in);

	        int resp_reserv = teclado.nextInt();
	         	       

	        int l = 0;
			int c = 0;
			if (resp_reserv == m[l][c]) {
	        	

	            System.out.println("R");

	        }

	    }

	}

}
