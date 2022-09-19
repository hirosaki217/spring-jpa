package springjpa.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springjpa.springjpa.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{

}
