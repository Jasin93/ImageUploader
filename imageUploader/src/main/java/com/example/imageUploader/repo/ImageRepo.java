package com.example.imageUploader.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.imageUploader.model.Image;
import com.example.imageUploader.model.AppUser;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {

}
