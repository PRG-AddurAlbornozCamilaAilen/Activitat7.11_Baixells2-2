/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadbarcos2;

/**
 *
 * @author batoi
 */

   public class Flota {
    private Barco[] arrayBarcos;
    private int numBarcos;

   
    public Flota(int capacidadMaxima) {
        this.arrayBarcos = new Barco[capacidadMaxima];
        this.numBarcos = 0;
    }

    public void aniadirBarco(Barco barco) {
        if (numBarcos < arrayBarcos.length) {
            if (!existeBarco(barco)) {
                arrayBarcos[numBarcos++] = barco;
                System.out.println("Barco añadido a la flota.");
            } else {
                System.out.println("El barco ya existe en la flota.");
            }
        } else {
            System.out.println("La flota está llena, no se puede añadir más barcos.");
        }
    }

    private boolean existeBarco(Barco barco) {
        for (int i = 0; i < numBarcos; i++) {
            if (arrayBarcos[i].getMatricula().equals(barco.getMatricula())) {
                return true;
            }
        }
        return false;
    }

    public void eliminarBarco(String matricula) {
    int indiceEliminar = -1;
    for (int i = 0; i < numBarcos; i++) {
        if (arrayBarcos[i].getMatricula().equals(matricula)) {
            indiceEliminar = i;
            break;
        }
    }

    if (indiceEliminar != -1) {
        System.arraycopy(arrayBarcos, indiceEliminar + 1, arrayBarcos, indiceEliminar, numBarcos - indiceEliminar - 1);
        arrayBarcos[--numBarcos] = null;
        System.out.println("Barco eliminado de la flota.");
    } else {
        System.out.println("No se encontró ningún barco con esa matrícula en la flota.");
    }
}

    public void mostrarInfoBarco(String matricula) {
        for (int i = 0; i < numBarcos; i++) {
            if (arrayBarcos[i].getMatricula().equals(matricula)) {
                arrayBarcos[i].mostrarDetalle();
                return;
            }
        }
        System.out.println("No se encontró ningún barco con esa matrícula en la flota.");
    }

    public void listarBarcos() {
        for (int i = 0; i < numBarcos; i++) {
            System.out.println(i + ") " + arrayBarcos[i]);
        }
    }

    public void listarBarcosDeGuerra() {
        for (int i = 0; i < numBarcos; i++) {
            if (arrayBarcos[i] instanceof BarcoDeGuerra) {
                System.out.println(arrayBarcos[i]);
            }
        }
    }

    public void listarBarcosDePesca() {
        for (int i = 0; i < numBarcos; i++) {
            if (arrayBarcos[i] instanceof BarcoDePesca) {
                System.out.println(arrayBarcos[i]);
            }
        }
    }

    public double calcularCostoMantenimiento() {
    double costoTotal = 0;
    for (int i = 0; i < numBarcos; i++) {
        costoTotal += arrayBarcos[i].calcularCostoMantenimiento();
    }
    return costoTotal;
}

    public void aplicarMantenimientoGeneralizado() {
    double costoTotal = 0;
    for (int i = 0; i < numBarcos; i++) {
        arrayBarcos[i].realizarMantenimiento();
        costoTotal += arrayBarcos[i].getHorasMantenimiento(); // Asumiendo que getHorasMantenimiento() devuelve el total de horas de mantenimiento
    }
    System.out.println("El coste total en mantenimientos es " + costoTotal + " €");
}

}
