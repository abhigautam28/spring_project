package com.topics.service;

import com.topics.allTopics.Topics;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    public List<Topics> allTopic = Arrays.asList(
            new Topics("java", "spring boot", "spring boot description"),
            new Topics("C++", "STL", "STL Library"),
            new Topics("java", "Spring mvc", "web layer depends on mvc"));
    public List<Topics> getAllTopic() {
        return allTopic;
    }

    public Topics getTopicById(String id) {
        return allTopic.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}
