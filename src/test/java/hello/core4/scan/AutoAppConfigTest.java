package hello.core4.scan;

import hello.core4.AutoAppConfig;
import hello.core4.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    public void basicScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService1 = ac.getBean(MemberService.class);
        assertThat(memberService1).isInstanceOf(MemberService.class);
    }
}
