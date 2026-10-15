package com.example.p5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel - variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf(value="") }
}