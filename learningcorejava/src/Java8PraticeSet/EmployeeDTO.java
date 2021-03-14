package Java8PraticeSet;

public class EmployeeDTO {
	
	private int userId;
	private String userName;
	private String countryName;
	private int orgId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [userId=" + userId + ", userName=" + userName + ", countryName=" + countryName + ", orgId="
				+ orgId + "]";
	}
	
}
