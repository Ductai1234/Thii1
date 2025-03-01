package com.example.buoi_131.Service;

import com.example.buoi_131.Model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangReposotory extends JpaRepository<DonHang, Integer> {
}
