package com.controller;

import com.Service.DataService;
import com.model.IData;
import com.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dataController")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DataController {

    @Autowired
    DataService dataService;

    @GetMapping(value = "/getData")
    public Response getData(){
        return this.dataService.getData();
    }

    @PostMapping(value = "/modificar")
    public Response modificar(@RequestBody IData iData){
        return this.dataService.modificar(iData);
    }

}
