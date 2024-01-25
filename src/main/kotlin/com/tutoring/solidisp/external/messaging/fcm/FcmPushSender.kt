package com.tutoring.solidisp.external.messaging.fcm

import com.tutoring.solidisp.external.messaging.PushSenderInterface
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * @author Brian
 * @since 1/26/24
 */
@Component("fcm")
class FcmPushSender: PushSenderInterface {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun send(message: String) {
        logger.info("sent by fcm : $message")
    }
}