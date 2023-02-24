package com.example.javaconfigurations

import com.example.lib.MyLibClass

class OpenMyLibClass : MyLibClass() {
    override val message: String
        get() = "Opened MyLibClass"
}

fun createMyClass() =
    MyClass(OpenMyLibClass())
