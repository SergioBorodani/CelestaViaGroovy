package ru.curs.groovy

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.web.bind.annotation.RestController
import ru.curs.celesta.SystemCallContext;

@RestController
class Controller {

    private Service service

    Controller(Service aService) {
        this.service = aService
    }

    @Scheduled(cron = "0 25 17 * * ?")
    void getData() {
        service.getData(new SystemCallContext())
    }
}
