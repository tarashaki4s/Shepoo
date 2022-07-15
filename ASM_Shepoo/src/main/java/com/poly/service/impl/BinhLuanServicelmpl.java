package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.dao.BinhLuanDAO;
import com.poly.model.BinhLuan;
import com.poly.service.BinhLuanService;
@Service
public class BinhLuanServicelmpl implements BinhLuanService{
	@Autowired
	BinhLuanDAO dao;

	@Override
	public List<BinhLuan> findAll() {
		return dao.findAll();
	}

	@Override
	public List<BinhLuan> findAllByCustomer(Integer maND) {
		return dao.findAllByCustomer(maND);
	}

	@Override
	public BinhLuan findById(Integer maBL) {
		return dao.findById(maBL).get();
	}

	@Override
	public BinhLuan create(BinhLuan entity) {
		return dao.save(entity);
	}

	@Override
	public BinhLuan update(BinhLuan entity) {
		return dao.save(entity);
	}

	@Override
	public void deleteById(Integer maBL) {
		dao.deleteById(maBL);
	}

	@Override
	public List<BinhLuan> findAllByMaSP(Integer maSP) {
		return dao.findAllByProduct(maSP);
	}

	@Override
	public Integer countBinhLuanByMaSP(Integer maSP) {
		return dao.countBinhLuanByMaSP(maSP);
	}

}
