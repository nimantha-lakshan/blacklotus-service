package com.blacklotus.service.services;

import com.blacklotus.service.common.services.AbstractRestService;
import com.blacklotus.service.dto.AuthenticationDTO;
import com.blacklotus.service.dto.UserDTO;
import com.blacklotus.service.models.request.UserModel;
import com.blacklotus.service.models.response.SignInResponse;
import com.blacklotus.service.services.interfaces.IAuthenticationRestService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Setter
public class AuthenticationRestService extends AbstractRestService implements IAuthenticationRestService<UserDTO, String> {

    private HttpHeaders httpHeaders;

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

    public AuthenticationDTO userSignIn(UserModel userModel) {
        SignInResponse forObject = this.getRestTemplate().getForObject(this.buildRequestUrl("/auth/signin"), SignInResponse.class);
        return AuthenticationDTO.builder()
                .accessToken(forObject.getBody().getAccessToken())
                .build();

    }
}
