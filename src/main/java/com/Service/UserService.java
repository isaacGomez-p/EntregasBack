package com.Service;

import com.model.Response;
import com.model.UserEntity;

public interface UserService {

    public Response login(UserEntity userEntity);

    public Response register(UserEntity userEntity);
}
