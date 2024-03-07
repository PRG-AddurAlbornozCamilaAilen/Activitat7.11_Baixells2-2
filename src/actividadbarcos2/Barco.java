/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadbarcos2;

/**
 *
 * @author batoi
 */




public abstract class Barco {
    private String nombre;
    private String matricula;
    private int anioConstruccion;
    protected int horasMantenimiento;
    private double numeroHorasMantenimiento;
    private String tipoBarco;

    public Barco(String nombre, String matricula, int anioConstruccion) {
        this.tipoBarco = "BARCO";
        this.nombre = nombre;
        this.matricula = matricula;
        this.anioConstruccion = anioConstruccion;
        this.horasMantenimiento = 0;
    }

    public Barco(String nombre, String matricula, int anyoConstruccion, String tipoBarco) {
        this(nombre, matricula, anyoConstruccion);
        this.tipoBarco = tipoBarco;
    }

    @Override
    public String toString() {
        return "Tipo de barco: " + tipoBarco + ", nombre: " + nombre + ", matricula: " + matricula +
                ", año de construccion: " + anioConstruccion + ", horas de manteniminento: " + horasMantenimiento;
    }

    public void realizarMantenimiento() {
        this.horasMantenimiento += 100;
    }

    public double getNumeroHorasMantenimiento() {
        return numeroHorasMantenimiento;
    }

    public void setNumeroHorasMantenimiento(double numeroHorasMantenimiento) {
        this.numeroHorasMantenimiento = numeroHorasMantenimiento;
    }

    public void mostrarDetalle() {
        System.out.print("Tipo de barco:" + tipoBarco + ", nombre: " + nombre + ", matrícula: " + matricula +
                ", año de construcción: " + anioConstruccion + ", \nhoras de mantenimiento: " + horasMantenimiento);
    }
    
    public String getMatricula() {
    return this.matricula;
}
    public int getHorasMantenimiento() {
        return this.horasMantenimiento;
    }
    
    public double calcularCostoMantenimiento() {
    return 0;
}

}
