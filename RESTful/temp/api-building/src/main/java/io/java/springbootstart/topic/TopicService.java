package io.java.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	//this is now a service 
	//creates an immutable list of topics
	//create a new ArrayList to change that and make it mutable
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			//these onjects will be converted to JSON automatically 
			new Topic("spring" , "framework" , "framework description"),
			new Topic("java", "JEE" , "core description"),
			new Topic("typescript","typescript"," typescript description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		//uses lambda to return topic id
		//compare id to id that is passed in and get the first one
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		//loop through the list of topics
		for(int i =0; i < topics.size(); i++) {
			//topic at index
			Topic t = topics.get(i);
			//compare id of topic to id passed in 
			if(t.getId().equals(id)) {
				//if it matches set topic at index
				topics.set(i , topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}



}