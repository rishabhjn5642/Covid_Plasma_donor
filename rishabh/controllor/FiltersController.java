package com.example.rishabh.controllor;


import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.FiltersOnDistanceDTO;
import com.example.rishabh.service.CovidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/filters")
public class FiltersController {

    @Autowired
    private CovidServices covidServices;

    @PostMapping("/distance")
    public List <CovidResponse> getFilters(@RequestBody FiltersOnDistanceDTO filtersOnDistanceDTO)
    {
        return covidServices.filtersDetails(filtersOnDistanceDTO);
    }

    @PostMapping("/coviddistance")
    public List <CovidResponse> getcovidFilters(@RequestBody FiltersOnDistanceDTO filtersOnDistanceDTO)
    {
        return covidServices.covidFiltersDetails(filtersOnDistanceDTO);
    }



}
