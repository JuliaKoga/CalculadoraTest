package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {
    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public Double calcularAreaTriangulo(Triangulo triangulo){
        if (triangulo !=null){
            return (triangulo.getAltura()*triangulo.getBase())/2;
        }
        else {
            System.err.println("Triangulo não pode ser nulo");
            return calcularAreaTriangulo(triangulo);
        }
    }

    public Double calcularAreaQuadrado(Quadrado quadrado){
        if (quadrado !=null) {
            return quadrado.getLado()*quadrado.getLado();}
        else {
            System.err.println("Quadrado não pode ser nulo");
            return calcularAreaQuadrado(quadrado);
        }
    }

    public Triangulo trianguloDeMenorArea(Triangulo trianguloA, Triangulo trianguloB){
        if (calcularAreaTriangulo(trianguloA)>calcularAreaTriangulo(trianguloB)) {
            return trianguloB;
        } else if (calcularAreaTriangulo(trianguloA)<calcularAreaTriangulo(trianguloB)) {
            return trianguloA;
        }else {return null;}
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadradoA, Quadrado quadradoB){
        if (calcularAreaQuadrado(quadradoA)>calcularAreaQuadrado(quadradoB)) {
            return quadradoB;
        } else if (calcularAreaQuadrado(quadradoA)<calcularAreaQuadrado(quadradoB)) {
            return quadradoA;
        }else {return null;}
    }
}
