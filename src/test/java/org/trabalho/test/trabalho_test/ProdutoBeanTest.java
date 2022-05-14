package org.trabalho.test.trabalho_test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    @Test
    void compareTo() {
        ProdutoBean produtoBean = new ProdutoBean();// Criação de produto padrão
        ArrayList<ProdutoBean> produtoBeanArrayList = new ArrayList<>();
        produtoBeanArrayList.add(produtoBean);
        produtoBeanArrayList.add(new ProdutoBean("prod3","Produto Caro","Alto Valor",1000.0,"Novo"));
        produtoBeanArrayList.add(new ProdutoBean("prod2","Produto Médio","Médio Valor",100.0,"Usado"));
        Collections.sort(produtoBeanArrayList);
        assertEquals(produtoBeanArrayList.get(0).getValor(),0.0);
        assertEquals(produtoBeanArrayList.get(1).getValor(),100.0);
        assertEquals(produtoBeanArrayList.get(2).getValor(),1000.0);
    }
}