/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import actividadbarcos2.Flota;
import actividadbarcos2.BarcoDeGuerra;
import actividadbarcos2.BarcoDePesca;


/**
 *
 * @author batoi
 */
public class TestFlota {
    public static void main(String[] args) {
        Flota flota = new Flota(5);

        // Crear 5 barcos de guerra
        BarcoDeGuerra barco1 = new BarcoDeGuerra("Missiling", "AAAA", 2012, 0, new String[]{"Lanza cohetes", "Detector misiles", "Bombardero"});
        BarcoDeGuerra barco2 = new BarcoDeGuerra("Naviero feroz", "BBBB", 2013, 0,new String[]{"Bombardero", "Lanza cohetes", "Detector misiles"});
        BarcoDeGuerra barco3 = new BarcoDeGuerra("Tiatomic", "CCCC", 2014, 0,new String[]{"Lanza cohetes", "Detector misiles", "Machete"});
        
        // Crear 5 barcos de pesca
        BarcoDePesca barco4 = new BarcoDePesca("Sardina Express", "SE-123", 2005, 0,  80);
        BarcoDePesca barco5 = new BarcoDePesca("Pez Payaso", "PP-456", 2010, 0, 70);
       
        
        // Añadir los barcos a la flota
        flota.aniadirBarco(barco1);
        flota.aniadirBarco(barco2);
        flota.aniadirBarco(barco3);
        flota.aniadirBarco(barco4);
        flota.aniadirBarco(barco5);
       

        // Mostrar todos los barcos
        System.out.println("------ Todos Los Barcos ------");
          flota.listarBarcos();

        // Calcular el costo de mantenimiento actual
        System.out.println("\n------ Coste de mantenimiento actual ------");
        System.out.println("El coste total en mantenimientos es: " + flota.calcularCostoMantenimiento() + " €");

        // Realizar mantenimiento generalizado
        System.out.println("\n------ Mantenimiento generalizado ------");
        flota.aplicarMantenimientoGeneralizado();

        // Mostrar todos los barcos de guerra
        System.out.println("\n------ Todos los barcos de guerra ------");
        flota.listarBarcosDeGuerra();

        // Mostrar todos los barcos pesqueros
        System.out.println("\n------ Todos los barcos pesqueros ------");
        flota.listarBarcosDePesca();

       // Eliminar un baro con matrícula PP-456 y mostrar todos los barcos
       System.out.println("\n------ Eliminar baro con matrícula PP-456 y mostrar todos los barcos ------");
       flota.eliminarBarco("PP-456");
       flota.listarBarcos();
    }
}
