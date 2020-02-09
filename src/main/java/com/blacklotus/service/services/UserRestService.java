package com.blacklotus.service.services;

import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.UserDTO;
import com.blacklotus.service.services.interfaces.IUserRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserRestService extends AbstractRestService implements IUserRestService<UserDTO, String> {

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(UserDTO dto) {
        return false;
    }

    @Override
    public UserDTO update(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO findById(String id) {
        return null;
    }
}
