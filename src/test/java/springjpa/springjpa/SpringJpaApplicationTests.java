package springjpa.springjpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;

import springjpa.springjpa.entity.ChungNhan;
import springjpa.springjpa.entity.ChuyenBay;
import springjpa.springjpa.entity.MayBay;
import springjpa.springjpa.entity.NhanVien;
import springjpa.springjpa.repository.ChungNhanRepository;
import springjpa.springjpa.repository.ChuyenBayRepository;
import springjpa.springjpa.repository.MayBayRepository;
import springjpa.springjpa.repository.NhanVienRepository;

@SpringBootTest
class SpringJpaApplicationTests {
	Gson gson = new Gson();

	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	@Autowired
	NhanVienRepository nhanVienRepository;

	@Autowired
	MayBayRepository mayBayRepository;

	@Autowired
	ChungNhanRepository chungNhanRepository;

	@Test
	void test_1() {
		List<ChuyenBay> ls = chuyenBayRepository.findAllByGaDen("DAD");
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
	void test_4() {
		List<ChuyenBay> ls = chuyenBayRepository.findByCondition(10000, 8000);
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}

	@Test
	void test_5() {
		List<ChuyenBay> ls = chuyenBayRepository.findCBByFromTo("SGN", "BMV");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}

	@Test
	void test_6() {
		List<ChuyenBay> ls = chuyenBayRepository.findCBByFrom("SGN");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}

	@Test
	void test_7() {
		List<MayBay> ls = mayBayRepository.findMayBayByName("Boeing");
		for (MayBay mb : ls) {
			System.out.println(mb);
		}
	}

	@Test
	void test_8() {
		double total = nhanVienRepository.totalLuong();
		System.out.println(total);

	}

	@Test
	void test_9() {
		List<String> ls = nhanVienRepository.findNVByMB("Boeing%");
		for (String ma : ls) {
			System.out.println(ma);
		}

	}

	@Test
	void test_10() {
		List<NhanVien> ls = nhanVienRepository.findNVLaiMB("747");
		for (NhanVien cn : ls) {
			System.out.println(cn);
		}

	}

	@Test
	void test_11() {
		List<String> ls = chungNhanRepository.findMaMBByFirstName("Nguyen");
		System.out.println(ls);
	}

	@Test
	void test_12() {
		List<String> ls = nhanVienRepository.findNVLaiMB("Airbus%", "Boeing%");
		System.out.println(ls);
	}

	@Test
	void test_13() {
		List<MayBay> ls = mayBayRepository.findMayBayByCB("VN280");
		for (MayBay mb : ls) {
			System.out.println(mb.getLoai());
		}
	}

	@Test
	void test_14() {
		List<ChuyenBay> ls = chuyenBayRepository.findChuyenMayByMB("Airbus A320");
		for (ChuyenBay cb : ls) {
			System.out.println(cb);
		}
	}

	@Test
	void test_15() {
		List<String> ls = nhanVienRepository.findNameByMB("Boeing%");
		for (String nv : ls) {
			System.out.println(nv);
		}

	}

	@Test
	void test_16() {
		List<Object> ls = mayBayRepository.findMayBayDuocLai();
		for (Object o : ls) {
			System.out.println(gson.toJson(o).toString());
		}
	}

	@Test
	void test_18() {
		List<Object> ls = chuyenBayRepository.countCBFromGaDi();
		for (Object o : ls) {
			System.out.println(gson.toJson(o).toString());
		}
	}

	@Test
	void test_19() {
		List<Object> ls = chuyenBayRepository.totalPriceByCB();

		System.out.println(gson.toJson(ls).toString());

	}

	@Test
	void test_20() {
		List<Object> ls = chuyenBayRepository.totalCBByTime("12:00");

		System.out.println(gson.toJson(ls).toString());

	}

}
