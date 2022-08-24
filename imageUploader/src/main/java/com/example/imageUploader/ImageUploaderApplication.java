package com.example.imageUploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.imageUploader.gui.UploadGui")
public class ImageUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageUploaderApplication.class, args);
	}

}



