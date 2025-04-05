package feb21;

public class code5 {
	int prod_id;
	String prodName;
	int price;
	int discount;
	int quantity;
	
	code5(int prod_id,String prodName,int price,int discount,int quantity){
		this.prod_id = prod_id;
		this.prodName = prodName;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}
	
	public String toString() {
		return prod_id+" "+prodName+" "+price+" "+discount+" "+quantity;
	}

	public static void main(String[] args) {
		code5 p1 = new code5(1,"smartphone",10000,100,10);
		code5 p2 = new code5(2,"laptop",20000,300,1);
		code5 p3 = new code5(3,"bottle",1000,50,5);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
