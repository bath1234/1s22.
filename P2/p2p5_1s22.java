import java.util.Scanner;

public class p2p5_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opc='0';
		while (opc !='s'){
			System.out.println("menu de operaciones");
			System.out.println("");
			System.out.println("S.- suma");
			System.out.println("R.- resta");
			System.out.println("D.- division");
			System.out.println("M.- multiplicacion");
			System.out.println("x.- salir");
			System.out.println("");
			System.out.println("que opcion deseas");
			opc=teclado.nextLine().charAt(0);
			switch(opc){
			case 'S': System.out.println("aqui realizamos la suma");break;
			case 'R': System.out.println("aqui realizamos la resta");break;
			case 'D': System.out.println("aqui realizamos la multiplicacion");break;
			case 'M': System.out.println("aqui realizamos la division");break;
			case 'X': break;
			}
		}
	}
}