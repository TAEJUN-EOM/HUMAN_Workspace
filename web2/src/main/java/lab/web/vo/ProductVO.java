package lab.web.vo;

public class ProductVO {
	private String pid;  //��ǰID
	  private String pname; //��ǰ�̸�
	  private int price; //����
	  private int qty;  //����
	  private String pimg;//��ǰ�̹���
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
