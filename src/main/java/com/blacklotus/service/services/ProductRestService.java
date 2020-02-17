package com.blacklotus.service.services;

import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.ProductDTO;
import com.blacklotus.service.models.response.ApiResponse;
import com.blacklotus.service.services.interfaces.IProductRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

        final ArrayList<ProductDTO> list = new ArrayList<>();
        ApiResponse forObject = this.getRestTemplate().getForObject(this.buildRequestUrl("/product"), ApiResponse.class);
        if (forObject != null && forObject.getBody() != null) {
            forObject.getBody().forEach(product -> {
                ProductDTO build = ProductDTO.builder()
                        .active(product.isActive())
                        .id(product.getId())
                        .name(product.getName())
                        .category(product.getCategory().getCategory())
                        .categoryId(product.getCategory().getId())
                        .build();
                list.add(build);
            });
        }
        return list;
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
