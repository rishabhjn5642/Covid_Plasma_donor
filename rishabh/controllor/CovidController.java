package com.example.rishabh.controllor;


import com.example.rishabh.dao.entity.Recovered;
import com.example.rishabh.model.CovidRequestDTO;
import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.RequestPendingDetailsDTO;
import com.example.rishabh.service.CovidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/covid")
public class CovidController {

    @Autowired
    private CovidServices covidServices;

    @GetMapping("/getAllCovidUsers")
    public List <CovidResponse> getDetails()
    {
        System.out.println("rishabh");

         List <CovidResponse> list =covidServices.getRecoveredUsers();


         return list;
    }

    @GetMapping("/getCovidUsers/{id}")
    public Recovered getDetailId(@PathVariable String id){



        return covidServices.getRecoveredId(Long.parseLong(id));

    }

    @PostMapping("/add")
    public CovidResponse postDetails(@RequestBody CovidRequestDTO covidRequestDTO)
    {
        return covidServices.createRecoveredUser(covidRequestDTO);

    }

    @PostMapping("/update/{id}")
    public CovidResponse updateDetails(@RequestBody CovidRequestDTO covidRequestDTO )
    {
        return covidServices.createRecoveredUser(covidRequestDTO);

    }

    @PostMapping("/login")
    public String loginDetails(@RequestBody CovidRequestDTO covidRequestDTO )
    {
        return covidServices.loginDetails(covidRequestDTO);
    }

    @PostMapping("/add/covid")
    public String postCovidDetails(@RequestBody CovidRequestDTO covidRequestDTO)
    {
        return covidServices.createCovidUsers(covidRequestDTO);

    }


    @PostMapping("/add/request")
    public String saveRequestDetails(@RequestBody RequestPendingDetailsDTO requestPendingDetailsDTO)
    {
        System.out.println("calling");
        return covidServices.saveRequestDetails(requestPendingDetailsDTO);
    }
    @GetMapping("/getPendingRequest")
    public List <RequestPendingDetailsDTO> getPendingRequests()
    {
        List <RequestPendingDetailsDTO> list = covidServices.getPendingResults();
        return list;

    }
    @PostMapping("/login/recovered")
    public String loginRecoveredDetails(@RequestBody CovidRequestDTO covidRequestDTO )
    {
        return covidServices.loginRecoveredDetails(covidRequestDTO);
    }


    @GetMapping("/recoveredlogin")
    public List<CovidResponse> getCovidInfected()
    {
        return covidServices.getCovidUsers();
    }


}
