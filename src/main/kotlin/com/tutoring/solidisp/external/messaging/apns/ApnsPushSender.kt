package com.tutoring.solidisp.external.messaging.apns

import com.tutoring.solidisp.external.messaging.PushSenderInterface
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * @author Brian
 * @since 1/26/24
 */
@Component("apns")
class ApnsPushSender: PushSenderInterface {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun send(message: String) {
        logger.info("sent by apns : $message")
    }
}