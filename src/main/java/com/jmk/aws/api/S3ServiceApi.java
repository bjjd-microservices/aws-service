package com.jmk.aws.api;

import com.amazonaws.services.s3.model.PutObjectResult;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(value="/s3Service")
public interface S3ServiceApi {
	@RequestMapping(value = "/uploadfile", produces = { "application/json", "application/xml" }, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE }, method = RequestMethod.POST)
	public ResponseEntity<PutObjectResult> uploadFile(@RequestParam(value = "category", required = true) String category,@RequestParam(value = "id", required = true) String id, @RequestParam(value = "filename", required = true) String filename, @RequestPart("photo") MultipartFile photo);
}
