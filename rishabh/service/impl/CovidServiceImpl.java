package com.example.rishabh.service.impl;

import com.example.rishabh.dao.entity.Recovered;
import com.example.rishabh.dao.service.CovidDaoService;
import com.example.rishabh.model.CovidRequestDTO;
import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.FiltersOnDistanceDTO;
import com.example.rishabh.model.RequestPendingDetailsDTO;
import com.example.rishabh.service.CovidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CovidServiceImpl implements CovidServices {

    @Autowired
    private CovidDaoService covidDaoService;

    @Override
    public CovidResponse createRecoveredUser(CovidRequestDTO covidRequestDTO) {
        return covidDaoService.saveRecoveredDetails(covidRequestDTO);
    }

    @Override
    public List <CovidResponse> getRecoveredUsers() {


        List <CovidResponse> list= covidDaoService.getRecoveredDetails();

        return list;
    }



    @Override
    public Recovered getRecoveredId(Long id) {



       covidDaoService.getRecoveredUserID(id);

       return covidDaoService.getRecoveredUserID(id);

    }

    @Override
    public String loginDetails(CovidRequestDTO covidRequestDTO) {

        return covidDaoService.CovidLogin(covidRequestDTO);
    }

    @Override
    public String createCovidUsers(CovidRequestDTO covidRequestDTO) {
        return covidDaoService.saveCovidUsersDetails(covidRequestDTO);
    }

    @Override
    public List<CovidResponse> filtersDetails(FiltersOnDistanceDTO filtersOnDistanceDTO) {
        List<CovidResponse> list = covidDaoService.filterRecoveredDao(filtersOnDistanceDTO);
        return list;
    }

    @Override
    public String saveRequestDetails(RequestPendingDetailsDTO requestPendingDetailsDTO) {


        return covidDaoService.saveRequestDetailsDao(requestPendingDetailsDTO);
    }

    @Override
    public List<RequestPendingDetailsDTO> getPendingResults() {

        List<RequestPendingDetailsDTO> list =covidDaoService.getPendingDao();

        return list;

    }

    @Override
    public String loginRecoveredDetails(CovidRequestDTO covidRequestDTO) {
        return covidDaoService.RecoveredLogin(covidRequestDTO);
    }

    @Override
    public List<CovidResponse> getCovidUsers() {

        return covidDaoService.getCovidDetails();
    }

    @Override
    public List<CovidResponse> covidFiltersDetails(FiltersOnDistanceDTO filtersOnDistanceDTO) {

        return covidDaoService.filterCovidDao(filtersOnDistanceDTO);
    }


}

