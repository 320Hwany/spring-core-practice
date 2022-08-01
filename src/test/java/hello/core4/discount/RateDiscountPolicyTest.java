package hello.core4.discount;

import hello.core4.member.Grade;
import hello.core4.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 할인을 받습니다")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 20000);
        //then
        assertThat(discount).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인을 받지 않습니다")
    void vip_x(){
        //given
        Member member = new Member(1L, "memberA", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 20000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}
