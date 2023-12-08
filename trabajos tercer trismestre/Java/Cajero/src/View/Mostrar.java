/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Funcionalidades.CajeroAutomatico;
import Funcionalidades.Cuenta;
import Funcionalidades.Retiro;
import Funcionalidades.TipoCuenta;

import java.util.List;
import Utils.FunctionString;
import Utils.FunctionNumeric;
import java.util.ArrayList;


/**
 *
 * @author Jackeline
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();
        
        List<Cuenta> cuentas = new ArrayList<>();
        CajeroAutomatico cajero = new CajeroAutomatico();
        
        String nombre = fs.InputScanner("Digite el nombre del cliente: ");
        
 while (true) {
            fs.ShowScanner("Bienvenido al Cajero Automático");
            fs.ShowScanner("1. Realizar Retiro");
            fs.ShowScanner("2. Registrar Cliente");
            fs.ShowScanner("4. Historial");
            fs.ShowScanner("5. salir");

            String opcionStr = fs.InputScanner("Seleccione una opción:");
            int opcion = Integer.parseInt(opcionStr);
            
            switch (opcion) {

                case 1:
                    int clienteIdRetiro = fn.InputIntegerNumericPositiveScanner("Ingrese el ID del cliente:");
                    double montoRetiro = fn.InputDoubleNumericPositiveScanner("Ingrese el monto a retirar:");
                    if (cajero.realizarRetiro(clienteIdRetiro, montoRetiro)) {
                        fs.InputScanner("Retiro exitoso. Nuevo saldo: " + cajero.getSaldo(clienteIdRetiro));
                    } else {
                        fs.InputScanner(
                                "No se pudo realizar el retiro. Saldo insuficiente o ID de cliente no válido.");
                    }
                    break;

                case 2:
                    int clienteId = fn.InputIntegerNumericPositiveScanner("Ingrese el numero de indentificacion");
                    TipoCuenta tipoCuenta = TipoCuenta
                            .valueOf(fs.InputScanner("Seleccione el tipo de cuenta (CREDITO/DEBITO):").toUpperCase());
                    String banco = fs.InputScanner("Ingrese el nombre del banco:");
                    double saldoInicial = fn.InputDoubleNumericPositiveScanner("Ingrese el saldo inicial:");

                    cajero.registrarCliente(clienteId, nombre, tipoCuenta, banco, saldoInicial);
                   fs.InputScanner("Cliente registrado exitosamente.");
                    break;

                case 4:
                    int clienteIdHistorial = fn.InputIntegerNumericPositiveScanner("Ingrese el ID del cliente:");
                    Cuenta cuentaHistorial = cajero.buscarCuentaPorClienteId(clienteIdHistorial);
                    if (cuentaHistorial != null) {
                        List<Retiro> historialRetiros = cuentaHistorial.getHistorialRetiros();
                       fs.InputScanner("Historial de retiros del cliente:");
                        for (Retiro retiro : historialRetiros) {
                            fs.InputScanner("Fecha: " + retiro.getFecha() + ", Monto: " + retiro.getMonto());
                        }
                    } else {
                       fs.InputScanner("Cliente no encontrado.");
                    }
                    break;

                case 5:
                    fs.InputScanner("Gracias por utilizar el Cajero Automático. ¡Hasta luego!");
                    System.exit(0);
                default:
                   fs.InputScanner("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

}

