public class EmpleadoVentas extends Empleado {

    private double totalVentas;
    private double comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(int id, String nombre, int edad, double salarioBase, double totalVentas, double comision) {
        super(id, nombre, edad, salarioBase);
        this.totalVentas = totalVentas;
        this.comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVentas * comision);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", totalVentas=" + totalVentas +
                ", comision=" + comision;
    }

    @Override
    public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Total ventas: " + totalVentas);
        System.out.println("Comisión: " + comision);
    }
}