package Day5.ArrayListPractice.BeanClass;

public class States {
	
	int cityCode;
	String city;
	
	public States(int cityCode, String city) {

		this.cityCode = cityCode;
		this.city = city;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
