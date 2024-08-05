/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sistemas;

import java.util.Scanner;

public class App {
    
    // Diseñe un algoritmo para saludar al usuario: Hola usuario. El nombre del usuario es ingresado por teclado
    public static String saludarUsuario(String nombre) {
        try {

            String nombreUsuario = "Hola, " +nombre;
            return nombreUsuario;
        
            } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    // Diseñe un algoritmo que lea por teclado una velocidad en Km/seg y la convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public static String convertirVelocidad(double kmPorSeg) {

        try {

            double metrosPorSeg = kmPorSeg * 1000;
            double metrosPorHora = kmPorSeg * 3600;
            String m_s = String.valueOf(metrosPorSeg);
            String m_h = String.valueOf(metrosPorHora);

            return m_s + "|" + m_h;

        } catch (Exception e) {
            return "0|0";
        }
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centímetros cúbicos) y devolver su cantidad en litros
    public static int convertirCcALitros(double cc) {
        try {
            
            int valorConvertir = (int)(cc / 1000);
            return valorConvertir;

        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar una cantidad en dólares y convertirla a pesos según la TRM del día
    public static int convertirDolaresAPesos(double dolares, double trm) {
        try {

            int cantidadPesos = (int)(dolares * trm);
            return cantidadPesos;


        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar la temperatura en grados centígrados y convertirla en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5)
    public static int convertirCelsiusAFahrenheit(double celsius) {
        try {
            /*
            Datos de entrada:
            celsius

            Datos de salida:
            fahrenheit
            */

            double fahrenheit = 32 + (celsius * 1.8);
            return (int)fahrenheit;

        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar Nro de Días nro de horas nro de minutos y nro segundos y convertir todo a segundos.
    public static int convertirATotalSegundos(int dias, int horas, int minutos, int segundos) {
        try {

             int diasSegundos = dias * 24 * 3600;
             int horasSegundos = horas * 3600;
             int minutosSegundos = minutos * 60;
             int totalSegundos = diasSegundos + horasSegundos + minutosSegundos + segundos;

            return totalSegundos;

        } catch (Exception e) {
            return -1;
        }
    }

    // Un usuario tiene un sistema de báscula para pesar camiones, dado el peso de un camión debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public static String calcularPesoNeto(double peso) {
        try {

            double pesoEnKg = peso;
            double pesoEnToneladas = pesoEnKg/1000;

            return String.valueOf(pesoEnKg) + "|" + String.valueOf(pesoEnToneladas);

        } catch (Exception e) {
            return "0|0";
        }
    }

    // Diseñe un algoritmo que calcule el tiempo necesario para alcanzar un destino dado por el usuario quien además ingresará la velocidad promedio en kilómetros/hora y la distancia en kilómetros
    public static int calcularTiempoViaje(double distancia, double velocidadKilometros, double velocidadHora) {
        try {

            int distanciaInt = (int) distancia;
            int velocidadKilometrosInt = (int) velocidadKilometros;
            int velocidadInt = (int) (velocidadHora);
            int tiempoViaje = (distanciaInt * velocidadInt)/velocidadKilometros;
            
            return tiempoViaje;

        } catch (Exception e) {
            return -1;
        }
    }

    // Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando 4 rutas y el kilometraje de cada ruta obtenga la cantidad de combustible que debe tanquear en el avión.
    public static int calcularCombustible(double ruta1, double ruta2, double ruta3, double ruta4) {
        try {

            double combustibleDespegue = 1.2;
            double combustibleAterrizaje = 0.4;
            double combustibleRutas = (0.2/60.8) * (ruta1 + ruta2 + ruta3 + ruta4); 
            double combustibleTotal = combustibleRutas + combustibleAterrizaje + combustibleDespegue;

            return (int)combustibleTotal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñar un algoritmo que calcule el peso neto en la luna de un peso terrestre ingresado por teclado. La gravedad de la Luna es de alrededor del 17% más que la de la tierra
    public static int calcularPesoLunar(double pesoTierra) {
        try {

            double pesoLuna = pesoTierra * 0.17;

            return (int)pesoLuna;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñar un algoritmo que calcule el saldo que debe haber en una taquilla de un banco. El cajero deberá ingresar la base el total de recaudos y el total de retiros
    public static int calcularSaldoTaquilla(double base, double ingresos, double retiros) {
        try {

            double dineroTotal = base+ingresos-retiros;

            return (int)dineroTotal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo para calcular la propina en un restaurante(10%) el impuesto al consumo (8%) y el valor final que deberá pagar ingresando el valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante(double costoComida) {
        try {
      
            double propina = costoComida*(0.10);
            double impuesto = costoComida*(0.08);
            double total = propina+impuesto+costoComida;

            return String.valueOf(propina) + "|" + String.valueOf(impuesto) + "|" + String.valueOf(total);

        } catch (Exception e) {
            return -1 + "|" + -1 + "|" + -1;
        }
    }

    // Diseñar un algoritmo que obtenga los puntos finales de un equipo de fútbol (puntuación según lineamientos de Fifa) a partir de los datos ingresados por teclado: Número de partidos ganados número de partidos perdidos número de partidos empatados.
    public static int calcularPuntosFutbol(int ganados, int perdidos, int empatados) {
        try {

            int calificacionFinal = (ganados*3) + (perdidos*0) + (empatados*1);

            return calificacionFinal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para una materia calcule la nota final.
    public static int calcularNotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5,
                                        double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5) {
        try {

            double nota1Final = nota1 * porcentaje1;
            double nota2Final = nota2 * porcentaje2;
            double nota3Final = nota3 * porcentaje3;
            double nota4Final = nota4 * porcentaje4;
            double nota5Final = nota5 * porcentaje5;
            
            int notaFinal =(int) (nota1Final + nota2Final + nota3Final + nota4Final + nota5Final);

            return (int)notaFinal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4 primeras notas calcule cuánto tiene que sacar para ganar si el puntaje mínimo es 3.

    public static int calcularNotaNecesaria(double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5,
                                            double nota1, double nota2, double nota3, double nota4) {
        try {
            
            int puntaje_acumulado = (int)((nota1 * porcentaje1) + (nota2 * porcentaje2) + (nota3 * porcentaje3) + (nota4 * porcentaje4));
            int porcentaje_restante = (int)porcentaje5;
            int nota_minima = 3;

            double nota_necesaria = (nota_minima - puntaje_acumulado) / (porcentaje_restante);

            return (int)nota_necesaria;
        
        } catch (Exception e) {
            return -1;
        }
    }

    // Se requiere un algoritmo para calcular el salario a pagar a un trabajador con los siguientes datos ingresados por teclado: cantidad de horas normales laboradas cantidad de horas extras diurnas laboradas cantidad de horas extras nocturnas laboradas valor de la hora normal. El valor de las horas extras diurnas tienen un recargo adicional del 15% sobre la hora normal. El valor de las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora normal.
    public static int calcularSalario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, double valorHoraNormal) {
        try {
            
            int incrementoHoraNocturna = (int)(valorHoraNormal * 0.35);
            int incrementoHoraDiurna = (int)(valorHoraNormal * 0.15);
            int pagoHorasDiurnas =  (valorHoraNormal + incrementoHoraDiurna) * horasExtrasDiurnas;
            int pagoHorasNocturnas = (valorHoraNormal + incrementoHoraNocturna) * horasExtrasNocturnas;
            int pagoHorasNormales = valorHoraNormal * horasNormales;
            int salarioFinal = pagoHorasDiurnas + pagoHorasNocturnas + pagoHorasNormales;

            return salarioFinal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área de un triángulo rectángulo.
    public static int calcularAreaTriangulo(double base, double altura) {
        try {

            double areaTriangulo = (base*altura)/2;
            
            return (int)areaTriangulo;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el perímetro de un cuadrado.
    public static int calcularPerimetroCuadrado(double lado) {
        try {
            
            double perimetroCuadrado = lado * 4; 

            return (int)perimetroCuadrado;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el volumen de un cilindro.
    public static int calcularVolumenCilindro(double radio, double altura) {
        try {
            
            double pi = Math.PI;
            double volumenCilindro = pi * radio * radio * altura;

            return (int) volumenCilindro;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área del círculo. El radio se pide por teclado.
    public static int calcularAreaCirculo(double radio) {
        try {

            double pi = Math.PI;
            double areaCirculo = pi * radio * radio;
            
            return (int)areaCirculo;
            
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
