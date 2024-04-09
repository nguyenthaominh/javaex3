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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "galleries")
public class Gallery {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(36)")
    private String galleryId;

    @JsonBackReference("Gallery_Product")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "image_path", columnDefinition = "TEXT", nullable = false)
    private String imagePath;

    @Column(name = "is_thumbnail", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isThumbnail;

    @Column(name = "placeholder", columnDefinition = "TEXT", nullable = false)
    private String placeholder;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime updatedAt;

    @JsonBackReference("galleryCreate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private StaffAccount createdBy;

    @JsonBackReference("galleryUpdate_StaffAccount")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by", nullable = false)
    private StaffAccount updatedBy;

    @JsonManagedReference("VariantOption_Gallery")
    @OneToMany(mappedBy = "gallery", cascade = CascadeType.ALL)
    private List<VariantOption> variantOptions;
}