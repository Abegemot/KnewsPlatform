
object Vers{
    const val PP = "3.1"
}

object Versions {

    const val JUNIT = "4.13"
    const val KTLINT = "0.36.0"
    const val KTOR = "1.3.2"
    const val JSOUP = "1.13.1"
    const val LOGBACK = "1.2.1"
    const val SHADOW = "6.0.0"
    const val GAPPENGINE = "com.google.cloud.tools:appengine-gradle-plugin:2.3.0"
    const val GSTORAGE = "com.google.cloud:google-cloud-storage:1.111.1"

    const val GSON = "com.google.code.gson:gson:2.8.6"
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"

    const val sunmail1 = "com.sun.mail:android-mail:1.6.0"
    const val sunmail2 = "com.sun.mail:android-activation:1.6.0"
    //const val leakcanary = "2.4"


}
object Ktor {
    const val Ver                       = "1.3.2"
    const val client_okhttp             = "io.ktor:ktor-client-okhttp:$Ver"
    const val client_json               = "io.ktor:ktor-client-json:$Ver"
    const val client_gson               = "io.ktor:ktor-client-gson:$Ver"
    const val client_serialization_jvm  = "io.ktor:ktor-client-serialization-jvm:$Ver"
    const val server_netty              = "io.ktor:ktor-server-netty:$Ver"
    const val server_core               = "io.ktor:ktor-server-core:$Ver"
    const val gson                      = "io.ktor:ktor-gson:$Ver"
    const val server_test               = "io.ktor:ktor-server-tests:$Ver"
    const val serialization             = "io.ktor:ktor-serialization:$Ver"
    const val logging                   = "io.ktor:ktor-client-logging:$Ver"
    const val logging_jvm               = "io.ktor:ktor-client-logging-jvm:$Ver"
}

object Kotlin{
    const val Ver                    = "1.3.72"
    const val jvm                    = "org.jetbrains.kotlin.jvm:$Ver"
    const val stdlib                 = "org.jetbrains.kotlin:kotlin-stdlib:$Ver"
    const val stdlib_jdk8            = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$Ver"
    const val gradle_plugin          = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Ver"
    const val serialization_runtime  = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0"
    const val coroutines_core        = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7"
    const val coroutines_android     = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7"
    const val reflect                = "org.jetbrains.kotlin:kotlin-reflect:$Ver"
}

object Androidx{
    const val core_ktx                 = "androidx.core:core-ktx:1.3.0"
    const val appcompat                = "androidx.appcompat:appcompat:1.1.0"
    const val test_junit               = "androidx.test.ext:junit:1.1.1"
    const val test_espresso            = "androidx.test.espresso:espresso-core:3.2.0"

}

object sun{
    const val mail            = "com.sun.mail:android-mail:1.6.5"
    const val mail_activation = "com.sun.mail:android-activation:1.6.5"
}

object jsoup{
    const val jsoup="org.jsoup:jsoup:1.13.1"
}

object klogger{
    const val logback_clasic = "ch.qos.logback:logback-classic:1.2.3"
    const val timber         = "com.jakewharton.timber:timber:4.7.1"
}

object JCompose{
    const val jcompose    = "0.1.0-dev14"
    const val layout      = "androidx.ui:ui-layout:$jcompose"
    const val material    = "androidx.ui:ui-material:$jcompose"
    const val tooling     = "androidx.ui:ui-tooling:$jcompose"
    const val foundations = "androidx.ui:ui-foundation:$jcompose"
    const val rontime     = "androidx.compose:compose-runtime:$jcompose"
    const val compiler    = "androidx.compose:compose-compiler:$jcompose"
    const val text_core   = "androidx.ui:ui-text-core:$jcompose"

}

object google{
    const val cloud_storage            = "com.google.cloud:google-cloud-storage:1.111.1"
    const val google_android_material  = "com.google.android.material:material:1.1.0"
    const val gson                     = "com.google.code.gson:gson:2.8.6"
}

object BuildPluginsVersion {
    const val DETEKT = "1.8.0"
    const val KOTLIN = "1.3.72"
    const val KTLINT = "9.2.1"
    const val PLUGIN_PUBLISH = "0.11.0"
    const val VERSIONS_PLUGIN = "0.28.0"
    const val SERIALIZATION="1.3.70"
    const val com_android_tools = "com.android.tools.build:gradle:4.2.0-alpha04"
    const val manes_versions    = "com.github.ben-manes.versions:0.29.0"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}

object DebugImplementation{
    const val leakcanary_android="com.squareup.leakcanary:leakcanary-android:2.4"
}

object test{
    const val junit = "junit:junit:4.12"
}