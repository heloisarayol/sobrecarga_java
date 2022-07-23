package sobrecarga.exercicio.dio;

public class Quadrilatero {

    //************Quadrado

    public static void area(double lado) {
        System.out.println("A área do quadrado é " + lado * lado);
    }
    //************Retângulo

    public static void area(double lado1, double altura) {
        System.out.println("A área do retângulo é " + lado1 * altura);
    }
    //*********** Trapézio
    public static void area(double baseMaior, double baseMenor, double altura1){
        System.out.println("A área do trapézio é " + (baseMaior+baseMenor)*altura1/2);
    }

}
