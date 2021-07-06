package kodlamaio.hrms.core.utilities.photo;

import java.io.File;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryManager implements CloudinaryService{
	Cloudinary cloudinary;

    public CloudinaryManager() {
        this.cloudinary = new com.cloudinary.Cloudinary(ObjectUtils.asMap(
                "cloud_name","caner-b-rek-i",
                "api_key","712926657381268",
                "api_secret","vP9UxTqnxa0AakpNs1UDp-SLVEM"
        ));
    }
	@Override
	public String upload(File file) {
		 try {
	            Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	            return  (uploadResult.get("url").toString());
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	}
}
