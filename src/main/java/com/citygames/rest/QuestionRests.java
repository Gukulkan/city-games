package com.citygames.rest;

import com.citygames.entity.Question;
import com.citygames.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionRests {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/getQuestionsForCurrentGame/{id}")
    public List<Question> getQuestionsForCurrentGame(@PathVariable Long id) {
        return questionService.getQuestionsForCurrentGame(id);
    }

}
