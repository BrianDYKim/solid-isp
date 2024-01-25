package com.tutoring.solidisp.external.messaging

import com.tutoring.solidisp.external.messaging.apns.ApnsPushSender
import com.tutoring.solidisp.external.messaging.fcm.FcmPushSender
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

/**
 * @author Brian
 * @since 1/26/24
 */
@Component
class ExternalMessagingManager(
    @Qualifier("fcm")
    private val fcmSender: FcmPushSender,
    @Qualifier("apns")
    private val apnsSender: ApnsPushSender
) {
    fun getSender(pushType: String): PushSenderInterface = when(pushType) {
        "fcm" -> this.fcmSender
        "apns" -> this.apnsSender
        else -> this.fcmSender
    }
}