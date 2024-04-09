package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Gallery;

public interface GalleryService {
    Gallery createGallery(Gallery gallery);
    Gallery getGalleryById(String galleryId);
    List<Gallery> getAllGalleries();
    Gallery updateGallery(Gallery gallery);
    void deleteGallery(String galleryId);
}