package hello.core4;

import hello.core4.discount.DiscountPolicy;
import hello.core4.discount.FixDiscountPolicy;
import hello.core4.discount.RateDiscountPolicy;
import hello.core4.member.MemberRepository;
import hello.core4.member.MemberService;
import hello.core4.member.MemberServiceImpl;
import hello.core4.member.MemoryMemberRepository;
import hello.core4.order.OrderService;
import hello.core4.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
