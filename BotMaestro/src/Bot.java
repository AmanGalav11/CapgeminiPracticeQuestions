import java.time.LocalDate;

public class Bot {
	private String botName;
	private String creator;
	private String purpose;
	private LocalDate releasedDate;
	private String activeStatus;
	private int numberOfUsers;

	public Bot() {
		super();
	}

	public Bot(String botName, String creator, String purpose, LocalDate releasedDate, String activeStatus,
			int numberOfUsers) {
		super();
		this.botName = botName;
		this.creator = creator;
		this.purpose = purpose;
		this.releasedDate = releasedDate;
		this.activeStatus = activeStatus;
		this.numberOfUsers = numberOfUsers;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDate getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}
}
