package project.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import project.dao.PhotoUserRepository;
import project.domain.PhotoUser;

@Service
public class PhotoUserService {

	@Autowired
	private PhotoUserRepository photoUserRepository;

	public PhotoUser storeFile(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		PhotoUser multipart = null;

		if (!fileName.contains("..")) {
			multipart = new PhotoUser(fileName, file.getContentType(), file.getBytes());
		}

		return photoUserRepository.save(multipart);
	}

	public PhotoUser getFile(String fileId) throws FileNotFoundException {
		return photoUserRepository.findById(fileId)
				.orElseThrow(() -> new FileNotFoundException("File not found with Id =" + fileId));
	}

	public String getDownloadUrl(PhotoUser photoUser) {
		return ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/").path(photoUser.getId())
				.toUriString();
	}

}
