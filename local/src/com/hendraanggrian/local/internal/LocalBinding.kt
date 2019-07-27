package com.hendraanggrian.local.internal

import com.hendraanggrian.local.LocalSaver
import com.hendraanggrian.local.LocalWriter
import com.hendraanggrian.local.ReadableLocal
import com.hendraanggrian.local.WritableLocal

/** Parent class of any class generated by `local-compiler`. */
abstract class LocalBinding(private val source: ReadableLocal) : LocalSaver {

    protected fun get(key: String, defaultValue: String?): String? =
        source[key] ?: defaultValue

    protected fun get(key: String, defaultValue: Boolean): Boolean =
        source.getBoolean(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Double): Double =
        source.getDouble(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Float): Float =
        source.getFloat(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Long): Long =
        source.getLong(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Int): Int =
        source.getInt(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Short): Short =
        source.getShort(key) ?: defaultValue

    protected fun get(key: String, defaultValue: Byte): Byte =
        source.getByte(key) ?: defaultValue

    val writer: LocalWriter
        get() = when (source) {
            is LocalWriter -> source
            is WritableLocal -> source.writer
            else -> error("Unsupported local instance.")
        }
}