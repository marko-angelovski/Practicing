import java.io.*;

public class ChildClass extends ParentClass implements Serializable {
    private String Brand;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "Brand='" + Brand + '\'' +
                '}'+"ParentClass{" +
                "Product='" + getProduct() + '\'' +
                ", ProductId=" + getProductId() +
                '}';
    }
    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        setProductId(ois.readInt());
        setProduct((String) ois.readObject());

    }
    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(getProductId());
        oos.writeObject(getProduct());


    }

}
