/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionescuenta;

import java.util.Scanner;

public class Cuenta {

    private final int numerocuenta;
    private double saldo;
    private String titular;

    public double getNumerocuenta() {
        return numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta(int numerocuenta, int saldo, String titular) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void ConsultarSaldo() {
        System.out.println("el saldo de la cuenta es: " + getSaldo());

    }

    public double IngresarDinero() {
        System.out.println("Elige el dinero a ingresar:");
        Scanner entrada = new Scanner(System.in);
        String teclado = entrada.nextLine();
        double cambiodevalor = (Double.parseDouble(teclado) + getSaldo());
        setSaldo(cambiodevalor);
        System.out.println("El saldo en la cuenta es ahora de:" + cambiodevalor);
        return cambiodevalor;
    }

    public double SacarDinero() {
        System.out.println("Elige el dinero a sacar:");
        Scanner entrada = new Scanner(System.in);
        String teclado = entrada.nextLine();
        double cambiodevalor = (getSaldo() - Double.parseDouble(teclado));
        setSaldo(cambiodevalor);
        System.out.println("El saldo en la cuenta es ahora de:" + cambiodevalor);
        return cambiodevalor;
    }

    public void Transferencia(Cuenta c) {
        System.out.println("elige la cuenta de destino:");
        Scanner entrada = new Scanner(System.in);
        String teclado = entrada.nextLine();
        double eligecuenta = Double.parseDouble(teclado);
        if (eligecuenta == c.getNumerocuenta()) {
            double saldo1 = c.getSaldo();

            double adescontar = c.IngresarDinero() - saldo1;

            setSaldo((getSaldo() - adescontar));
        } else {
            System.out.println("la cuenta destino no existe");
        }

    }
}
