package com.github.ymaniz09.forum.repository;

import com.github.ymaniz09.forum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findByCourse_Name(String courseName);

}
