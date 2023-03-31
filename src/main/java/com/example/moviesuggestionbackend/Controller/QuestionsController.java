package com.example.moviesuggestionbackend.Controller;
import com.example.moviesuggestionbackend.Entity.Conclusion;
import com.example.moviesuggestionbackend.Entity.Premise;
import com.example.moviesuggestionbackend.Entity.Question;
import com.example.moviesuggestionbackend.Service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class QuestionsController {

    QuestionService questionService =new QuestionService();

    @GetMapping("/questionAnswers")
    @ResponseBody
    public Question getAllQuestions(){
       Question question = questionService.getAllQuestions();
       return question;
    }

    @PostMapping("/answer")
    @ResponseBody
    public Conclusion postAnswer(@RequestBody Premise premise){
        return questionService.getConclusion(premise);
    }
}
