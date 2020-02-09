package com.blacklotus.service.common.service;

import com.blacklotus.service.common.dao.DAO;
import com.blacklotus.service.common.dto.DTO;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

public abstract class AbstractRestService {

    private final DefaultMapperFactory mapperFactory;

    public AbstractRestService() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    public AbstractRestService(DefaultMapperFactory mapperFactory) {
        this.mapperFactory = mapperFactory;
    }

    public <S extends DTO, D extends DAO> D convert(S source, Class<D> classType) {
        return this.mapperFactory.getMapperFacade().map(source, classType);
    }

    public <S extends DAO, D extends DTO> D convert(S source, Class<D> classType) {
        return this.mapperFactory.getMapperFacade().map(source, classType);
    }

    public <S extends DAO, D extends DTO> List<D> convert(List<S> source, Class<D> classType) {
        return this.mapperFactory.getMapperFacade().mapAsList(source, classType);
    }

    public String generateId() {
        return String.valueOf(System.currentTimeMillis());
    }

}
