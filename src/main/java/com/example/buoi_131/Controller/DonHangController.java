package com.example.buoi_131.Controller;

import com.example.buoi_131.Model.DonHang;
import com.example.buoi_131.Service.DonHangReposotory;
import com.example.buoi_131.Service.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/don-hang")
public class DonHangController {
    @Autowired
    DonHangReposotory donHangReposotory;

    @Autowired
    SanPhamRepository sanPhamRepository;

    @GetMapping("/hien-thi")
    public String hienThi( Model model) {
        model.addAttribute("listDonHang",donHangReposotory.findAll());
        model.addAttribute("listSanPham",sanPhamRepository.findAll());
        return "/don-hang/hien-thi";

    }
    @PostMapping("/add")
    public String addDonHang( DonHang donHang) {
        donHangReposotory.save(donHang);
        return "redirect:/don-hang/hien-thi";
    }
    @GetMapping("/delete/{id}")
    public String deleteDonHang(@PathVariable ("id") Integer id) {
        donHangReposotory.deleteById(id);
        return "redirect:/don-hang/hien-thi";
    }
    @GetMapping("/detail/{id}")
    public String detailDonHang(@PathVariable ("id") Integer id, Model model) {
        DonHang donHang = donHangReposotory.findById(id).get();
        model.addAttribute("donHang",donHang);
        model.addAttribute("listSanPham",sanPhamRepository.findAll());
        return "/don-hang/detail";
    }
    @PostMapping("/update/{id}")
    public String update( @PathVariable ("id") Integer id ,DonHang donHang) {
        donHangReposotory.save(donHang);
        return "redirect:/don-hang/hien-thi";
    }



}