import java.util.Scanner;

public class ElectroMove {
        public static void main(String[] args) {
                /*
                Revisar el enunciado, pero básicamente debemos leer los datos con la clase InputUtils
                Establecer el control en la introducción de datos mediante los condicionales
                */
                System.out.println("*** PROVES INTERACTIVES ***\n");

                Scanner scan = new Scanner(System.in);

                System.out.println("*** CREACIÓ DE VEHICLE ***\n");
                System.out.print("Matrícula: ");
                String matricula = scan.nextLine();

                System.out.print("Marca: ");
                String marca = scan.nextLine();

                System.out.print("Model: ");
                String model = scan.nextLine();

                System.out.print("Autonomia (en km): ");
                int autonomia = scan.nextInt();

                Vehicle v1 = new Vehicle(matricula, marca, model, autonomia);

                System.out.println("El vehicle amb matrícula " + v1.getMatricula() + " ha estat creat correctament.\n");
                System.out.println("Les seves dades són: " + v1.toString() + "\n");

                scan.nextLine();

                System.out.println("*** CREACIÓ DE PUNT DE CÀRREGA ***\n");
                System.out.print("Identificador: ");
                String identificador = scan.nextLine();

                System.out.print("Potència (en kW): ");
                double potencia = scan.nextDouble();

                System.out.println("\t1 - TYPE2\n\t2 - CCS\n\t3 - CHADEMO");
                System.out.print("Connector: ");
                int connector = scan.nextInt();

                System.out.println("Ubicació:");
                System.out.print("\tLatitud: ");
                double latitud = scan.nextDouble();
                System.out.print("\tLongitud: ");
                double longitud = scan.nextDouble();
                Coordenades c2 = new Coordenades(latitud, longitud);
                PuntCarrega pc1 = new PuntCarrega(identificador, c2, potencia, connector);

                System.out.println("El punt de càrrega amb identificador " + pc1.getIdentificador() +
                                " ha estat creat correctament.\n");
                System.out.println("Les seves dades són: " + pc1.toString() + "\n");

                System.out.println("\n*** FI PROVES INTERACTIVES ***\n");
                scan.close();
        }

}
