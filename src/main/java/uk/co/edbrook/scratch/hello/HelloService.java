package uk.co.edbrook.scratch.hello;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final HelloDao helloDao;

    HelloService(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public List<Hello> getHello() {
        return helloDao.findAll().stream()
            .map(ent -> new Hello(
                ent.getId(),
                ent.getName(),
                ent.getLower(),
                ent.getUpper()))
            .toList();
    }
}
