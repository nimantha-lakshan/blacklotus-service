package com.blacklotus.service.services;

import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.ProductDTO;
import com.blacklotus.service.services.interfaces.IProductRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductRestService extends AbstractRestService implements IProductRestService<ProductDTO, String> {


    @Override
    public List<ProductDTO> findByName(String name) {
        return null;
    }

    @Override
    public List<ProductDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(ProductDTO dto) {
        return false;
    }

    @Override
    public ProductDTO update(ProductDTO dto) {
        return null;
    }

    @Override
    public ProductDTO findById(String id) {
        return null;
    }
}
