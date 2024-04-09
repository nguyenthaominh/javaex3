package com.nguyenthaominh.exercise03.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(36)")
    private String categoryId;


    @ManyToOne
    @JoinColumn(name = "parent_id",referencedColumnName = "id")
    private Category parentId;

    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;

    @Column(name = "category_description", columnDefinition = "TEXT")
    private String categoryDescription;

    @Column(name = "icon", columnDefinition = "TEXT")
    private String icon;

    @Column(name = "image", columnDefinition = "TEXT")
    private String image;

    @Column(name = "placeholder", columnDefinition = "TEXT")
    private String placeholder;

    @Column(name = "active", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean active;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime updatedAt;

    @JsonBackReference("categoryCreate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private StaffAccount createdBy;

    @JsonBackReference("categoryUpdate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by", nullable = false)
    private StaffAccount updatedBy;

    @JsonManagedReference("ProductCategory_Category")
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<ProductCategory> productCategories;
}