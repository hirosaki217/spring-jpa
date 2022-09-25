package springjpa.springjpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import springjpa.springjpa.entity.ChuyenBay;

@Repository
@Transactional
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
//	4
	List<ChuyenBay> findAllByGaDen(String gaDen);
	@Query(nativeQuery = true, value = "select * from chuyenbay where do_dai < ?1 and do_dai > ?2")
	List<ChuyenBay> findByCondition(int cond1, int cond2);
//	5
	@Query(nativeQuery = true, value = "select * from chuyenbay where ga_di = ?1 and ga_den = ?2")
	List<ChuyenBay> findCBByFromTo(String from, String to);
//	6
	@Query(nativeQuery = true, value = "select * from chuyenbay where ga_di = ?1 ")
	List<ChuyenBay> findCBByFrom(String from);
	
// 	14
	@Query(nativeQuery = true, value = "select * from chuyenbay where do_dai < (select tambay from maybay where loai = ?1 )")
	List<ChuyenBay> findChuyenMayByMB (String loaiMb);
}
