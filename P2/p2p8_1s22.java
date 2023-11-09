import java.util.Scanner;

public class p2p8_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String temp;
		int num1, num2;
		int resultado;

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
			case 'S': System.out.println("aqui realizamos la suma");
			System.out.println("ingresa el primer numero: ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero: ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 + num2;
			System.out.println("La suma es: " + resultado);
			break;
			case 'R': System.out.println("aqui realizamos la resta");
			System.out.println("ingresa el primer numero: ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero: ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);						
			resultado = num1 - num2;
			System.out.println("La resta es: " + resultado);
			break;
			case 'M': System.out.println("aqui realizamos la multiplicacion");
			System.out.println("ingresa el primer numero: ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero: ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);					
			resultado = num1 * num2;
			System.out.println("La multiplicacion es: " + resultado);
			break;		
			case 'D': System.out.println("aqui realizamos la division");
			System.out.println("ingresa el primer numero: ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero: ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 / num2;
			System.out.println("La Divison es: " + resultado);
			break;
					
			case 'X': break;
			}
		}
	}
}