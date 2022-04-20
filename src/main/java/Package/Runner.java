package Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Esta clase captura datos por teclado y los muestra en la consola
 *
 * @author Claudia Zorrilla Rojas
 */
public class Runner {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(read);

        System.out.println("Ingrese su nombre: ");
        String name = buffer.readLine();

        System.out.println("Ingrese su año de nacimiento: ");
        String datee = buffer.readLine();
        Integer date = Integer.parseInt(datee);

        System.out.println("Ingrese su número celular: ");
        String  cellphonee = buffer.readLine();
        Long celphone = Long.parseLong(cellphonee);

        date = 2022 - date;

        System.out.println("Bienvenid@ señor@ "+name+ " es un placer para nosotros contar con una persona\n" +
                "de "+date+" años. Próximamente nos comunicaremos con usted al numero: "+celphone+".\n" +
                "Feliz día" );
    }
}
