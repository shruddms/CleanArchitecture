package com.kyungeun.cleanarchitecture.domain.schedule.model

class PraySchedule(
    val city: String = "",
    val name: String,
    val time: Long,
    val id: Long? = null
)