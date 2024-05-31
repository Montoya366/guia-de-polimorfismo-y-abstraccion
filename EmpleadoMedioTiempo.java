public class EmpleadoMedioTiempo extends Empleado {

   private double salarioPorHora;
   private int horasTrabajadasPorSemana;


    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion,double salarioPorHora, int i) {
        super(nombre, numeroIdentificacion);
       this.salarioPorHora = salarioPorHora;
       salarioPorHora = 450.90;
       this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
       horasTrabajadasPorSemana = 16;
    }

    @Override
    public double calcularSalario() {
     return salarioPorHora * horasTrabajadasPorSemana * 4; //salario  mensual
       }

}
