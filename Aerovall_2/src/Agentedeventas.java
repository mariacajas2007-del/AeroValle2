public class Agentedeventas extends Empleado {
    private double comision;
    private double ventas;

    public Agentedeventas(String nombre, String id, double salarioBase, double comision, double ventas) {
        super(nombre, id, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comision * ventas);
    }
    
}
