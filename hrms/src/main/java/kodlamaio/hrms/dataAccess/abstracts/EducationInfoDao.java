package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EducationInfo;

public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer>{

}
