package shopping.model;

import java.util.ArrayList;
import java.util.Vector;

public class ShoppingCart {

	private static double total = 0;// 购物车总价
	ArrayList<Product> prolist = new ArrayList<Product>();

	public ArrayList<Product> getProlist() {
		return prolist;
	}

	public void setProlist(ArrayList<Product> prolist) {
		this.prolist = prolist;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		ShoppingCart.total = total;
	}

	public int addProduct(Product pro) {// 添加商品
		int i = 0;
		for (Product e : prolist) {
			if (e.getId().equals(pro.getId())) {
				int n = e.getNum() + pro.getNum();
				e.setNum(n);
				return i;
			}
			i++;
		}
		prolist.add(pro);
		total = pro.getPrice() *pro.getNum() + total;
		return -1;
	}
}
