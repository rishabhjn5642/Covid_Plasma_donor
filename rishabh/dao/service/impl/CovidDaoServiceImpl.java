package com.example.rishabh.dao.service.impl;

import com.example.rishabh.dao.entity.CovidUsers;
import com.example.rishabh.dao.entity.RecoverdRequest;
import com.example.rishabh.dao.entity.Recovered;
import com.example.rishabh.dao.repository.CovidRepo;
import com.example.rishabh.dao.repository.ResponseRepo;
import com.example.rishabh.dao.service.CovidDaoService;
import com.example.rishabh.model.CovidRequestDTO;
import com.example.rishabh.model.CovidResponse;
import com.example.rishabh.model.FiltersOnDistanceDTO;
import com.example.rishabh.model.RequestPendingDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rishabh.dao.repository.RecoveredRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CovidDaoServiceImpl implements CovidDaoService {

    Long i;

    @Autowired
    private RecoveredRepo recoveredRepo;
    @Autowired
    private CovidRepo covidRepo;
    @Autowired
    private ResponseRepo responseRepo;




    private CovidResponse converter(Recovered recovered) {

        CovidResponse covidResponse = new CovidResponse(recovered.getName(), recovered.getEmail(), recovered.getPassword(), recovered.getCityName(), recovered.getBloodGroup(), recovered.getBidPrice(), recovered.getLatitude(), recovered.getLongitude(),recovered.getPhonenumber());

        return covidResponse;
    }

    private CovidResponse converter2(CovidUsers covidUsers) {

        CovidResponse covidResponse = new CovidResponse(covidUsers.getName(), null, null, null, null, null, covidUsers.getLatitude(), covidUsers.getLongitude(),covidUsers.getPhonenumber());

        return covidResponse;
    }




    @Override
    public CovidResponse saveRecoveredDetails(CovidRequestDTO covidRequestDTO) {
        Recovered recovered = new Recovered();


        recovered.setName(covidRequestDTO.getName());
        recovered.setEmail(covidRequestDTO.getEmail());
        recovered.setPassword(covidRequestDTO.getPassword());
        recovered.setCityName(covidRequestDTO.getCityName());
        recovered.setBidPrice(covidRequestDTO.getBidPrice());
        recovered.setBloodGroup(covidRequestDTO.getBloodGroup());
        recovered.setPhonenumber(covidRequestDTO.getPhonenumber());
        recovered.setLatitude(covidRequestDTO.getLatitude());
        recovered.setLongitude(covidRequestDTO.getLongitude());
        recovered.setTestvalue(false);

        Recovered e = recoveredRepo.save(recovered);


        CovidResponse covidResponseDTO = new CovidResponse(covidRequestDTO.getName(), covidRequestDTO.getEmail(), covidRequestDTO.getPassword(), covidRequestDTO.getCityName(), covidRequestDTO.getBloodGroup(), covidRequestDTO.getBidPrice(), covidRequestDTO.getLatitude(), covidRequestDTO.getLongitude(),covidRequestDTO.getPhonenumber());
        covidResponseDTO.setId(recovered.getId());
        covidResponseDTO.setValue(false);
        covidResponseDTO.setName(recovered.getName());
        covidResponseDTO.setBloodGroup(recovered.getBloodGroup());
        covidResponseDTO.setBidPrice(recovered.getBidPrice());
        covidResponseDTO.setPassword(recovered.getPassword());
        covidResponseDTO.setCityName(recovered.getCityName());
        covidResponseDTO.setPhonenumber(recovered.getPhonenumber());
        covidResponseDTO.setLatitude(recovered.getLatitude());
        covidResponseDTO.setLongitude(recovered.getLongitude());



        return covidResponseDTO;
    }

    @Override
    public String saveCovidUsersDetails(CovidRequestDTO covidRequestDTO) {
        CovidUsers covidUsers =new CovidUsers();
        covidUsers.setName(covidRequestDTO.getName());
        covidUsers.setPhonenumber(covidRequestDTO.getPhonenumber());
        covidUsers.setPassword(covidRequestDTO.getPassword());
        covidUsers.setId(covidUsers.getId());
        covidUsers.setLatitude(covidRequestDTO.getLatitude());
        covidUsers.setLongitude(covidRequestDTO.getLongitude());
        CovidUsers e1 = covidRepo.save(covidUsers);

   return "gotit";
    }


    @Override
    public List<CovidResponse> getRecoveredDetails() {
        List<Recovered> list = recoveredRepo.findAll();
        List<CovidResponse> list1 = new ArrayList<>();
        for (Recovered recovered : list) {
        list1.add(converter(recovered));
        }
        return list1;
    }

    @Override
    public Recovered getRecoveredUserID(Long id) {

        System.out.println();
        System.out.println("dao service");
        Optional<Recovered> byId = recoveredRepo.findById(id);

        if (byId.isPresent()) {

            return byId.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public String CovidLogin(CovidRequestDTO covidRequestDTO) {


        Optional<CovidUsers> byphone = covidRepo.findByPhonenumber(covidRequestDTO.getPhonenumber());
        System.out.println("login");

        if (byphone.isPresent()) {

            CovidUsers covid = byphone.get();

            System.out.println(covid);

            if (covid.getPassword().equals(covidRequestDTO.getPassword())) {

                return "verified";

            } else {
                return "error in password";
            }
        }

        else {
            return "error";
        }

//        List <CovidUsers> listUsers = new ArrayList<>();
//
//        for(:)
//        {
//            Optional<CovidUsers>  bydate  = covidRepo.findByUsers(String date);
//            listUsers.add(bydate);
//
//        }
//
//        for (:list)
//        {

//
//        }






    }


    @Override
    public List<CovidResponse> filterRecoveredDao(FiltersOnDistanceDTO filtersOnDistanceDTO) {
        List<CovidResponse> list = new ArrayList<>();
        List<Recovered> listofcovid = recoveredRepo.findAll();
        for(Recovered recovered : listofcovid) {
            if (filtersOnDistanceDTO.getDistance() >= Math.sqrt(
                    Math.pow(69.1 * (recovered.getLatitude() - filtersOnDistanceDTO.getLatitude()), 2) +
                            Math.pow(69.1 * (filtersOnDistanceDTO.getLongitude() - recovered.getLongitude()) * Math.cos(recovered.getLatitude() / 57.3), 2))) {
                list.add(converter(recovered));

            }

        }
//                list4.add(Math.sqrt(
//                        Math.pow(69.1 * (recovered.getLatitude() - filtersOnDistance.getLatitude()), 2) +
//                                Math.pow(69.1 * (filtersOnDistance.getLongitude() - recovered.getLongitude()) * Math.cos(recovered.getLatitude() / 57.3), 2)));
//            }

        System.out.println("rishabh");

            return list;


        }

    @Override
    public String saveRequestDetailsDao(RequestPendingDetailsDTO requestPendingDetailsDTO) {

        RecoverdRequest recoverdRequest = new RecoverdRequest();

        recoverdRequest.setName(requestPendingDetailsDTO.getName());
        recoverdRequest.setBloodgroup(requestPendingDetailsDTO.getBloodgroup());
        recoverdRequest.setPrice(requestPendingDetailsDTO.getPrice());
        recoverdRequest.setPhonenumber(requestPendingDetailsDTO.getPhonenumber());

        responseRepo.save(recoverdRequest);

//                Optional<Recovered> byphonenumber = RecoveredRepo.findbyphonenumber(requestPendingDetailsDTO.getPhonenumber());

        return "rishabh";

    }

    @Override
    public List<RequestPendingDetailsDTO> getPendingDao() {
        List <RecoverdRequest> list =  responseRepo.findAll();
        List <RequestPendingDetailsDTO> list1= new ArrayList<>();

        for(RecoverdRequest recoverdRequest: list)
        {
            RequestPendingDetailsDTO requestPendingDetailsDTO = new RequestPendingDetailsDTO(recoverdRequest.getName(),recoverdRequest.getPrice(),recoverdRequest.getBloodgroup(),recoverdRequest.getPhonenumber());
            list1.add(requestPendingDetailsDTO);
        }

//        Optional<Recovered> byemail = RecoveredRepo.findByPhonenumber(covidRequestDTO.getPhonenumber());



        return list1;
    }

    @Override
    public String RecoveredLogin(CovidRequestDTO covidRequestDTO) {



        return null;
    }

    @Override
    public List<CovidResponse> getCovidDetails() {

        List<CovidUsers> list = covidRepo.findAll();

        List <CovidResponse> list1 = new ArrayList<>();

        for(CovidUsers covidUsers : list)
        {
            CovidResponse covidResponse = new CovidResponse(covidUsers.getName(), null, null, null, null, null, covidUsers.getLatitude(), covidUsers.getLongitude(),covidUsers.getPhonenumber());

           list1.add(covidResponse);
        }

        return list1;

    }

    @Override
    public List<CovidResponse> filterCovidDao(FiltersOnDistanceDTO filtersOnDistanceDTO) {

        List<CovidResponse> list = new ArrayList<>();
        List<CovidUsers> listofcovid = covidRepo.findAll();
        for (CovidUsers covidUsers : listofcovid) {
            if (filtersOnDistanceDTO.getDistance() >= Math.sqrt(
                    Math.pow(69.1 * (covidUsers.getLatitude() - filtersOnDistanceDTO.getLatitude()), 2) +
                            Math.pow(69.1 * (filtersOnDistanceDTO.getLongitude() - covidUsers.getLongitude()) * Math.cos(covidUsers.getLatitude() / 57.3), 2))) {
                list.add(converter2(covidUsers));

            }

        }

        return list;

    }
}
