package com.blacklotus.service.services.interfaces;

import com.blacklotus.service.common.dto.DTO;
import com.blacklotus.service.common.services.IRestService;

public interface IUserRestService<T extends DTO, K> extends IRestService<T, K> {
}