package com.example.workflow.dto;

import java.util.Collections;
import java.util.List;

public class TaskGroup {
	public List<String> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<String> taskList) {
		this.taskList = taskList;
	}

	List<String> taskList;

	public TaskGroup(List<String> taskList) {
		this.taskList = taskList;
	};

	public TaskGroup() {
		taskList = Collections.emptyList();
	};


}
