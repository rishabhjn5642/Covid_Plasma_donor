package com.example.rishabh.service;

import com.example.rishabh.dao.entity.Recovered;
import com.example.rishabh.model.CovidRequestDTO;
import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.FiltersOnDistanceDTO;
import com.example.rishabh.model.RequestPendingDetailsDTO;

import java.util.List;

public interface CovidServices {


    CovidResponse createRecoveredUser(CovidRequestDTO covidRequestDTO);



    List <CovidResponse> getRecoveredUsers();
    Recovered getRecoveredId(Long id);
    String loginDetails(CovidRequestDTO covidRequestDTO);
    String createCovidUsers(CovidRequestDTO covidRequestDTO);

    List <CovidResponse > filtersDetails(FiltersOnDistanceDTO filtersOnDistanceDTO);
     String saveRequestDetails(RequestPendingDetailsDTO requestPendingDetailsDTO);
     public List <RequestPendingDetailsDTO> getPendingResults();
    String loginRecoveredDetails(CovidRequestDTO covidRequestDTO);

    List <CovidResponse> getCovidUsers();

    List <CovidResponse > covidFiltersDetails(FiltersOnDistanceDTO filtersOnDistanceDTO);


}
