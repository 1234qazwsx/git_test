package Third;

import java.io.Serializable;
import java.util.Date;

public abstract class PIMEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String priority;
	
	public PIMEntity() {
		priority = "normal";
	}
	
	public PIMEntity(String priority){
		this.priority = priority;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	abstract public void fromString(String x);
	
	abstract public String toString();
}

interface MyDate{
	public void setDate(Date date);
	public Date getDate();
}

class PIMTodo extends PIMEntity implements MyDate{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private String text;
	
	
	public void fromString(String x) {
		String[] fields = x.split(",");
		text = fields[0];
		setPriority(fields[1]);
	}

	
	public String toString() {
		String mDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDate();
		return "TODO " + this.getPriority() + " " + mDate + " " + text + ".";
	}

	
	public void setDate(Date date) {
		this.date = date;
	}

	
	public Date getDate() {
		return date;
	}
}

class PIMNote extends PIMEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String note;
	
	public void fromString(String x) {
		String[] fields = x.split(",");
		note = fields[0];
		setPriority(fields[1]);
	}

	
	public String toString() {
		return "NOTE " + this.getPriority() + " " + note + ".";
	}
}

class PIMAppointment extends PIMEntity implements MyDate{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Date date;
	String description;
	
	public void fromString(String x) {
		String[] fields = x.split(",");
		description = fields[0];
		setPriority(fields[1]);
	}

	
	public String toString() {
		String mDate = date.getYear() + "/" + date.getMonth() + "/" + date.getDate();
		return "APPOINTMENT " + this.getPriority() + " " + mDate + " " + description + ".";
	}

	
	public void setDate(Date date) {
		this.date = date;
	}

	
	public Date getDate() {
		return date;
	}
}

class PIMContact extends PIMEntity{
	String firstNmae;
	String lastName;
	String emailAddress;
	
	public void fromString(String x) {
		String[] fields = x.split(",");
		firstNmae = fields[0];
		lastName = fields[1];
		emailAddress = fields[2];
		setPriority(fields[3]);
	}

	
	public String toString() {
		return "CONTACT " + this.getPriority() + " " + firstNmae + " " + lastName + " "
				+ emailAddress + ".";
	}
	
}