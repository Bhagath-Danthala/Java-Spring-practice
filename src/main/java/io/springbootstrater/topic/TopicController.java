package io.springbootstrater.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private  TopicService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@pathvariable String.id) {
		return topicservice.getTopic(id);

	}
	
	@RequestMapping(method=Requestmethod.POST, value="/topics")
	public void addTopic(@RequestBdy Topic topic) {
		topicService.addTopic(topic);
		
		
	}

	@RequestMapping(method=Requestmethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.UpdateTopic(topic);
	
	}

	@RequestMapping(method=Requestmethod.DELETE, value="/topics/"{id}")
	public void deleteTopic( @PathVariable String id) {
		topicService.deleteTopic(topic);
	}
}
