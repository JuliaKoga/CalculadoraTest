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
    Quadrado quadrado1;
    Quadrado quadrado2;
    Triangulo triangulo;
    Triangulo triangulo1;
    Triangulo triangulo2;
    @Before
    public void before() {
        a = 8;
        b = 2;
        triangulo = new Triangulo(5d,4d);
        quadrado = new Quadrado(5d);
        triangulo1 = new Triangulo(6d,5d);
        quadrado1 = new Quadrado(6d);
        triangulo2 = new Triangulo(5d,4d);
        quadrado2 = new Quadrado(5d);
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

    @Test
    public void deveRetornarOQuadradoDeMenorArea(){
        //Given
        //When
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado,quadrado1);

        //Then
        assertSame(resultado, quadrado);
    }

    @Test
    public void deveRetornarOTrianguloDeMenorArea(){
        //Given
        //When
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo,triangulo1);

        //Then
        assertSame(resultado, triangulo);
    }

    @Test
    public void deveRetornarNuloQuandoAmbosQuadradosTiveremAreaIgual(){
        //Given
        //When
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado,quadrado2);

        //Then
        assertNull(resultado);
    }

    @Test
    public void deveRetornarNuloQuandoAmbosTriangulosTiveremAreaIgual(){
        //Given
        //When
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo,triangulo2);

        //Then
        assertNull(resultado);
    }
}



