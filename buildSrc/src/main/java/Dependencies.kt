/**
 * Created by Anirudh Uppunda on 28,August,2020
 */
object Versions {

    // General app info
    const val applicationId = "com.abhat.android_project_starter"
    const val minSdk = 21
    const val targetSdk = 29
    const val compileSdk = 29
    const val versionCode = 1
    const val versionName = "1.0"
    const val buildToolsVersion = "29.0.2"

    // Build tool and language
    const val androidPlugin = "4.2.0-alpha11"
    const val kotlin = "1.4.10"
    const val javaCompatibilityVersion = 1.8

    // Networking
    const val okHttp = "3.14.0"
    const val retrofit = "2.5.0"
    const val retrofitGsonConverter = "2.5.0"
    const val retrofitLogging = "3.11.0"
    const val moshi = "1.8.0"
    const val moshiConverter = "2.8.1"
    const val coroutineAndroid = "1.1.1"
    const val coroutineAdapter = "0.9.2"

    // Image loading
    const val coil = "0.10.1"
    const val glide = "4.9.0"

    // Video player
    const val exoPlayer = "2.9.6"

    // Android UI
    const val recyclerView = "1.2.0-alpha02"
    const val swipeRefreshLayout = "1.1.0"
    const val material = "1.1.0"
    const val constraintLayout = "1.1.3"

    // Android
    const val appCompat = "1.2.0-beta01"
    const val coreKtx = "1.2.0"
    const val lifecycleCompiler = "2.0.0-rc01"


    // Dependency Injection
    const val koinAndroid = "1.0.2"
    const val koinViewModel = "1.0.2"

    // Testing
    const val junit = "4.13"
    const val junitExt = "1.1.1"
    const val mockitoKotlin = "2.1.0"
    const val coreTesting = "2.0.0-rc01"
    const val rules = "1.1.0"
    const val runners = "1.1.0"
    const val espressoCore = "3.2.0"

    // Date
    const val threeTenAbp = "1.1.0"

}

object Libraries {

    // Build tools and languages
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"

    // Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitRxMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiKotlinCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    // Image loading
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // Video player
    const val exoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayer}"

    // Android UI
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // Android
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleCompiler}"

    // Dependency injection
    const val koinAndroid = "org.koin:koin-android:${Versions.koinAndroid}"
    const val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koinViewModel}"

    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.coreTesting}"
    const val rules = "androidx.test:rules:${Versions.rules}"
    const val runners = "androidx.test:runner:${Versions.runners}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

    // Date
    const val date = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenAbp}"
}