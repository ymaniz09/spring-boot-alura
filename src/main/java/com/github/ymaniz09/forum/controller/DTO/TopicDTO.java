package com.github.ymaniz09.forum.controller.DTO;

import com.github.ymaniz09.forum.model.Topic;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicDTO {

    private long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;

    public TopicDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreatedDate();
    }

    public static List<TopicDTO> topicToTopicDto(List<Topic> topicList) {
        return topicList.stream().map(TopicDTO::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
