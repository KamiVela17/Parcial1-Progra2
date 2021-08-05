
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author KamiVela
 */
public class ClsProrrateo {

    private String[][] facturadetail;
    private final int UNIDADES = 0;
    private final int DESCRIPCION = 1;
    private final int VALOR = 2;
    private final int PESO = 3;
    private final int GASTOVALOR = 4;
    private final int GASTOPESO = 5;
    private final int COSTOUNIDAD = 6;
    private int COSTOTOTAL = 7;
    private int filaActual = 0;
    private final int MAX_COLUMNAS = 8;
    private int totalFilas = 0;

    private double segurolocal = 0.0;
    private double flete = 0.0;
    private double impuestos = 0.0;
    private double acarreo = 0.0;
    private double comisiones = 0.0;
    double unidadesvalor = 0.0;
    double total4 = 0.0;

    public ClsProrrateo(int filas) {

        totalFilas = filas;
        facturadetail = new String[totalFilas][MAX_COLUMNAS];

    }

    public void AgregaVendedorMatriz(ClsDetalleFactura factura) {

        facturadetail[filaActual][UNIDADES] = factura.getUnidades() + "";
        facturadetail[filaActual][DESCRIPCION] = factura.getDescripcion() + "";
        facturadetail[filaActual][VALOR] = factura.getValorfactura() + "";
        facturadetail[filaActual][PESO] = factura.getPeso() + "";
        filaActual++;

    }

    public void llenaInformacion() {
        ClsDetalleFactura detallefactura = new ClsDetalleFactura();

        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese Unidades ");
        detallefactura.setUnidades(t.nextInt());
        System.out.println("Ingrese Descripcion");
        detallefactura.setDescripcion(t.nextLine());
        detallefactura.setDescripcion(t.nextLine());
        System.out.println("Ingrese Valor Factura");
        detallefactura.setValorfactura(t.nextDouble());
        System.out.println("Ingrese Peso");
        detallefactura.setPeso(t.nextDouble());
        AgregaVendedorMatriz(detallefactura);

    }

    public void imprimirDecoradoAvanzado() {

        //formas de dar formato
        for (int x = 0; x < filaActual; x++) {
            unidadesvalor += Double.parseDouble(facturadetail[x][UNIDADES]) * Double.parseDouble(facturadetail[x][VALOR]);
            total4 += Double.parseDouble(facturadetail[x][VALOR]) * Double.parseDouble(facturadetail[x][PESO]);

        }

        double total1 = segurolocal + impuestos + comisiones;
        double total6 = flete + acarreo;

        double total3 = total1 / unidadesvalor;
        double total7 = total6 / total4;
        double total = 0.0;

        for (int x = 0; x < filaActual; x++) {

            double total8 = Double.parseDouble(facturadetail[x][PESO]) * total7;
            facturadetail[x][GASTOPESO] = total8 + "";
            facturadetail[x][GASTOVALOR] = total3 * Double.parseDouble(facturadetail[x][VALOR]) + "";
            facturadetail[x][COSTOUNIDAD] = Double.parseDouble(facturadetail[x][VALOR]) + Double.parseDouble(facturadetail[x][GASTOPESO]) + Double.parseDouble(facturadetail[x][GASTOVALOR]) + "";
            facturadetail[x][COSTOTOTAL] = Double.parseDouble(facturadetail[x][COSTOUNIDAD]) * Double.parseDouble(facturadetail[x][UNIDADES]) + "";
            total += Double.parseDouble(facturadetail[x][COSTOTOTAL]);

        }

        for (int x = 0; x < facturadetail.length; x++) {
            for (int y = 0; y < facturadetail[x].length; y++) {
                System.out.print(facturadetail[x][y]);

            }
            System.out.println("\n");

        }

    }

    public void menu() {
        Scanner read = new Scanner(System.in);

        read = new Scanner(System.in);
        int Seleccion = 0; //Primer Menu 
        int Abonar = 0;

        do {
            System.out.println("*** Menu ***");
            System.out.println("1. Ingresar nueva factura");
            System.out.println("2. Salir");
            System.out.println("");
            System.out.print("Ingrese Opción: ");
            Seleccion = read.nextInt();

            if (Seleccion == 2) {
                return;

            }

            Scanner t = new Scanner(System.in);
            System.out.println("Ingrese Seguro Local ");
            segurolocal = t.nextDouble();
            System.out.println("Ingrese Flete");
            flete = t.nextDouble();
            System.out.println("Ingrese Impuestos");
            impuestos = t.nextDouble();
            System.out.println("Ingrese Acarreo");
            acarreo = t.nextDouble();
            System.out.println("Ingrese Comisiones");
            comisiones = t.nextDouble();
            System.out.println("\n\n");

            switch (Seleccion) {
                case 1:
                    int CuentaCorriente = 0;
                    do {

                        System.out.println("1. Ingrese datos de factura.");
                        System.out.println("2. Imprimir factura");
                        System.out.println("3. Salir");
                        CuentaCorriente = read.nextInt();

                        switch (CuentaCorriente) {

                            case 1:
                                System.out.println("Ingrese datos a la factura a continuación: ");

                                llenaInformacion();

                                break;
                            case 2:
                                System.out.println("Impresion de factura.");
                                imprimirDecoradoAvanzado();
                                break;
                            case 3:
                                System.out.println("Salir.");
                                break;
                            default:
                                System.out.println("Selecciono Volver Atras.");
                        }

                    } while (CuentaCorriente < 3);
                    break;

            }
        } while (Seleccion < 3);
    }
}
