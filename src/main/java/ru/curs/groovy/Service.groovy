package ru.curs.groovy

import ru.curs.celesta.CallContext
import ru.curs.celesta.transaction.CelestaTransaction
import ru.curs.smev.SmevMessageCursor

@org.springframework.stereotype.Service
class Service {

    Service() {}

    @CelestaTransaction
    void getData(CallContext context){
        SmevMessageCursor cursor = new SmevMessageCursor(context)
        cursor.forEach(c -> println(c.getUuid()))
    }
}
