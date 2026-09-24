public class App {
    public static void main(String[] args){
        Empleado[] equipo = {
            new Piloto("Ana Gómez", "E-101", 4500.0, 60),
            new TecnicoMantenimiento("Luis Rivas", "E-102", 3800.0, 3),
            new Supervisor("Carlos Pérez", "E-103", 5000.0, 4),
            new Agentedeventas("Carla Mux", "E-104", 3200.0, 0.1, 10000.0)
        };

        for (Empleado e : equipo) {
            System.out.println(e.getNombre() + ": Q" + e.calcularSalario());
        }
    }
}
        