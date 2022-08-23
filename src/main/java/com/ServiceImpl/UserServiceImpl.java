package com.ServiceImpl;

import com.Repository.UserRepository;
import com.Service.UserService;
import com.model.Response;
import com.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Response login(UserEntity userEntity) {
        if(userEntity.getPassword() == null || userEntity.getPassword().equals("") ){
            return new Response(HttpStatus.CONFLICT, "Password required");
        }
        if( userEntity.getIdentification() == null || userEntity.getIdentification().equals("")){
            return new Response(HttpStatus.CONFLICT, "Identification required");
        }
        Optional<UserEntity> optional = userRepository.findByIdentificationAndPassword(userEntity.getIdentification(), userEntity.getPassword());
        if(optional != null && optional.isPresent()){
            return new Response(HttpStatus.OK, "Login Passed!", optional.get());
        }
        return new Response(HttpStatus.CONFLICT, "Credentials Failed");
    }

    @Override
    public Response register(UserEntity userEntity) {
        return null;
    }
}
