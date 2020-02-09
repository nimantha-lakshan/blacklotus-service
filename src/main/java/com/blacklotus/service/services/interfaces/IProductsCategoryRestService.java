package com.blacklotus.service.services.interfaces;

import com.blacklotus.service.common.dto.DTO;
import com.blacklotus.service.common.services.IRestService;

import java.util.List;

public interface IProductsCategoryRestService<T extends DTO, K> extends IRestService<T, K> {

    List<T> findByName(String name);
}
