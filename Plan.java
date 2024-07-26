/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_lab2;

/**
 *
 * @author Jayma
 */

public abstract class Plan{
    protected int Numerotel;
    protected String NombreCliente;

    public Plan(int numerotel, String nombre){
        this.Numerotel=numerotel;
        this.NombreCliente=nombre;
    }
    public abstract double PagoMensual(int mins, int msgs);
    
    public int getNumero(){
        return Numerotel;
    }

    public String getNombre(){
        return NombreCliente;
    }

    public String Print(){
        String informacion="Nombre del Cliente: "+NombreCliente+"Numero de Telefono: "+Numerotel;
        return informacion;
    }
}