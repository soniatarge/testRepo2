package com.bee.SpringFramework.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics =  new ArrayList<>(Arrays.asList(new Topic(1, "Spring", "Spring Framework"), new Topic(2, "java", "java framework"),
			new Topic(3, "javascript", "javascript framework")));
	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		for (Topic topic : topics) {
			if(topic.getName().equals(id)) {
				return topic;
			}
		}
		return null;
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		for (int i =0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getName().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		for (int i =0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getName().equals(id)) {
				topics.remove(i);
			}
		}
		
	}

}
