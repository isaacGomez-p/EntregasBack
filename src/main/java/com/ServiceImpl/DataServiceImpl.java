package com.ServiceImpl;

import com.Repository.IDataRepository;
import com.Service.DataService;
import com.model.IData;
import com.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private IDataRepository iDataRepository;

    @Override
    public Response getData() {
        return new Response(HttpStatus.OK, "Data Found!", iDataRepository.findAll());
    }

    @Override
    public Response modificar(IData data) {
        return new Response(HttpStatus.CREATED, "Data saved", iDataRepository.save(data));
    }

}
