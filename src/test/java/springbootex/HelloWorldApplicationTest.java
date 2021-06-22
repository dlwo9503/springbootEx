package springbootex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {HelloWorldApplicationTest.class}) // 5번 버전에서는 이 2개 사용
//@SpringBootTest(classes= {HelloWorldApplicationTest.class}) // boot에서는 이렇게 사용
@SpringBootTest // -> 이렇게 사용할려면 메인에서 @SpringBootConfiguration를 사용해야 함
public class HelloWorldApplicationTest {
	@Test
	public void contextLoads() {
	}
}
