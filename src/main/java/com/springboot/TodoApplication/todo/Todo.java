package com.springboot.TodoApplication.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

// Database(MySQL)
// Static List of todos => Database (H2, MySQL)

// JPA
// Bean -> Database

@Entity
public class Todo {
	
	public Todo() {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	
	private LocalDate targetDate;
	
	private boolean done;

	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", description=");
		builder.append(description);
		builder.append(", targetDate=");
		builder.append(targetDate);
		builder.append(", done=");
		builder.append(done);
		builder.append("]");
		return builder.toString();
	}

}
