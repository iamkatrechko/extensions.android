package com.github.iamkatrechko.extensions.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Встраивает разметку интерфейса в текущий ViewGroup
 * @param layoutId     идентификатор разметки
 * @param attachToRoot следует ли привязать иерархию к корневому элементу?
 */
fun ViewGroup.inflate(@LayoutRes layoutId: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)