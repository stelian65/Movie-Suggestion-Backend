package com.example.moviesuggestionbackend.Service;
import com.example.moviesuggestionbackend.Entity.*;
import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonConclusion;
import com.example.moviesuggestionbackend.Entity.JsonEntity.JsonPremises;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class QuestionService {
    JsonReader jsonReader =new JsonReader();
    public  Question getAllQuestions(){
        Question question = new Question();
        question.setAll();
        return question;
    }

    public Conclusion getConclusion(Premise premise){
        JsonPremises jsonPremises = new JsonPremises();
        jsonPremises.setActor(premise.getActor());
        jsonPremises.setOrigin(premise.getCountry());
        jsonPremises.setDuration(premise.getTime());
        jsonPremises.setGenre(premise.getGenre());
        return getConclusion(jsonPremises);
    }

    public Conclusion getConclusion(JsonPremises premises){

        HashMap<JsonPremises, JsonConclusion> hashMap = jsonReader.ReadFile();
        JsonConclusion jsonConclusion = hashMap.get(premises);
        Conclusion conclusion = new Conclusion();
        conclusion.setTitle(jsonConclusion.getResult());
        conclusion.setImdbUrl(jsonConclusion.getLink());
        return conclusion;
    }



}
