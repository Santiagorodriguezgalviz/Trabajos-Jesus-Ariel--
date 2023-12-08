/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jackeline
 */
public class Cuenta{

    public Cuenta(Cliente cliente) {
    }
    private int clienteId;
    private TipoCuenta tipoCuenta;
    private double saldo;
    public List<Retiro> historialRetiros;

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Retiro> getHistorialRetiros() {
        return historialRetiros;
    }

    public void setHistorialRetiros(List<Retiro> historialRetiros) {
        this.historialRetiros = historialRetiros;
    }

    boolean realizarRetiro(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}