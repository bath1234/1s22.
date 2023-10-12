import java.util.Scanner;

public class p2p1_1s22{
public static void main(String[] args) {
int opc = 1;
int a,b,resultado;
/*
switch(opc){
case 1:
System.out.println("aqui estamos en la primera opcion");
break;
case 2:
System.out.println("aqui estamos en la segunda opcion");
break;
case 3:
System.out.println("aqui estamos en la tercera opcion");
break;
default:
System.out.println("no existe el valor dentro de los casos");
   }

   char opc1='a';
   switch(opc1){
   case'a':
    System.out.println("selecciono a");
    break;
   case'b':
    System.out.println("selecciono b");
    break;
   case'c':
    System.out.println("selecciono c");
    break;
   default:
    System.out.println("no esta dentro de las opciones");
   }
   */  

   char opc2;
   Scanner teclado = new Scanner(System.in);
   System.out.println("ELIJA UNA OPCION R,S,M,D");
   opc2 = teclado.next().charAt(0);
   switch(opc2){
   case's':
    System.out.println("aqui ira las operaciones de la suma");
    System.out.println("introducir el primer numero");
    a = teclado.nextInt();
    System.out.println("introducir el segundo numero");
    b = teclado.nextInt();
    resultado = a+b;
    break;
   case'r':
    System.out.println("aqui ira las operaciones de la resta");
    System.out.println("introducir el primer numero");
    a = teclado.nextInt();
    System.out.println("introducir el segundo numero");
    b = teclado.nextInt();
    resultado = a-b;
    break;
   case'm':
    System.out.println("aqui ira las operaciones de multiplicacion");
    System.out.println("introducir el primer numero");
    a = teclado.nextInt();
    System.out.println("introducir el segundo numero");
    b = teclado.nextInt();
    resultado = a*b;
    break;
   case'd':
    System.out.println("aqui ira las operaciones de division");
    System.out.println("introducir el primer numero");
    a = teclado.nextInt();
    System.out.println("introducir el segundo numero");
    b = teclado.nextInt();
    resultado = a/b;
            break;
   default:
    System.out.println("no existe operacion a realizar...");
   }
    }
}
