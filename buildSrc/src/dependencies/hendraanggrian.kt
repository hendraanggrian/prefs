const val VERSION_KTFX = "8.7.4"
const val VERSION_JAVAPOET_KTX = "0.5"

fun Dependencies.hendraanggrian(module: String, version: String) = "com.hendraanggrian:$module:$version"

fun Dependencies.hendraanggrian(repo: String, module: String, version: String) = "com.hendraanggrian.$repo:$module:$version"

fun Plugins.hendraanggrian(module: String) = id("com.hendraanggrian.$module")