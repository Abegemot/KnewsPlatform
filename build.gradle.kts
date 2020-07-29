plugins {
    `java-platform`
    `maven-publish`

        id("com.github.ben-manes.versions") version "0.29.0"

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
       api(Kotlin.serialization_runtime)
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

       api(JCompose.compiler)
       api(JCompose.foundations)
       api(JCompose.layout)
       api(JCompose.material)
       api(JCompose.rontime)
       api(JCompose.text_core)
       api(JCompose.tooling)


       api(jsoup.jsoup)
       api(google.cloud_storage)
       api(klogger.logback_clasic)
       api(klogger.timber)
       api(Androidx.core_ktx)
       api(Androidx.appcompat)
       api(Androidx.test_junit)
       api(Androidx.test_espresso)
       api(Kotlin.coroutines_core)
       api(Kotlin.coroutines_android)
       api(Kotlin.gradle_plugin)
       api(google.google_android_material)
       api(google.gson)
       api(sun.mail)
       api(sun.mail_activation)
       api(DebugImplementation.leakcanary_android)
       api(test.junit)
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

