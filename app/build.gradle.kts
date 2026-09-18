plugins { id("com.android.application") }

android {
    namespace = "kr.ddcustom.dashboard"
    compileSdk = 35
    defaultConfig {
        applicationId = "kr.ddcustom.dashboard"
        // WFF v1 requires Wear OS 4 / API 33. Galaxy Watch 4 supports it
        // after the Wear OS 4 update.
        minSdk = 33
        targetSdk = 35
        versionCode = 2
        versionName = "1.1"
    }
}
