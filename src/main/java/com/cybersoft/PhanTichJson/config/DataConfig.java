package com.cybersoft.PhanTichJson.config;

import com.cybersoft.PhanTichJson.dto.ProductDTO;
import com.cybersoft.PhanTichJson.dto.ProductDetailDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
public class DataConfig {
    @Bean
    public List<ProductDTO> danhSachCamera() {
        List<ProductDTO> danhSach = new ArrayList<>();
        danhSach.add(new ProductDTO(
                1, "imou", "Camera IP 360 Độ 3MP IMOU TA32CP-L", "https://example.com/imou-ta32cp-l.png",
                470000, 650000, 27, 4.9, "142,9k",
                List.of("Độ phân giải 3MP (1296p)", "Còi báo động", "Phát hiện chuyển động")
        ));

        danhSach.add(new ProductDTO(
                2, "tp-link", "Camera IP 360 Độ 2MP TP-Link Tapo C200C", "https://example.com/tplink-c200c.png",
                390000, 490000, 20, 5.0, "26,4k",
                List.of("Độ phân giải 2MP (1080p)", "Đàm thoại 2 chiều", "Phát hiện chuyển động")
        ));
        danhSach.add(new ProductDTO(
                3, "Tiandy", "Camera IP 360 Độ 2MP TIANDY TC-H322N", "https://example.com/tiandy-tc-h322n.png",
                350000, 390000, 10, 4.9, "33,2k",
                List.of("Độ phân giải 2MP (1080p)", "Phát hiện chuyển động", "Nhìn ban đêm có màu")
        ));
        danhSach.add(new ProductDTO(
                4, "EZVIZ", "Camera IP Ngoài Trời 2MP Ezviz H3C", "https://example.com/ezviz-h3c.png",
                750000, 890000, 15, 5.0, "597",
                List.of("Độ phân giải 2MP (1080p)", "Phát hiện chuyển động", "Nhìn ban đêm có màu")
        ));
        danhSach.add(new ProductDTO(
                5, "imou", "Camera IP 360 Độ 2MP IMOU Ranger 2C A22EP-L", "https://example.com/imou-ranger-2c.png",
                550000, 550000, 0, 4.9, "88k",
                List.of("Độ phân giải 2MP (1080p)", "Đàm thoại 2 chiều", "Phát hiện chuyển động")
        ));
        return danhSach;
    }
    @Bean
    public ProductDetailDTO chiTietTecnoPova6() {
        return new ProductDetailDTO(
                "tecno-pova-6",
                "Điện thoại TECNO Pova 6 - RAM 8+8GB - 256GB",
                5.0,
                5250000,
                5490000,
                List.of("anh_chinh.jpg", "anh_phu_1.jpg", "anh_phu_2.jpg"),
                List.of(
                        Map.of("color", "Gray", "price", 5250000),
                        Map.of("color", "Blue", "price", 5250000),
                        Map.of("color", "Green", "price", 5250000)
                ),
                List.of(
                        "Hỗ trợ chuyển đổi Esim ngay tại shop.",
                        "Ưu đãi tới 1.050.000Đ cho Khách hàng thân thiết của ONEWAY",
                        "Thu cũ đổi mới trợ giá 2.500.000Đ",
                        "Hỗ trợ Trả góp 0% qua Thẻ Tín Dụng"
                ),
                "Bảo hành 12 tháng chính hãng.",
                List.of(
                        "199 Quang Trung - P.Quang Trung - Q.Hà Đông - TP.Hà Nội",
                        "117 Xã Đàn - P.Phương Liên - Q.Đống Đa - TP.Hà Nội"
                )
        );
    }

}