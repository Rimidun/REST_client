package com.spring.rest;

import com.spring.rest.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    public RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/rest/dota/heroes/";

    public List<HeroesDota> getAllHeroesDota() {
        ResponseEntity<List<HeroesDota>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<HeroesDota>>() {
                });
        List<HeroesDota> allHeroesDota = responseEntity.getBody();
        return allHeroesDota;
    }

    public HeroesDota getHeroesDota(int id) {
        HeroesDota heroesDota = restTemplate.getForObject(URL + "/" + id, HeroesDota.class);

        return heroesDota;
    }

    public void saveHeroesDota(HeroesDota heroesDota) {
        int id = heroesDota.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, heroesDota, String.class);
            System.out.println("New heroes Dota was added to Database");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, heroesDota);
            System.out.println("Heroes Dota with ID " + id + " was updated");
        }

    }

    public void deleteHeroesDota(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Heroes Dota with ID: " + id + " was deleted from Database");

    }
}
