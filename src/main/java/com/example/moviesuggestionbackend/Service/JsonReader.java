package com.example.moviesuggestionbackend.Service;

import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonConclusion;
import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonConclusionPremises;
import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonDb;
import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonPremises;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
@Getter
public class JsonReader{

    public HashMap<JsonPremises, JsonConclusion> ReadFile(){
        HashMap<JsonPremises, JsonConclusion> hashMap =new HashMap<>();
        File file = new File("src/main/resources/bd.json");
        ObjectMapper objectMapper = new ObjectMapper();
        JsonDb db = null;
        try {
            db = objectMapper.readValue(file, JsonDb.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonConclusionPremises[] jsonConclusionPremises = db.getDb();

        for(JsonConclusionPremises conclusionPremise :jsonConclusionPremises){
            hashMap.put(conclusionPremise.getPremises(),conclusionPremise.getConclusion());
        }
        return hashMap;
    }
}
