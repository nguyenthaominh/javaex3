package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.SlideShow;

public interface SlideShowRepository extends JpaRepository<SlideShow, String> {

}