package lab.web.vo;

public class ProductVO {
	private String pid;  //상품ID
	  private String pname; //상품이름
	  private int price; //가격
	  private int qty;  //수량
	  private String pimg;//상품이미지
	  public ProductVO() {
			super();
		} 

		public String getPimg() {
			return pimg;
		}

		public void setPimg(String pimg) {
			this.pimg = pimg;
		}

		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		 
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		@Override
		public String toString() {
			return "ProductVO [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
		}


}
