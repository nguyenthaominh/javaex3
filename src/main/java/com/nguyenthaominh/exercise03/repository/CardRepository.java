package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Card;

public interface CardRepository extends JpaRepository<Card, String> {

}
