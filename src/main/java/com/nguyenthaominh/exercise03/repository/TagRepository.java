package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}