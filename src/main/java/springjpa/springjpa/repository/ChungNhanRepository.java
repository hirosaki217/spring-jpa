package springjpa.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springjpa.springjpa.entity.ChungNhan;
import springjpa.springjpa.entity.ChungNhanPK;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>{

}
