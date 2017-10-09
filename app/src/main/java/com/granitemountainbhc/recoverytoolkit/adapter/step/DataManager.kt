package com.granitemountainbhc.recoverytoolkit.adapter.step



interface DataManager {

    fun saveData(data: String?)

    fun getData(): String?

}