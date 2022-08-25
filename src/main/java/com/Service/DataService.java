package com.Service;

import com.model.IData;
import com.model.Response;

import java.util.List;

public interface DataService {

    public Response getData();

    public Response modificar(List<IData> data);

}
