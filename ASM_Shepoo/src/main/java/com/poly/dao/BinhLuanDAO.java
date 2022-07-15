package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.model.BinhLuan;

public interface BinhLuanDAO extends JpaRepository<BinhLuan, Integer>{

	@Query("SELECT p FROM BinhLuan p WHERE p.nguoiDung.maND=?1")
	List<BinhLuan> findAllByCustomer(Integer maND);
	
	@Query("SELECT p FROM BinhLuan p WHERE p.sanPham.maSP=?1")
	List<BinhLuan> findAllByProduct(Integer maSP);
	
	@Query("SELECT p FROM BinhLuan p WHERE p.nguoiDung.maND=?1 AND p.sanPham.maSP=?2")
	List<BinhLuan> findAllByProductAndNguoiDung(Integer maSP, Integer maND);
	
	@Query("DELETE BinhLuan p WHERE p.maBL=?1")
	Void DeleteByID(Integer maBL);

	@Query("SELECT count(p) FROM BinhLuan p WHERE p.sanPham.maSP=?1")
	Integer countBinhLuanByMaSP(Integer maSP);
}
