

object Ktor {
    const val Ver                       = "1.6.5"
    const val client_okhttp             = "io.ktor:ktor-client-okhttp:$Ver"
    const val client_cio                = "io.ktor:ktor-client-cio:$Ver"
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
    const val client_android            = "io.ktor:ktor-client-android:$Ver"
    const val client_encoding           = "io.ktor:ktor-client-encoding:$Ver"
}

object grpc{
    const val kotlin_stub   = "io.grpc:grpc-kotlin-stub:1.1.0"
    const val protobuf_lite = "io.grpc:grpc-protobuf-lite:1.38.0"
    const val android       = "io.grpc:grpc-android:1.38.0"
    const val okhttp        = "io.grpc:grpc-okhttp:1.38.0"
    const val gen_grpc_java = "io.grpc:protoc-gen-grpc-java:1.38.0"
    const val protoc        = "com.google.protobuf:protoc:3.16.0"

}

object Kotlin{
    const val Ver                    = "1.6.10"
    const val jvm                    = "org.jetbrains.kotlin.jvm:$Ver"
    const val stdlib                 = "org.jetbrains.kotlin:kotlin-stdlib:$Ver"
    const val stdlib_jdk8            = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$Ver"
    const val stdlib_jdk7            = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$Ver"

    const val gradle_plugin          = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Ver"
    const val serialization_core     = "org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.2"
    const val serialization_json     = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
    const val coroutines_core        = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0"
    const val coroutines_android     = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0"
    const val reflect                = "org.jetbrains.kotlin:kotlin-reflect:$Ver"
    const val activity_compose       = "androidx.activity:activity-compose:1.3.1"
    const val activity_compose2      = "androidx.activity:activity-ktx:1.3.1"

}

object Androidx{
    const val core_ktx                 = "androidx.core:core-ktx:1.3.2"
    const val appcompat                = "androidx.appcompat:appcompat:1.2.0"
    const val test_junit               = "androidx.test.ext:junit:1.1.1"
    const val test_espresso            = "androidx.test.espresso:espresso-core:3.2.0"
    const val view_model_scope         = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    const val lifecycle_runtime        = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
    const val datastore_preferences    = "androidx.datastore:datastore-preferences:1.0.0"

}

object sun{
    const val mail            = "com.sun.mail:android-mail:1.6.7"
    const val mail_activation = "com.sun.mail:android-activation:1.6.7"
}

object jsoup{
    const val jsoup="org.jsoup:jsoup:1.14.3"
}

object klogger{
    const val logback_clasic = "ch.qos.logback:logback-classic:1.2.3"
    const val timber         = "com.jakewharton.timber:timber:5.0.1"
    const val kotlin_logging_jvm = "io.github.microutils:kotlin-logging-jvm:2.1.21"
}

object JCompose{
    const val jcompose    = "1.2.0-alpha01"//"1.1.0-rc02"
    const val layout      = "androidx.compose.foundation:foundation-layout:$jcompose"
    const val foundation  = "androidx.compose.foundation:foundation:$jcompose"
    const val material    = "androidx.compose.material:material:$jcompose"
    const val exticons    = "androidx.compose.material:material-icons-extended:$jcompose"
    const val tooling     = "androidx.compose.ui:ui-tooling:$jcompose"
    const val uitooldata  = "androidx.compose.ui:ui-tooling-data:$jcompose"
    const val preview     = "androidx.compose.ui:ui-tooling-preview:$jcompose"
    const val ui          = "androidx.compose.ui:ui:$jcompose"
    const val uiutil      = "androidx.compose.ui:ui-util:$jcompose"
    const val runtime     = "androidx.compose.runtime:runtime:$jcompose"
    const val compiler    = "androidx.compose.compiler:compiler:$jcompose"
    const val text_core   = "androidx.ui:ui-text-core:$jcompose"

}

object google{
    const val cloud_storage            = "com.google.cloud:google-cloud-storage:2.3.0"
    const val cloud_logging            = "com.google.cloud:google-cloud-logging-logback:0.122.1-alpha"
    const val google_android_material  = "com.google.android.material:material:1.3.0"
    const val gson                     = "com.google.code.gson:gson:2.8.6"
    const val play_core                = "com.google.android.play:core:1.10.3"
    const val play_corektx             = "com.google.android.play:core-ktx:1.8.1"
}

object BuildPluginsVersion {
    const val DETEKT = "1.8.0"
    const val KOTLIN = "1.3.72"
    const val KTLINT = "9.2.1"
    const val PLUGIN_PUBLISH = "0.11.0"
    const val VERSIONS_PLUGIN = "0.28.0"
    const val SERIALIZATION="1.3.70"
    const val com_android_tools = "com.android.tools.build:gradle:4.2.0-alpha04"
    const val manes_versions    = "com.github.ben-manes.versions:0.31.0"
}

object TestingLib {
    const val junit = "junit:junit:4.13.2"
    const val test_ext_Junit = "androidx.test.ext:junit:1.1.2"
    const val test_expreso = "androidx.test.espresso:espresso-core:3.3.0"
}

//OE OE


object DebugImplementation{
    const val leakcanary_android="com.squareup.leakcanary:leakcanary-android:2.8.1"
}

//object test {
//    const val junit = "junit:junit:4.13.2"
//}
