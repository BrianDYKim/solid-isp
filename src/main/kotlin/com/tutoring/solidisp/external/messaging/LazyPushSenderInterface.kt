package com.tutoring.solidisp.external.messaging

/**
 * @author Brian
 * @since 1/26/24
 */
interface LazyPushSenderInterface {
    fun lazySend(message: String, timeUnit: Int)
}