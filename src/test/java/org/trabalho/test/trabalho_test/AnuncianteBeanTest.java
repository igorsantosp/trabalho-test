package org.trabalho.test.trabalho_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

class AnuncianteBeanTest {
    static  AnuncianteBean anuncianteBean;
    @BeforeAll
    static void setAnuncianteBean(){
        ProdutoBean produtoBean1= new ProdutoBean();
        produtoBean1.setValor(100.0);
        ProdutoBean produtoBean2= new ProdutoBean();
        produtoBean2.setValor(200.0);

        AnuncioBean anuncio1= new AnuncioBean();
        anuncio1.setProduto(produtoBean1);
        AnuncioBean anuncio2= new AnuncioBean();
        anuncio2.setProduto(produtoBean2);

        ArrayList<AnuncioBean> anuncioBeanArrayList = new ArrayList<>();
        anuncioBeanArrayList.add(anuncio1);
        anuncioBeanArrayList.add(anuncio2);

        anuncianteBean = new AnuncianteBean("Anunciante","01196850219",anuncioBeanArrayList);
    }

    @Test
    void TestValorMedioDeDoisAnuncios(){
        assertEquals(anuncianteBean.valorMedioAnuncios(),150);
    }

    @Test
    void TestValorMedioDeAnuncianteSemAnuncios(){
        assertEquals(new AnuncianteBean().valorMedioAnuncios(),0.0);
    }
}