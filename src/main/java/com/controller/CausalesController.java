package com.controller;

import com.Service.CausalesService;
import com.Service.DataService;
import com.Service.UserService;
import com.model.IData;
import com.model.Response;
import com.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/causalesController")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CausalesController {

    @Autowired
    private CausalesService causalesService;

    @GetMapping(value = "/getCausales")
    public Response getCausales(){
        return this.causalesService.getCausales();
    }

}
