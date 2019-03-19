package sample
import platform.UIKit.UIDevice

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
//    UIDevice.currentDevice.systemName() +
//    " " +
//    UIDevice.currentDevice.systemVersion
    actual val name: String = "iOS"
}