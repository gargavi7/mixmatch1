package com.teamtaskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    public Long id;
    
    @Column(name = "TASKUSER_ID")
    public Long userId;
    
    
    public String task;
    
    public String due;
    
    public boolean isCompleted;

    public Task() {}
    
	public Task(Long userId, String task, String due, boolean isCompleted) {
		super();
		this.userId = userId;
		this.task = task;
		this.due = due;
		this.isCompleted = isCompleted;
	}

	    
}