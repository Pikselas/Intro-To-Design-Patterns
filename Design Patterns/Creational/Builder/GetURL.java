public class GetURL {
	public static void main(String[] args) {
		URLBuilder urlBuilder1 = new URLBuilder.Builder().schema("https").hostname("rajdip.vercel.app").build();
		System.out.println(urlBuilder1.buildUrl());

		URLBuilder urlBuilder2 = new URLBuilder.Builder().schema("https").hostname("api.github.com").pathParam("users/xyz").build();
		System.out.println(urlBuilder2.buildUrl());

		URLBuilder urlBuilder3 = new URLBuilder.Builder().schema("https").hostname("xyz.com").pathParam("students").queryParam("name", "rajdip").build();
		System.out.println(urlBuilder3.buildUrl());
	}
}
