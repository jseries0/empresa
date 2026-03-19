public class EmpleadoHoras extends Empleado {

    private int horasTrabajadas;
    private double valorhoras;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(int id, String nombre, int edad, double salarioBase, int horasTrabajadas, double valorhoras) {
        super(id, nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorhoras = valorhoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorhoras() {
        return valorhoras;
    }

    public void setValorhoras(double valorhoras) {
        this.valorhoras = valorhoras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * valorhoras);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorhoras=" + valorhoras;
    }

    @Override
    public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorhoras);
    }
}