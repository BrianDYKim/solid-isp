package com.tutoring.solidisp.external.messaging

/**
 * @author Brian
 * @since 1/26/24
 */
interface PushSenderInterface {
    fun send(message: String)
}