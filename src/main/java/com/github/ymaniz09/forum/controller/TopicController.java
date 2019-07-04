package com.github.ymaniz09.forum.controller;

import com.github.ymaniz09.forum.controller.DTO.TopicDTO;
import com.github.ymaniz09.forum.model.Course;
import com.github.ymaniz09.forum.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<TopicDTO> list() {
        Topic topic = new Topic("Help", "Spring help!", new Course("Spring", "Programming"));
        topic.setId(1526L);

        return TopicDTO.topicToTopicDto(Arrays.asList(topic, topic, topic));
    }
}
