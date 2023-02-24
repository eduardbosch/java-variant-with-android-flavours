package com.example.lib

import com.example.allopen.TestOnlyOpen

@TestOnlyOpen
class MyLibClass {
    val message: String = "Closed MyLibClass"
}
