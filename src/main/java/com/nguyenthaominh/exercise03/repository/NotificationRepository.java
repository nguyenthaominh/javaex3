package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, String> {

}