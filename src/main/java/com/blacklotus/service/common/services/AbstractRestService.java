package com.blacklotus.service.common.services;

import com.blacklotus.service.common.Constants;
import com.blacklotus.service.common.dao.DAO;
import com.blacklotus.service.common.dto.DTO;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public abstract class AbstractRestService {

    private final DefaultMapperFactory mapperFactory;
    private final RestTemplate restTemplate;

    public AbstractRestService() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.restTemplate = new RestTemplate();
    }

    public AbstractRestService(DefaultMapperFactory mapperFactory, RestTemplate restTemplate) {
        this.mapperFactory = mapperFactory;
        this.restTemplate = restTemplate;
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

    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }

    private void getEmployees() {
        String result = this.restTemplate.getForObject(Constants.BASE_URL, String.class);
        System.out.println(result);
    }

}
