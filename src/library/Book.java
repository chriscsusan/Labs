package library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {
	private Status status;
	private String author = "";
	private String title = "";
	private Date dueDate;

	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}

	public void setStatusToCheckedOut(Date dueDate) {
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		status = Status.CHECKED_OUT;
		this.dueDate = dueDate;
	}
	
	public Date getDueDate(){
		return this.dueDate;
	}

	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setStatusToOnShelf() {
		status = Status.ON_SHELF;
	}

	public void setStatusToOnOrder() {
		status = Status.ON_ORDER;
	}

	public void setStatusToReturned() {
		status = Status.RETURNED;
	}

	public Status getStatus() {
		return status;
	}

}
