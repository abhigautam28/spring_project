package com.topics.controller;

import com.topics.allTopics.Topics;
import com.topics.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/** this controller will let you know , we are handling Http mapping in this class
 *
 */
@RestController
public class getTopics {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> geAllTopics() {
        return topicService.getAllTopic();

    }
    @RequestMapping("/topics/{id}")
    public Topics getTopicById(@PathVariable String id) {
        return topicService.getTopicById(id);
    }
}
