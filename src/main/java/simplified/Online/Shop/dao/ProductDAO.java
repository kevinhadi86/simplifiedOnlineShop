package simplified.Online.Shop.dao;


import simplified.Online.Shop.dto.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllMyProduct(int id);
    List<Product> getAllOthersProduct(int id);
    Product getOneProduct(int id);
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);

}
