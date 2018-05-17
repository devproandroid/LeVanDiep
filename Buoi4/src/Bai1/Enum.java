package Bai1;

public class Enum {
	//cơ bản
	public enum dayOfWeek{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturdat,Sunday;
	}
	//biến instance
	public enum Website{
		Google("google.com"),Facebook("facebook.com"),Youtube("youtube.com");
		private String url;
		Website(String url){
			this.url=url;
		}
		public String getUrl() {
			return url;
		}
	}
	public enum Operation{
		plu,nul,div,sub;
		double calculate(double x,double y) {
			switch(this) {
			case plu:
				return x+y;
			case sub:
				return x-y;
			case nul:
				return x/y;
			case div:
				return x*y;
			default:
			throw new AssertionError("phep tinh khong ton tai");
			}
		}
	}
	public enum season{
		Xuan("Xuan","Spring"),Ha("Ha","Summer");
		private String vietnamese;
		private String english;
		season(String vietnamese,String english){
			this.vietnamese=vietnamese;
			this.english=english;
		}
	}
	public static void main(String[] args) {
		System.out.println(dayOfWeek.Monday);
		System.out.println(Website.Google.url);
		for(Website url:Website.values()) {
			System.out.println(url);
		}
		double result=Operation.div.calculate(3, 2);
		System.out.println("Ket qua : "+result);
	}

}
