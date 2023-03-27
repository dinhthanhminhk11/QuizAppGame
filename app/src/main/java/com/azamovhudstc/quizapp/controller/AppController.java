package com.azamovhudstc.quizapp.controller;

import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.model.QuestionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppController {
    private List<QuestionModel> questionModelList;
    private int level = 0;

    public AppController() {
        this.questionModelList = new ArrayList<>();
    }

    public void loadQuestion() {
        questionModelList.add(new QuestionModel(R.drawable.egypt, "egypt", "eqakyftpmigd"));               //1
        questionModelList.add(new QuestionModel(R.drawable.china, "china", "anhqftackyqi"));      //2
        questionModelList.add(new QuestionModel(R.drawable.england, "england", "fdqaenglandd"));   //3
        questionModelList.add(new QuestionModel(R.drawable.germany, "germany", "ergermanyfmq"));//4
        questionModelList.add(new QuestionModel(R.drawable.france, "france", "kffranceher"));//5
        questionModelList.add(new QuestionModel(R.drawable.israil, "israil", "oaisrailsiei"));//6
        questionModelList.add(new QuestionModel(R.drawable.italy, "italy", "posapyiytola"));//7
        questionModelList.add(new QuestionModel(R.drawable.spain, "spain", "nidyspainagp"));//8
        questionModelList.add(new QuestionModel(R.drawable.turkey, "turkey", "turkeyybusot"));//9
        questionModelList.add(new QuestionModel(R.drawable.korea, "korea", "bekoreadkoky"));//10
        questionModelList.add(new QuestionModel(R.drawable.brazil, "brazil", "bebrazilkily"));//11
        questionModelList.add(new QuestionModel(R.drawable.qozoq, "qozoq", "qozoqazdkqoy"));//12
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(questionModelList);
    }

    public int getQuestionCount() {
        return questionModelList.size();
    }

    public QuestionModel getQuestion(int level) {//leveldagi indexni bizga qaytaradi !
        return questionModelList.get(level);
    }
}
