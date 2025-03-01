package com.example.buoi_131.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="ten_san_pham" )
    private String tenSanPham;

    @Column(name = "so_luong")
    private Integer soLuong;
}
