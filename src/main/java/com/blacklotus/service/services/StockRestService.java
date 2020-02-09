package com.blacklotus.service.services;


import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.StockDTO;
import com.blacklotus.service.services.interfaces.IStockRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StockRestService extends AbstractRestService implements IStockRestService<StockDTO, String> {

    @Override
    public List<StockDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(StockDTO dto) {
        return false;
    }

    @Override
    public StockDTO update(StockDTO dto) {
        return null;
    }

    @Override
    public StockDTO findById(String id) {
        return null;
    }
}
