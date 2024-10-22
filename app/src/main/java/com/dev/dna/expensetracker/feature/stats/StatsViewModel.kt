package com.dev.dna.expensetracker.feature.stats


import androidx.lifecycle.ViewModel

import com.dev.dna.expensetracker.base.BaseViewModel
import com.dev.dna.expensetracker.base.UiEvent
import com.dev.dna.expensetracker.data.dao.ExpenseDao
import com.dev.dna.expensetracker.data.model.ExpenseSummary
import com.dev.dna.expensetracker.utils.Utils
import com.github.mikephil.charting.data.Entry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(val dao: ExpenseDao) : BaseViewModel() {
    val entries = dao.getAllExpenseByDate()
    val topEntries = dao.getTopExpenses()
    fun getEntriesForChart(entries: List<ExpenseSummary>): List<Entry> {
        val list = mutableListOf<Entry>()
        for (entry in entries) {
            val formattedDate = Utils.getMillisFromDate(entry.date)
            list.add(Entry(formattedDate.toFloat(), entry.total_amount.toFloat()))
        }
        return list
    }

    override fun onEvent(event: UiEvent) {
    }
}