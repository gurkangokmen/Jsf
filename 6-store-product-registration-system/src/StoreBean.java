import java.util.ArrayList;
import java.util.List;

public class StoreBean {
	private Product product = new Product();
	private List<Product> listProduct = new ArrayList<Product>();
	
	public void saveProduct() {
		listProduct.add(product);
		product = new Product();
	}
	
	
	public void updateProduct() {
		product = new Product();
	}
	
	public void deleteProduct() {
		listProduct.remove(product);
		product = new Product();
	}
	
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
