package com.blacklotus.service.services;


import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.ProductCategoryDTO;
import com.blacklotus.service.services.interfaces.IProductsCategoryRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductsCategoryRestService extends AbstractRestService implements IProductsCategoryRestService<ProductCategoryDTO, String> {


    @Override
    public List<ProductCategoryDTO> findByName(String name) {
        return null;
    }

    @Override
    public List<ProductCategoryDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(ProductCategoryDTO dto) {
        return false;
    }

    @Override
    public ProductCategoryDTO update(ProductCategoryDTO dto) {
        return null;
    }

    @Override
    public ProductCategoryDTO findById(String id) {
        return null;
    }
}
