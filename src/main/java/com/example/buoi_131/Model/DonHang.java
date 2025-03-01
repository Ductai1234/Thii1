package com.example.buoi_131.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    @ManyToOne
    @JoinColumn(name = "id_san_pham" , referencedColumnName = "id" )
    private SanPham sanPham;
    @Column(name = "so_luong_dat")
    private Integer soLuongDat;
    @Column(name = "trang_thai")
    private  Boolean trangThai;
}
