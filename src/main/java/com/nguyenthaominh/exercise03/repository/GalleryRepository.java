package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, String> {

}