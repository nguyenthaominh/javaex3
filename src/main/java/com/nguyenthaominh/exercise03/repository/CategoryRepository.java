
package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
