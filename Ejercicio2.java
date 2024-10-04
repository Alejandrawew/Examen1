import java.util.Scanner;

public class Ejercicio2 {

    public void Examen_ejercicio2 () {

        Scanner notamedia = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println(" Introduce la primera nota del primer trimestre");
        num1 = notamedia.nextInt();

        System.out.println(" Introduce la primera nota del segundo trimestre");
        num2 = notamedia.nextInt();

        System.out.println(" Introduce la primera nota del tercer trimestre");
        num3 = notamedia.nextInt();


        System.out.println("La media aritmética es.....");


        int resultado1 = (num1 + num2 + num3);
        int resultado = (resultado1 / 3);


        System.out.println(resultado);


        if(resultado<= 4) {

            System.out.println("Ha suspendido");

        }else{
            System.out.println("Ha aprobado");

        }

    }
}
