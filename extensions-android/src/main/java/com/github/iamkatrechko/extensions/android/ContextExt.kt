package com.github.iamkatrechko.extensions.android

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

/** Отображает всплывающий текст */
fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/** Отображает всплывающий текст */
fun Context.showToast(@StringRes messageId: Int) {
    Toast.makeText(this, messageId, Toast.LENGTH_SHORT).show()
}