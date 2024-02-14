package com.groupeisi.jenkins_test.mapping;

import com.groupeisi.jenkins_test.dto.ProduitDTO;
import com.groupeisi.jenkins_test.entities.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProduitMapper {

    @Mapping(target = "id", ignore = true)
    Produit toEntity(ProduitDTO produitDTO);

    ProduitDTO toDTO(Produit produit);
}

