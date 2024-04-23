class Book {
	private String title;
	private int page;
	private String author;
	
	public Book(String ti, int pa, String au) {
		title = ti;
		page = pa;
		author = au;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setNumberOfPage(int number) {
		page = number;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String ti) {
		title = ti;
	}
	
	public void setNumPage(int nu) {
		page = nu;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public void printTitle() {
		System.out.println(title);
	}
	
	public void printNumPage() {
		System.out.println(page);
	}
	
	public void printAuthor() {
		System.out.println(author);
	}
	
	public void printAll() {
		System.out.println(title);
		System.out.println(page);
		System.out.println(author);
	}
}
public class TestBook {

	public static void main(String[] args) {
		Book bo1 = new Book("Java Book", 200, "Yazeed");
		bo1.printAll();
		Book bo2 = new Book("Programming Book", 100, "Yazeed");
		bo2.printAll();
		
	}

}
