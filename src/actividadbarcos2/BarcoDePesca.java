package actividadbarcos2;

import java.util.Arrays;

public class BarcoDePesca extends Barco {

    private double capacidadDeCarga;
    private String[] redesDisponibles;
    private double porcentajeCapturasExitosas;

    public BarcoDePesca(String nombre, String matricula, int anyoConstruccion, double capacidadCarga, double porcentajeCapturasExitosas) {
        super(nombre, matricula, anyoConstruccion, "BARCO DE PESCA");
        this.capacidadDeCarga = capacidadCarga;
        this.porcentajeCapturasExitosas = porcentajeCapturasExitosas;
        this.redesDisponibles = new String[0];
    }

    public void anyadirNuevaRed(String nuevaRed) {
        String[] nuevasRedes = Arrays.copyOf(redesDisponibles, redesDisponibles.length + 1);
        nuevasRedes[redesDisponibles.length] = nuevaRed;
        redesDisponibles = nuevasRedes;
    }

    public void eliminarRedDe(String red) {
        int index = -1;
        for (int i = 0; i < redesDisponibles.length; i++) {
            if (redesDisponibles[i].equals(red)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] nuevasRedes = new String[redesDisponibles.length - 1];
            System.arraycopy(redesDisponibles, 0, nuevasRedes, 0, index);
            System.arraycopy(redesDisponibles, index + 1, nuevasRedes, index, redesDisponibles.length - index - 1);
            redesDisponibles = nuevasRedes;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de carga: " + capacidadDeCarga + ", Redes de pesca: " + Arrays.toString(redesDisponibles)
                + ", Porcentaje de capturas exitosas: " + porcentajeCapturasExitosas + "%";
    }

    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        horasMantenimiento += 100;
    }
   
    @Override
      public void mostrarDetalle(){ 
            System.out.println("\n");
            super.mostrarDetalle();
         System.out.print(", redes: "+Arrays.toString(redesDisponibles)+", porcentaje de éxito en captura: "+porcentajeCapturasExitosas);
      }
      
     @Override
    public double calcularCostoMantenimiento() {
        return getHorasMantenimiento() * 4; 
    }
}
