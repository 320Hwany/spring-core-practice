package hello.core4.order;

import hello.core4.discount.DiscountPolicy;
import hello.core4.discount.FixDiscountPolicy;
import hello.core4.member.Member;
import hello.core4.member.MemberRepository;
import hello.core4.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }
}
