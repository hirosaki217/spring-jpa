package springjpa.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springjpa.springjpa.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{

}
