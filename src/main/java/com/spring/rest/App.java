package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.HeroesDota;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        //get all HeroesDota
        List<HeroesDota> allHeroesDota = communication.getAllHeroesDota();
        System.out.println(allHeroesDota);
//
//                ---------------------------------------------------

        //get HeroesDota by id
//        HeroesDota heroesDotaId = communication.getHeroesDota(9);
//        System.out.println(heroesDotaId);
//
//        ---------------------------------------------------

        //add heroes Dota
//        HeroesDota heroesDota = new HeroesDota("NameTest", "RaceTest", "AttribyteTest", 9999);
//        heroesDota.setId(43);
//        communication.saveHeroesDota(heroesDota);
//        System.out.println("done!");
//
//                ---------------------------------------------------

        //delete HeroesDota by id
//        communication.deleteHeroesDota(43);

    }
}
