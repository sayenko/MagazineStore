package ua.com.magazine_store.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.com.magazine_store.dao.ProductDao;
import ua.com.magazine_store.dao.impl.ProductDaoImpl;
import ua.com.magazine_store.domain.Product;
import ua.com.magazine_store.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl() {
		try {
			this.productDao = new ProductDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product create(Product t) {
		return productDao.create(t);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		return productDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}
}