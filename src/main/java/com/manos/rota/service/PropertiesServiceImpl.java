package com.manos.rota.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by manoskammas on 19/09/2018.
 */
@Service
public class PropertiesServiceImpl {

    @Value("#{'${bank.holidays.of.the.year}'.split(',')}")
    private List<String> bankHolidaysList;


    public List<Date> getBankHolidaysList(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


        List<Date> holidays= new ArrayList();

//        for(String s:bankHolidaysList) {
//            holidays.add(sdf.parse(s));
//        }

        bankHolidaysList.forEach(s -> {
            try {
                holidays.add(sdf.parse(s));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });

        holidays.forEach(System.out::println);

        return holidays;
    }




}
