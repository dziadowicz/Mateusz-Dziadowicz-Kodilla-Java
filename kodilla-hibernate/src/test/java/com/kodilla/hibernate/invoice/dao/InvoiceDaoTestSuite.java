package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    private static final String PRODUCTNAME1 = "Onion";
    private static final String PRODUCTNAME2 = "Potato";
    private static final BigDecimal PRICE1 = BigDecimal.valueOf(3.87);
    private static final BigDecimal PRICE2 = BigDecimal.valueOf(1.53);
    private static final int QUANTITY1 = 4;
    private static final int QUANTITY2 = 8;
    private static final String INVOICE_NUMBER1 = "2021/03/2";
    private static final String INVOICE_NUMBER2 = "2021/03/3";


    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product(PRODUCTNAME1);
        Product product2 = new Product(PRODUCTNAME2);
        Item item1 = new Item(product1, PRICE1, QUANTITY1);
        Item item2 = new Item(product2, PRICE2, QUANTITY2);
        Item item3 = new Item(product1, PRICE1, QUANTITY2);
        Invoice invoice1 = new Invoice(INVOICE_NUMBER1);
        Invoice invoice2 = new Invoice(INVOICE_NUMBER2);
        product1.getItems().add(item1);
        product1.getItems().add(item3);
        product2.getItems().add(item2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
        } catch (Exception e) {

        }


    }
}
