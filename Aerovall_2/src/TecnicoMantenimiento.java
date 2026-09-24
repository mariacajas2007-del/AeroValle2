
public class TecnicoMantenimiento extends Empleado {
     private int certificacion;

    public TecnicoMantenimiento(String nombre, String id, double salarioBase, int certificacion) {
        super(nombre, id, salarioBase);
        this.certificacion = certificacion;
       
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (certificacion * 150.0);
    }
}
