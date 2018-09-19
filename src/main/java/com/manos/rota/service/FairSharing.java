package com.manos.rota.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manoskammas on 12/09/2018.
 */
public class FairSharing {

    Map<Integer,String> user = new HashMap<>();

    Map<String,Integer> rates = new HashMap<>();

private void inti(){
    rates.put("1.1.2018",150);
    rates.put("1.2.2018",100);
    rates.put("1.3.2018",50);
    rates.put("1.4.2018",50);
    rates.put("1.5.2018",50);
    rates.put("1.6.2018",50);
    rates.put("1.7.2018",50);
    rates.put("1.8.2018",50);
    rates.put("1.9.2018",50);
    rates.put("1.10.2018",50);
    rates.put("1.11.2018",50);

}


//    public void sharing(){
//        inti();//assumed that iteration is sorted with the value one to be the highest
//
//        /*
//        o ksekinaw me ta megala posa... rwtaw tin methodo na mou girisei user
//         */
//        iterate in rate list... rateInscope
//
//
//                getUser(rateInscore.date);
//        //user.assignDate
//        //rate.date assign user
//
//        //
//
//
//    }
//
//    private Integer getUser(String date){
//        List<Users> available users = //user that is available on that date and has the lower wallet, it might return more that one users, so I have to choose randomly...
//
//        return user;
//
//
//    }


}
