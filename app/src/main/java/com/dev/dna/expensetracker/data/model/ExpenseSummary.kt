package com.dev.dna.expensetracker.data.model

data class ExpenseSummary(
    val type: String,
    val date: String,
    val total_amount: Double
)