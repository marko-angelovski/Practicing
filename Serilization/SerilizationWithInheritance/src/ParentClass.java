public class ParentClass {
    private String Product;
    private int ProductId;

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "Product='" + Product + '\'' +
                ", ProductId=" + ProductId +
                '}';
    }
}
