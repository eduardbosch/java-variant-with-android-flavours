package com.example.javaconfigurations

import com.example.lib.MyLibClass

data class MyClass(
    val myLibClass: MyLibClass,
) {

    val message: String = myLibClass.message
}
