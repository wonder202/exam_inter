package com.example.exam_inter;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.entity.Order;
import com.example.service.AddressService;
import com.example.service.ItemService;
import com.example.service.MemberService;
import com.example.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class ExamInterApplicationTests {

	final String format = "TEST = {}";

	@Autowired MemberService memberService;
	@Autowired AddressService addressService;
	@Autowired ItemService itemService;
	@Autowired OrderService orderService;

	// //권한이 customer고객 2명, seller 판매자 1명 추가(완)
	// @Test
	// @Transactional
	// @Rollback(value = false)
	// void insertMember() {
	// 	Member member = new Member();
	// 	member.setId("a1");
	// 	member.setPassword("a1");
	// 	member.setName("a1");
	// 	member.setRole("CUSTOMER");
	// 	int ret = memberService.insertMember(member);
	// 	log.info(format,ret);
	// }

	// //첫번째 고객에 대해서 주소정보 추가(완)
	// @Test
	// @Transactional
	// @Rollback(value = false)
	// void insertAddress() {
	// 	Address address = new Address();
	// 	address.setAddress("부산");
	// 	address.setPostcode("123456");
	// 	address.setMember(memberService.selectOneMember("a1"));
	// 	int ret = addressService.insertAddress(address);
	// 	log.info(format,ret);
	// }

	// //판매자 아이디를 이용하여 물품 5개 추가(물품번호 시퀀스)
	// @Test
	// @Transactional
	// @Rollback(value = false)
	// void insertItem() {
	// 	Item item = new Item();
	// 	item.setName("aaa");
	// 	item.setContent("bbb");
	// 	item.setPrice(100L);
	// 	item.setQuantity(456L);
	// 	item.setMember(memberService.selectOneMember("b1"));
	// 	int ret = itemService.insertItem(item);
	// 	log.info(format,ret);
	// }

	// //등록된 물품중에서 가격이 작은 물품 1개 삭제
	// (삭제안됨ㅠ가격작은걸 select해서 지워야할듯 나중에해보자)
	// @Test
	// @Transactional
	// // @Rollback(value = false)
	// void deleteItem() {
	// 	long price = 100L;
	// 	int ret = itemService.deleteByPrice(price);
	// 	log.info(format,ret);
	// }

	// 주문 3개 생성(완)
	// @Test
	// @Transactional
	// @Rollback(value = false)
	// void insertOrder() {
	// 	Order order = new Order();
	// 	order.setCnt(110L);
	// 	order.setMember(null);
	// 	order.setMember(memberService.selectOneMember("a1"));
	// 	order.setItem(itemService.selectOneItem(1L));
	// 	int ret = orderService.insertOrder(order);
	// 	log.info(format,ret);
	// }

	// 2번째 주문 수량 200개로 변경(완)
	// @Test
	// @Transactional
	// @Rollback(value = false)
	// void updateOrder() {
	// 	Order order = orderService.selectOneOrder(12L);
	// 	order.setCnt(200L);
	// 	int ret = orderService.updateOrder(order);
	// 	log.info(format,ret);
	// }

	// 주문내역 조회 등(완)
	@Test
	@Transactional
	@Rollback(value = false)
	void selectOrder() {
		List<Order> list = orderService.selectOrder();
		log.info(format, list.toString());
	}
}
