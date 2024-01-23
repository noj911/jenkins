package com.groupeisi.che444.mapping;

import com.groupeisi.che444.dto.ProduitDTO;
import com.groupeisi.che444.entities.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProduitMapper {

    @Mapping(target = "id", ignore = true)
    Produit toEntity(ProduitDTO produitDTO);

    ProduitDTO toDTO(Produit produit);
}

