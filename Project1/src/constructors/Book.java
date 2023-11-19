package constructors;

public class Book {
	private int id;
    private String title;
    private double price;
    
    public Book() {
    	super();
    }
    
    public Book(int id, String title, double price) {
    	super();
        this.id = id;
        this.title = title;
        this.price = price;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//public String toString() {
	//	return this.title;//"Hello from to string() method";
	//}
	
	
	
	    
	    public static void main(String[] args) {
	        Book b1 = new Book(1, "Bible", 1000);
	        System.out.println(b1.toString());
	        System.out.println(b1.getId() + " " + b1.getTitle() + " " + b1.getPrice());
	        System.out.println(b1);
	        Book b2 = new Book();
	        b2.setTitle("BestBook");
	        System.out.println(b2.getTitle());
	    }

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
		}
}


	

