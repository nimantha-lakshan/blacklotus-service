package com.blacklotus.service.services;

import com.blacklotus.service.dto.AddressDTO;
import com.blacklotus.service.services.interfaces.IAddressRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressRestService implements IAddressRestService<AddressDTO, String> {

    @Override
    public List<AddressDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(AddressDTO dto) {
        return false;
    }

    @Override
    public AddressDTO update(AddressDTO dto) {
        return null;
    }

    @Override
    public AddressDTO findById(String id) {
        return null;
    }

}
