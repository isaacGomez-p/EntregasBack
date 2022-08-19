package com.Service;

import com.model.IData;
import com.model.Response;

public interface DataService {

    public Response getData();

    public Response modificar(IData data);

}
