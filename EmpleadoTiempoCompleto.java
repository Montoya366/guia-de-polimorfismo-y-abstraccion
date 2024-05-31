public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;
    
    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double d) {
        super(nombre, numeroIdentificacion);
       this.salarioAnual = salarioAnual;
       salarioAnual = 456.12;
    }

    @Override
    public double calcularSalario() {
       return salarioAnual / 12; //salario mensual
    }

}
