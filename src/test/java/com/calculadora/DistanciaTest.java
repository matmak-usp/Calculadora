package com.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.calculadora.Distancia.TipoConversao;

import org.junit.Assert;

@RunWith(JUnit4.class)
public class DistanciaTest {
    @Test
    public void testeConverterMilhasParaQuilometros() throws Exception
    {
        Distancia dist = new Distancia();
        double valor = dist.Converter(TipoConversao.MilhasParaQuilometros, 2);
        
        Assert.assertEquals(3.218, valor, 0.1);
    }

    @Test
    public void testeConverterQuilometrosParaMilhas() throws Exception
    {
        Distancia dist = new Distancia();
        double valor = dist.Converter(TipoConversao.QuilimetrosParaMilhas, 2);
        
        Assert.assertEquals(1.2428, valor, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeConverterNull() throws Exception
    {
        Distancia dist = new Distancia();
        dist.Converter(null, 2);
        
        Assert.fail("Era esperedo uma exceção, porém não ocorreu");
    }
}
