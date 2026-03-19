public class EmpleadoAdministrativo extends Empleado {

    private double bonificacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(int id, String nombre, int edad, double salarioBase, double bonificacion) {
        super(id, nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bonificacion=" + bonificacion;
    }

    @Override
    public void mostrarinformacion() {
        super.mostrarinformacion();
        System.out.println("Bonificacion: " + bonificacion);
    }
}