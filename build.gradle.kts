

plugins {
    `java-platform`
    `maven-publish`
    //id("com.github.ben-manes.versions") version "0.33.0"

}

repositories {
    mavenCentral()
}
javaPlatform{

    allowDependencies()
}

dependencies {
   constraints{
       api( Kotlin.jvm)
       api(Kotlin.stdlib_jdk8)
       api(Kotlin.reflect)
       api(Kotlin.serialization_core)
       api(Kotlin.serialization_json)
       api(Kotlin.activity_compose)
       api(Kotlin.activity_compose2)

       api(Ktor.client_serialization_jvm)
       api(Ktor.client_okhttp)
       api(Ktor.client_gson)
       api(Ktor.client_json)
       api(Ktor.server_netty)
       api(Ktor.server_core)
       api(Ktor.gson)
       api(Ktor.server_test)
       api(Ktor.serialization)
       api(Ktor.logging)
       api(Ktor.logging_jvm)
       api(Ktor.client_android)
       api(Ktor.client_encoding)

       api(JCompose.compiler)
       api(JCompose.ui)
       api(JCompose.uiutil)
       api(JCompose.foundation)
       api(JCompose.layout)
       api(JCompose.material)
       api(JCompose.runtime)
       api(JCompose.text_core)
       api(JCompose.tooling)


       api(jsoup.jsoup)
       api(google.cloud_storage)
       api(klogger.logback_clasic)
       api(klogger.timber)
       api(klogger.kotlin_logging_jvm)
       api(Androidx.core_ktx)
       api(Androidx.appcompat)
       api(Androidx.test_junit)
       api(Androidx.test_espresso)
       api(Androidx.view_model_scope)
       api(Androidx.lifecycle_runtime)
       api(Kotlin.coroutines_core)
       api(Kotlin.coroutines_android)
       api(Kotlin.gradle_plugin)
       api(google.google_android_material)
       api(google.gson)
       api(google.cloud_logging)
       api(sun.mail)
       api(sun.mail_activation)
       api(DebugImplementation.leakcanary_android)
       //api(test.junit)
       api(TestingLib.junit)
       api(TestingLib.test_expreso)
       api(TestingLib.test_ext_Junit)
       api(BuildPluginsVersion.manes_versions)  //classpath)

   }
}



publishing {
    publications {
        create<MavenPublication>("knewsplatform") {

            groupId="com.begemot.knewsplatform-bom"
            version="0.0.1"
            //group
            artifactId="deps"
            from(components["javaPlatform"])
        }
    }
}


