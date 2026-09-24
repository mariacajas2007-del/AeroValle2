
public class Piloto extends Empleado {
    private int horasVuelo;
    private static final double PAGO_POR_HORA = 25.0;

    public Piloto(String nombre, String id, double salarioBase, int horasVuelo) {
        super(nombre, id, salarioBase);
        this.horasVuelo = horasVuelo;
    }

    @Override 
    public double calcularSalario() {
        return super.calcularSalario() + (horasVuelo * PAGO_POR_HORA);
    }

}
