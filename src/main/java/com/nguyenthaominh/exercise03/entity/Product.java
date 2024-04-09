package com.nguyenthaominh.exercise03.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(36)")
    private String productId;

    @Column(name = "slug", nullable = false, unique = true, columnDefinition = "TEXT")
    private String slug;

    @Column(name = "product_name", nullable = false, length = 255)
    private String productName;

    @Column(name = "sku", length = 255)
    private String sku;

    @Column(name = "sale_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal salePrice;

    @Column(name = "compare_price", precision = 10, scale = 2)
    @Check(constraints = "compare_price > sale_price OR compare_price = 0")
    private BigDecimal comparePrice;

    @Column(name = "buying_price", precision = 10, scale = 2)
    private BigDecimal buyingPrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "short_description", nullable = false, length = 165)
    private String shortDescription;

    @Column(name = "product_description", nullable = false, columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "product_type", length = 64)
    private String productType;

    @Column(name = "published", nullable = false)
    private boolean published;

    @Column(name = "disable_out_of_stock", nullable = false)
    private boolean disableOutOfStock;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime updatedAt;

    @JsonBackReference("ProductCreate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private StaffAccount createdBy;

    @JsonBackReference("ProductUpdate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by", nullable = false)
    private StaffAccount updatedBy;

    @JsonManagedReference("CardItem_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<CardItem> cardItems;

    @JsonManagedReference("Gallery_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Gallery> galleries;

    @JsonManagedReference("OrderItem_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @JsonManagedReference("ProductSupply_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductSupply> productSupplies;

    

    @JsonManagedReference("ProductAttribute_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductAttribute> productAttributes;

    @JsonManagedReference("ProductCategory_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductCategory> productCategories;

    @JsonManagedReference("ProductCoupon_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductCoupon> productCoupons;

    @JsonManagedReference("ShippingInfo_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductShippingInfo> productShippingInfos;


    @JsonManagedReference("ProductTag_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductTag> productTags;

    @JsonManagedReference("Sell_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Sell> sells;

    @JsonManagedReference("Variant_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Variant> variants;

    @JsonManagedReference("VariantOption_Product")
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<VariantOption> variantOptions;
}