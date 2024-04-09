package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.CardItem;

public interface CardItemRepository extends JpaRepository<CardItem, String> {

}
