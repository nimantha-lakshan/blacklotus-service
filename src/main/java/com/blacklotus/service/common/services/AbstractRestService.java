package com.blacklotus.service.common.services;

import com.blacklotus.service.common.dao.DAO;
import com.blacklotus.service.common.dto.DTO;
import lombok.NonNull;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public abstract class AbstractRestService {

    private final DefaultMapperFactory mapperFactory;
    private final RestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8080/api/v1";

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

    public String buildRequestUrl(String path) {
        return BASE_URL.concat(path);
    }

    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }

    public <T> T sendGetRequest(@NonNull String url, HttpHeaders headers, Class<T> responseType) {
        return this.sendApiRequest(url, HttpMethod.GET, headers, responseType);
    }

    public <T> T sendPostRequest(@NonNull String url, HttpHeaders headers, Class<T> responseType) {
        return this.sendApiRequest(url, HttpMethod.POST, headers, responseType);
    }

    public <T> T sendPutRequest(@NonNull String url, HttpHeaders headers, Class<T> responseType) {
        return this.sendApiRequest(url, HttpMethod.PUT, headers, responseType);
    }

    private <T> T sendApiRequest(@NonNull String url, HttpMethod method, HttpHeaders headers, Class<T> responseType) {
        return this.restTemplate.exchange(BASE_URL.concat(url), method, new HttpEntity<>(headers), responseType).getBody();
    }

}
