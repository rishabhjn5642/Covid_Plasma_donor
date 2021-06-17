package com.example.rishabh.dao.service;

import com.example.rishabh.dao.entity.Recovered;
import com.example.rishabh.model.CovidRequestDTO;
import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.FiltersOnDistanceDTO;
import com.example.rishabh.model.RequestPendingDetailsDTO;

import java.util.*;

public interface CovidDaoService {

CovidResponse saveRecoveredDetails(CovidRequestDTO covidRequestDTO);

String saveCovidUsersDetails(CovidRequestDTO covidRequestDTO);

List <CovidResponse> getRecoveredDetails();

Recovered getRecoveredUserID(Long id);


String CovidLogin(CovidRequestDTO covidRequestDTO);

List<CovidResponse> filterRecoveredDao(FiltersOnDistanceDTO filtersOnDistanceDTO);

String saveRequestDetailsDao(RequestPendingDetailsDTO requestPendingDetailsDTO);

public List<RequestPendingDetailsDTO> getPendingDao();

    String RecoveredLogin(CovidRequestDTO covidRequestDTO);


    List <CovidResponse> getCovidDetails();

    List<CovidResponse> filterCovidDao(FiltersOnDistanceDTO filtersOnDistanceDTO);




}
