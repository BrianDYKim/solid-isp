package com.tutoring.solidisp.core.domain.enums

/**
 * @author Brian
 * @since 1/25/24
 */
enum class Device(val pushType: String) {
    ANDROID("fcm"), IOS("apns")
}