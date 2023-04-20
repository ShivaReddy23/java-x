
public class St100 {
	public static void main(String[] args) {
		String str="Java is the foundation for virtually every type of networked application and"
		+ " is the global standard for developing and delivering embedded "
		+ "and mobile applications, games, Web-based content, and enterprise "
		+ "software. With more than 9 million developers worldwide, "
		+ "Java enables you to efficiently develop, deploy and use exciting "
		+ "applications and services.";
		System.out.println("Original string: "+str);
		System.out.println("Is 'million' present in the said text? "+str.contains("million"));
		System.out.println("Is 'millions' present in the said text? "+str.contains("millions"));
		}
}
