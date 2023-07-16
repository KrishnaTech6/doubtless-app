package com.doubtless.doubtless.screens.poll

data class PollData(
    val id: String? =null,
    val heading: String? =null,
    val description: String? =null,
    val options: List<String>? = null,
    val voteOnOption :List<Int>? = null,
    val totalVotes: Int? = null
) {
}