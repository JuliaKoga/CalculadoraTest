package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CalculadoraServiceTeste {

    CalculadoraService calculadoraService = new CalculadoraService();
    int a;
    int b;
    Quadrado quadrado;
    Triangulo triangulo;
    @Before
    public void before() {
        a = 8;
        b = 2;
        triangulo = new Triangulo(5d,4d);
        quadrado = new Quadrado(5d);
    }

    @Test
    public void deveSomarCorretamente() {
        //Given
        //When
        int resultado = calculadoraService.somar(a, b);

        //Then
        assertEquals(a+b, resultado);
    }


    @Test
    public void deveSubtrairCorretamente () {
        //Given
        //When
        int resultado = calculadoraService.subtrair(a, b);

        //Then
        assertEquals(a-b, resultado);
    }

    @Test
    public void deveDividirCorretamente () {
        //Given
        //When
        int resultado = calculadoraService.dividir(a, b);

        //Then
        assertEquals(a/b, resultado);
    }

    @Test
    public void deveMultiplicarCorretamente () {
        //Given
        //When
        int resultado = calculadoraService.multiplicar(a, b);

        //Then
        assertEquals(a*b, resultado);

    }

    @Test
    public void deveCalcularAreaDeUmQuadradoCorretamente(){
        //Given
        //When
        Double resultado = calculadoraService.calcularAreaQuadrado(quadrado);
        Double i = 25d;
        //Then
        assertEquals(i,resultado);
    }

    @Test
    public void deveCalcularAreaDeUmTrianguloCorretamente(){
        //Given
        //When
        Double resultado = calculadoraService.calcularAreaTriangulo(triangulo);
        Double i = 10d;

        //Then
        assertEquals(i,resultado);
    }

}



