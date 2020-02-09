package com.blacklotus.service.services;


import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.UserRoleDTO;
import com.blacklotus.service.services.interfaces.IUserRoleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserRoleRestService extends AbstractRestService implements IUserRoleRestService<UserRoleDTO, String> {


    @Override
    public List<UserRoleDTO> findAll() {
        return null;
    }

    @Override
    public boolean add(UserRoleDTO dto) {
        return false;
    }

    @Override
    public UserRoleDTO update(UserRoleDTO dto) {
        return null;
    }

    @Override
    public UserRoleDTO findById(String id) {
        return null;
    }
}
