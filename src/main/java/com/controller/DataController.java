package com.controller;

import com.Service.DataService;
import com.Service.UserService;
import com.model.IData;
import com.model.RequestDTO;
import com.model.Response;
import com.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dataController")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DataController {

    @Autowired
    DataService dataService;

    @Autowired
    UserService userService;

    @PostMapping(value = "/getData")
    public Response getData(@RequestBody RequestDTO requestDTO){
        return this.dataService.getData(requestDTO);
    }

    @PostMapping(value = "/modificar")
    public Response modificar(@RequestBody List<IData> listaIData){
        return this.dataService.modificar(listaIData);
    }

    @PostMapping(value = "/login")
    public Response login(@RequestBody UserEntity userEntity){
        return this.userService.login(userEntity);
    }

}
