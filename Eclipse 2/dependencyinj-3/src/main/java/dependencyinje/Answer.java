package dependencyinje;
import java.util.*;
public class Answer {
	int id;
	String name;
	Date postedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public String toString() {
		return "Id:"+id+" Name:"+name+" postedDate:"+postedDate;
	}
}
