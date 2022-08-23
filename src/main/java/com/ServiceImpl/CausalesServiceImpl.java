package com.ServiceImpl;

import com.Repository.CausalesRepository;
import com.Service.CausalesService;
import com.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CausalesServiceImpl implements CausalesService {

    @Autowired
    private CausalesRepository causalesRepository;

    @Transactional(readOnly = true)
    public Response getCausales() {
        return new Response(HttpStatus.OK, "Data found!", causalesRepository.findAll());
    }
}
