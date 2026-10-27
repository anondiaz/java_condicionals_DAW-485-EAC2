// import java.util.Scanner;

public class ElectroMove {
        public static void main(String[] args) {
                /*
                Revisar el enunciado, pero básicamente debemos leer los datos con la clase InputUtils
                Establecer el control en la introducción de datos mediante los condicionales
                */
                System.out.println("*** PROVES INTERACTIVES ***\n");

                //Scanner scan = new Scanner(System.in);

                System.out.println("*** CREACIÓ DE VEHICLE ***\n");
                System.out.print("Matrícula: ");
                String matricula = InputUtils.readLine();

                System.out.print("Marca: ");
                String marca = InputUtils.readLine();

                System.out.print("Model: ");
                String model = InputUtils.readLine();

                System.out.print("Autonomia (en km): ");
                int autonomia = InputUtils.readInt();

                System.out.println("Ubicació:");
                System.out.print("\tLatitud: ");
                double latitudv = InputUtils.readReal(Coordenades.MIN_LAT, Coordenades.MAX_LAT);
                System.out.print("\tLongitud: ");
                double longitudv = InputUtils.readReal(Coordenades.MIN_LONG, Coordenades.MAX_LONG);
                Coordenades cv1 = new Coordenades(latitudv, longitudv);

                Vehicle v1 = new Vehicle(matricula, marca, model, autonomia, cv1);

                //System.out.println("El vehicle amb matrícula " + v1.getMatricula() + " ha estat creat correctament.\n");
                System.out.println("\n" + "El vehicle " + v1.toString() + " ha estat creat." +"\n");

                //InputUtils.readLine();

                // Creació del primer punt de carrega
                System.out.println("*** CREACIÓ DE PUNT DE CÀRREGA ***\n");
                System.out.print("Identificador: ");
                String identificador = InputUtils.readLine();

                System.out.print("Potència (en kW): ");
                double potencia = InputUtils.readReal();

                System.out.println("\t1 - TYPE2\n\t2 - CCS\n\t3 - CHADEMO");
                System.out.print("Connector: ");
                int connector = InputUtils.readInt(1, 3);
                if (connector == InputUtils.ERROR_INT) {
                    System.out.println("Error en la introducció de les dades.");
                    return;    
                }

                System.out.println("Ubicació:");
                System.out.print("\tLatitud: ");
                double latitud = InputUtils.readReal(Coordenades.MIN_LAT, Coordenades.MAX_LAT);
                System.out.print("\tLongitud: ");
                double longitud = InputUtils.readReal(Coordenades.MIN_LONG, Coordenades.MAX_LONG);
                Coordenades cpc1 = new Coordenades(latitud, longitud);
                PuntCarrega pc1 = new PuntCarrega(identificador, cpc1, potencia, connector);

                //System.out.println("El punt de càrrega amb identificador " + pc1.getIdentificador() +
                //                " ha estat creat correctament.\n");
                System.out.println("\n" + "El punt de càrrega " + pc1.toString() + " ha estat creat." +"\n");

                // Creació del segon punt de carrega
                System.out.println("*** CREACIÓ DE PUNT DE CÀRREGA ***\n");
                System.out.print("Identificador: ");
                String identificadorpc2 = InputUtils.readLine();

                System.out.print("Potència (en kW): ");
                double potenciapc2 = InputUtils.readReal();

                System.out.println("\t1 - TYPE2\n\t2 - CCS\n\t3 - CHADEMO");
                System.out.print("Connector: ");
                int connectorpc2 = InputUtils.readInt(1, 3);
                if (connectorpc2 == InputUtils.ERROR_INT) {
                    System.out.println("Error en la introducció de les dades.");
                    return;    
                }

                System.out.println("Ubicació:");
                System.out.print("\tLatitud: ");
                double latitudpc2 = InputUtils.readReal(Coordenades.MIN_LAT, Coordenades.MAX_LAT);
                System.out.print("\tLongitud: ");
                double longitudpc2 = InputUtils.readReal(Coordenades.MIN_LONG, Coordenades.MAX_LONG);
                Coordenades cpc2 = new Coordenades(latitudpc2, longitudpc2);
                PuntCarrega pc2 = new PuntCarrega(identificadorpc2, cpc2, potenciapc2, connectorpc2);

                // System.out.println("El punt de càrrega amb identificador " + pc2.getIdentificador() +
                //                " ha estat creat correctament.\n");
                System.out.println("\n" + "El punt de càrrega " + pc2.toString() + " ha estat creat." +"\n");

                // Anem a calcular la distancia entre el vehicle i els dos punts de càrrega, a veure quin está mes aprop
                // System.out.println("La distància entre el vehicle i el punt de càrrega " + pc1.getIdentificador() + "es: " + v1.getUbicacio().distancia(pc1.getUbicacio()));
                // System.out.println("La distància entre el vehicle i el punt de càrrega " + pc2.getIdentificador() + "es: " + v1.getUbicacio().distancia(pc2.getUbicacio()));

                v1.engegar();
                System.out.println("L'estat del vehicle amb matrícula " + v1.getMatricula() + " és: " + v1.informacioEstat() + "." +"\n");
                // System.out.println(v1.toString() +"\n");

                double distanciaPC1 = v1.getUbicacio().distancia(pc1.getUbicacio());
                double distanciaPC2 = v1.getUbicacio().distancia(pc2.getUbicacio());
                if (distanciaPC1 < distanciaPC2) {
                        v1.carregar();
                        pc1.setEstat(PuntCarrega.OCUPAT);
                        System.out.println(v1.toString() +"\n");
                        System.out.println("El vehicle amb matrícula " + v1.getMatricula() + " es posa en càrrega al punt de càrrega " + pc1.getIdentificador() + "." +"\n");
                        System.out.println(pc1.toString() +"\n");
                } else {
                        v1.carregar();
                        pc2.setEstat(PuntCarrega.OCUPAT);
                        System.out.println(v1.toString() +"\n");
                        System.out.println("El vehicle amb matrícula " + v1.getMatricula() + " es posa en càrrega al punt de càrrega " + pc2.getIdentificador() + "." +"\n");
                        System.out.println(pc2.toString() +"\n");
                }
                System.out.println("\n*** FI PROVES INTERACTIVES ***\n");
                //scan.close();
                InputUtils.close();
        }
}
