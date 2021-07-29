package Day4.GameStroeProject.Entities;

import java.time.LocalDate;

public class Campaign {

	private int id;
	private String campaignName;
	private LocalDate startDate;
	private LocalDate endDate;
	public Campaign(int id, String campaignName, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
