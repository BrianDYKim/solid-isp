package com.tutoring.solidisp.external.messaging.fcm

import com.tutoring.solidisp.external.messaging.LazyPushSenderInterface
import com.tutoring.solidisp.external.messaging.PushSenderInterface
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * @author Brian
 * @since 1/26/24
 */
@Component("fcm")
class FcmPushSender: PushSenderInterface, LazyPushSenderInterface {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun send(message: String) {
        logger.info("sent by fcm : $message")
    }

    override fun lazySend(message: String, timeUnit: Int) {
        logger.info("sent by fcm after $timeUnit ms: $message")
    }
}