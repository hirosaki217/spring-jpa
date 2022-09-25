package springjpa.springjpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;

import springjpa.springjpa.entity.ChuyenBay;
import springjpa.springjpa.entity.MayBay;
import springjpa.springjpa.repository.ChuyenBayRepository;
import springjpa.springjpa.repository.MayBayRepository;
import springjpa.springjpa.repository.NhanVienRepository;

@SpringBootTest
class SpringJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@Autowired
	MayBayRepository mayBayRepository;
	
	@Test
	void test_1() {
		List<ChuyenBay> ls =chuyenBayRepository.findAllByGaDen("DAD");
		System.out.println(ls);
		
	}
	
	@Test
	void test_2() {
		List<MayBay> ls = mayBayRepository.findMayBayLon(10000);
		System.out.println(ls);
	}
	
	@Test
	void test_3() {
		List<MayBay> ls = mayBayRepository.findMayBayLon(10000);
		System.out.println(ls);
	}
	
	@Test
	void test_12() {
		List<String> ls = nhanVienRepository.findNVLaiMB("Airbus%", "Boeing%");
		System.out.println(ls);
	}
	
	@Test
	void test_16(){
		List<Object> ls = mayBayRepository.findMayBayDuocLai();
		Gson gson = new Gson();
		for(Object o : ls) {
			System.out.println(gson.toJson(o).toString());
		}
	}

}
