package com.jmk.aws.api;

import com.amazonaws.services.s3.model.PutObjectResult;
import com.jmk.aws.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class S3ServiceApiController implements S3ServiceApi {

	@Autowired
	private S3Service s3Service;

	@Override
	public ResponseEntity<PutObjectResult> uploadFile(String category, String id, String filename, MultipartFile photo) {
		PutObjectResult result= s3Service.uploadFile(category,id,filename,photo);
		return new ResponseEntity<PutObjectResult>(result,HttpStatus.OK);
	}
}
