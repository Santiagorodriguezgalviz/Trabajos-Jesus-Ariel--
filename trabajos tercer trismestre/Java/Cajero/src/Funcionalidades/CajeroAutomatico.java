/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

/**
 *
 * @author Jackeline
 */
import java.util.ArrayList;
import java.util.List;

public class CajeroAutomatico {
    public List<Cuenta> cuentas;

    public CajeroAutomatico() {
        cuentas = new ArrayList<>();
    }

    public boolean realizarRetiro(int clienteId, double monto) {
        Cuenta cuenta = buscarCuentaPorClienteId(clienteId);
        if (cuenta != null) {
            return cuenta.realizarRetiro(monto);
        }
        return false;
    }

    public void registrarCliente(int clienteId, String nombre, TipoCuenta tipoCuenta, String banco,
            double saldoInicial) {
        Cliente cliente = new Cliente(clienteId, nombre, tipoCuenta, banco, saldoInicial);
        Cuenta cuenta = new Cuenta(cliente);
        cuentas.add(cuenta);
    }

    public Cuenta buscarCuentaPorClienteId(int clienteId) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getClienteId() == clienteId) {
                return cuenta;
            }
        }
        return null; // Si no se encuentra una cuenta con el clienteId dado
    }

    public double getSaldo(int clienteId) {
        Cuenta cuenta = buscarCuentaPorClienteId(clienteId);
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        return -1; // Retorna un valor negativo si el cliente no existe
    }
}
