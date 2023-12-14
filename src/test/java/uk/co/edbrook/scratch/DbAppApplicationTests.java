package uk.co.edbrook.scratch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import uk.co.edbrook.scratch.app.HellosResponse;
import uk.co.edbrook.scratch.hello.Hello;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DbAppApplicationTests extends TestDbInit {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void helloEndpointReturnsHellos() {
        HellosResponse res = restTemplate.getForObject(
            "http://localhost:" + port + "/hello",
            HellosResponse.class);
        assertThat(res.hellos())
            .usingRecursiveFieldByFieldElementComparator()
            .containsExactly(
                new Hello(1L, "thing", 35, 42),
                new Hello(2L, "other", 19, 28),
                new Hello(3L, "a", 4, 78),
                new Hello(4L, "b", 2, 65),
                new Hello(5L, "c", 42, 353),
                new Hello(6L, "d", 12, 22),
                new Hello(7L, "e", 10, 43567)
            );
    }
}
