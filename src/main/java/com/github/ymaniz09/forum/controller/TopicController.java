package com.github.ymaniz09.forum.controller;

import com.github.ymaniz09.forum.controller.DTO.TopicDTO;
import com.github.ymaniz09.forum.controller.form.TopicForm;
import com.github.ymaniz09.forum.model.Topic;
import com.github.ymaniz09.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/topics")
@RestController
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public List<TopicDTO> list(String courseName) {

        if (courseName == null) {
            List<Topic> topicList = topicRepository.findAll();
            return TopicDTO.topicToTopicDto(topicList);
        } else {
            List<Topic> topicList = topicRepository.findByCourse_Name(courseName);
            return TopicDTO.topicToTopicDto(topicList);
        }
    }

    @PostMapping
    public void add(TopicForm topic) {


    }
}
