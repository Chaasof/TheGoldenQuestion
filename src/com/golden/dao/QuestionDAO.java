package com.golden.dao;
import java.util.List;

import com.golden.entities.Question;
public interface QuestionDAO {
    List<Question> findAll();
}
