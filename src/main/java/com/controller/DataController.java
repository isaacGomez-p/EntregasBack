package com.controller;

import com.Service.DataService;
import com.Service.UserService;
import com.model.IData;
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

    @GetMapping(value = "/getData")
    public Response getData(){
        return this.dataService.getData();
    }

    @PostMapping(value = "/modificar")
    public Response modificar(@RequestBody IData iData){
        return this.dataService.modificar(iData);
    }

    @PostMapping(value = "/json")
    public Response json(@RequestBody List<IData> iDataList) {
        iDataList.forEach(iData -> {
            this.dataService.modificar(iData);
        });
        return new Response(HttpStatus.MULTI_STATUS, "DDDD");
    }

    @PostMapping(value = "/login")
    public Response login(@RequestBody UserEntity userEntity){
        return this.userService.login(userEntity);
    }

}
