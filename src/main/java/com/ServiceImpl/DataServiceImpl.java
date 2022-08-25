package com.ServiceImpl;

import com.Repository.IDataRepository;
import com.Service.DataService;
import com.model.IData;
import com.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private IDataRepository iDataRepository;

    @Override
    public Response getData() {
        return new Response(HttpStatus.OK, "Data Found!", iDataRepository.findAll());
    }

    @Override
    public Response modificar(List<IData> dataLocal) {

        List<IData> dataDB = iDataRepository.findAll();

        dataLocal.forEach(iDataLocal -> {
            dataDB.forEach(iDataDB -> {
                if(iDataDB.getPedido().equals(iDataLocal.getPedido()) && iDataDB.getEstado() != iDataLocal.getEstado()){
                    iDataDB.setEstado(iDataLocal.getEstado());
                    iDataDB.setEntrega_Fec(iDataLocal.getEntrega_Fec());
                    iDataDB.setCausal_Id(iDataLocal.getCausal_Id());
                    iDataRepository.save(iDataDB);
                }
            });

        });

        return new Response(HttpStatus.OK, "Data saved");
    }

}
