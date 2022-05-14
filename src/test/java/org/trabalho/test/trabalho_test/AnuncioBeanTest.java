package org.trabalho.test.trabalho_test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest {
    static AnuncioBean anuncioBean;
    @BeforeAll
    static void setupTest(){
        anuncioBean = new AnuncioBean();
        anuncioBean.getProduto().setValor(100.0);
    }

    @Test
    void testSemDesconto(){
        anuncioBean.setDesconto(0.0);
        assertEquals(anuncioBean.getValor(),100.0);
    }

    @Test
    void test50deDesconto(){
        anuncioBean.setDesconto(0.5);
        assertEquals(anuncioBean.getValor(),50.0);
    }

    @Test
    void test100deDesconto(){
        anuncioBean.setDesconto(1.0);
        assertEquals(anuncioBean.getValor(),0.0);
    }


}