package com.github.ymaniz09.forum.repository;

import com.github.ymaniz09.forum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
