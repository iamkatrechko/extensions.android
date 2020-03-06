package com.github.iamkatrechko.extensions.android

import android.app.Activity
import android.os.Parcelable
import java.io.Serializable

/** Возвращает строковый аргумент с ключом [key], либо бросает ошибку, если аргумент не передан */
fun Activity.requireStringExtra(key: String): String =
    intent.getStringExtra(key) ?: error("Не передан обязательный аргумент $key")

/** Возвращает parcelable аргумент типа [T] с ключом [key], либо бросает ошибку, если аргумент не передан */
fun <T : Parcelable> Activity.requireParcelableExtra(key: String): T =
    intent.getParcelableExtra<T>(key) ?: error("Не передан обязательный аргумент $key")

/** Возвращает serializable аргумент типа [T] с ключом [key], либо бросает ошибку, если аргумент не передан */
inline fun <reified T : Serializable> Activity.requireSerializableExtra(key: String): T =
    intent.getSerializableExtra(key) as? T ?: error("Не передан обязательный аргумент $key")
