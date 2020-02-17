package com.blacklotus.service.services;

import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.InvoiceDTO;
import com.blacklotus.service.services.interfaces.ISalesRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SalesRestService extends AbstractRestService implements ISalesRestService<InvoiceDTO, String> {


    @Override
    public List<InvoiceDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(InvoiceDTO dto) {
        return false;
    }

    @Override
    public InvoiceDTO update(InvoiceDTO dto) {
        return null;
    }

    @Override
    public InvoiceDTO findById(String id) {
        return null;
    }
}
