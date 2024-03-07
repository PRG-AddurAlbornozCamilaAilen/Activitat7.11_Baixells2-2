package actividadbarcos2;

import java.util.Arrays;

public class BarcoDeGuerra extends Barco {
    private String[] listadoArmamento;
    private int numeroTripulantesMaximo;
    private int numeroTripulantesActual;

    public BarcoDeGuerra(String nombre, String matricula, int anioConstruccion, int numTripulantesMax, String[] armamento) {
        super(nombre, matricula, anioConstruccion, "BARCO DE GUERRA");
        this.numeroTripulantesMaximo = numTripulantesMax;
        this.numeroTripulantesActual = 0;
        this.listadoArmamento = armamento.clone();
    }

    public void aumentarTripulantes(int numTripulantes) {
        numeroTripulantesActual += numTripulantes;
        if (numeroTripulantesActual > numeroTripulantesMaximo) {
            numeroTripulantesActual = numeroTripulantesMaximo;
        }
    }

    public void aumentarMaximoDeTripulantes(int aumento) {
        numeroTripulantesMaximo += aumento;
    }

    public void anyadirArmamento(String[] nuevoArmamento) {
        String[] temp = new String[listadoArmamento.length + nuevoArmamento.length];
        System.arraycopy(listadoArmamento, 0, temp, 0, listadoArmamento.length);
        System.arraycopy(nuevoArmamento, 0, temp, listadoArmamento.length, nuevoArmamento.length);
        listadoArmamento = temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", Armas a bordo: " + Arrays.toString(listadoArmamento) + ", Número de tripulantes: " +
                numeroTripulantesActual + "/" + numeroTripulantesMaximo;
    }
    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        horasMantenimiento += 200;
    }
     @Override
      public void mostrarDetalle(){ 
         System.out.println("\n");
          super.mostrarDetalle();
         System.out.print(", armas a bordo: "+Arrays.toString(listadoArmamento)+", número de tripulantes: "+numeroTripulantesActual);
      }

  @Override
    public double calcularCostoMantenimiento() {
        return getHorasMantenimiento() * 6; // Se asume que el costo por hora es de 6 euros
    }
}






