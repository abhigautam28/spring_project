package com.topics.controller;

import com.topics.allTopics.Topics;
import com.topics.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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

    /**
     * for post method, to add new topics.
     */

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topics topic) {
        topicService.addNewTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topics, String id) {
        topicService.updateTopic(topics, id);
    }

    @RequestMapping("/topics/downloads")
    public ResponseEntity<InputStreamResource> getDownloads() throws IOException {
        ByteArrayInputStream inputStream = topicService.downloadTopics();
          String fileName = "topics.xlsx";
        InputStreamResource resource = new InputStreamResource(inputStream);

        ResponseEntity<InputStreamResource> responseEntity = ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename="+fileName)
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(resource);

        return responseEntity;
    }
}
