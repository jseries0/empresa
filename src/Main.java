import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Registrar empleado administrativo");
            System.out.println("2. Registrar empleado de ventas");
            System.out.println("3. Registrar empleado por horas");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Buscar empleado por ID");
            System.out.println("6. Calcular salario final");
            System.out.println("7. Aumentar salario base");
            System.out.println("8. Mostrar empleados mayores de edad");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    int idA = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreA = sc.nextLine();
                    System.out.print("Edad: ");
                    int edadA = sc.nextInt();
                    System.out.print("Salario base: ");
                    double salarioA = sc.nextDouble();
                    System.out.print("Bonificación: ");
                    double bonificacion = sc.nextDouble();

                    lista.add(new EmpleadoAdministrativo(idA, nombreA, edadA, salarioA, bonificacion));
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreV = sc.nextLine();
                    System.out.print("Edad: ");
                    int edadV = sc.nextInt();
                    System.out.print("Salario base: ");
                    double salarioV = sc.nextDouble();
                    System.out.print("Total ventas: ");
                    double ventas = sc.nextDouble();
                    System.out.print("Comisión (ej: 0.1): ");
                    double comision = sc.nextDouble();

                    lista.add(new EmpleadoVentas(idV, nombreV, edadV, salarioV, ventas, comision));
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idH = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreH = sc.nextLine();
                    System.out.print("Edad: ");
                    int edadH = sc.nextInt();
                    System.out.print("Salario base: ");
                    double salarioH = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horas = sc.nextInt();
                    System.out.print("Valor por hora: ");
                    double valor = sc.nextDouble();

                    lista.add(new EmpleadoHoras(idH, nombreH, edadH, salarioH, horas, valor));
                    break;

                case 4:
                    for (Empleado e : lista) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese ID: ");
                    int idBuscar = sc.nextInt();

                    for (Empleado e : lista) {
                        if (e.getId() == idBuscar) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 6:
                    System.out.print("Ingrese ID: ");
                    int idSalario = sc.nextInt();

                    boolean encontrado = false;

                    for (Empleado e : lista) {
                        if (e.getId() == idSalario) {
                            System.out.println("Empleado: " + e.getNombre());
                            System.out.println("Salario final: " + e.calcularSalario());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Empleado no encontrado");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese ID: ");
                    int idAumento = sc.nextInt();

                    boolean encontradoA = false;

                    for (Empleado e : lista) {
                        if (e.getId() == idAumento) {
                            System.out.print("Ingrese aumento: ");
                            double aumento = sc.nextDouble();

                            e.setSalarioBase(e.getSalarioBase() + aumento);

                            System.out.println("Nuevo salario base: " + e.getSalarioBase());
                            encontradoA = true;
                        }
                    }

                    if (!encontradoA) {
                        System.out.println("Empleado no encontrado");
                    }
                    break;

                case 8:
                    for (Empleado e : lista) {
                        if (e.getEdad() >= 18) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");

                    break;



            }

        } while (opcion != 9);
    }
}