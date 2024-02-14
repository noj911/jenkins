package com.groupeisi.jenkins_test.service;
import com.groupeisi.jenkins_test.dao.ProduitDAO;
import com.groupeisi.jenkins_test.dto.ProduitDTO;
import com.groupeisi.jenkins_test.entities.Produit;
import com.groupeisi.jenkins_test.mapping.ProduitMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class ProduitServiceTest {

    @Mock
    private ProduitDAO produitDAO;

    @Mock
    private ProduitMapper produitMapper;

    @InjectMocks
    private ProduitService produitService;

    @Test
    void testSaveProduit() {
        ProduitDTO produitDTO = new ProduitDTO();
        Produit produitEntity = new Produit();

        when(produitMapper.toEntity(produitDTO)).thenReturn(produitEntity);
        when(produitDAO.save(produitEntity)).thenReturn(produitEntity);
        when(produitMapper.toDTO(produitEntity)).thenReturn(produitDTO);

        ProduitDTO result = produitService.saveProduit(produitDTO);

        verify(produitMapper, times(1)).toEntity(produitDTO);
        verify(produitDAO, times(1)).save(produitEntity);
        verify(produitMapper, times(1)).toDTO(produitEntity);

        assertEquals(produitDTO, result);
    }

    @Test
    void testGetAllProduits() {
        Produit produitEntity = new Produit();
        ProduitDTO produitDTO = new ProduitDTO();

        when(produitDAO.findAll()).thenReturn(Collections.singletonList(produitEntity));
        when(produitMapper.toDTO(produitEntity)).thenReturn(produitDTO);

        assertEquals(Collections.singletonList(produitDTO), produitService.getAllProduits());

        verify(produitDAO, times(1)).findAll();
        verify(produitMapper, times(1)).toDTO(produitEntity);
    }
}
