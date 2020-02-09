package com.blacklotus.service.common.services;

import com.blacklotus.service.common.dto.DTO;

import java.util.List;

public interface IRestService<T extends DTO, PRIMARY_KEY> {

    List<T> findAll();

    boolean add(T dto);

    T update(T dto);

    T findById(PRIMARY_KEY id);

}
