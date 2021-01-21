package ua.com.magazine_store.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.com.magazine_store.dao.BucketDao;
import ua.com.magazine_store.dao.impl.BuckedDaoImpl;
import ua.com.magazine_store.domain.Bucket;
import ua.com.magazine_store.service.BucketService;

public class BucketServiceImpl implements BucketService {

	private BucketDao bucketDao;

	public BucketServiceImpl() {
		try {
			this.bucketDao = new BuckedDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);
	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}

}
