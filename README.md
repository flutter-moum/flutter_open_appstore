# open_appstore

A Flutter plugin for opening the AppStore or PlayStore

---

[![Pub](https://img.shields.io/pub/v/open_appstore.svg)](https://pub.dev/packages/open_appstore)

### Usage 

Import the library via

```dart
import 'package:open_appstore/open_appstore.dart';
```

You can open the AppStore or PlayStore in your Dart code.  
To open the App Store page, you can pass the app Id.
```dart
OpenAppstore.launch(androidAppId: "com.facebook.katana&hl=ko", iOSAppId: "284882215")
```

```dart
static void launch({String androidAppId, String iOSAppId}) async {
    await _channel.invokeMethod(
        'openappstore', {'android_id': androidAppId, 'ios_id': iOSAppId});
  }
```

---

### iOS available 

iOS is available from version 10. 

```swift
if #available(iOS 10.0, *) {
                UIApplication.shared.open(url, options: [:], completionHandler: {(success: Bool) in
                    if success {
                        print("Launching \(url) was successful")
                    }})
            }
```

---

### ScreenShots
<img width="300" src="https://user-images.githubusercontent.com/37133536/65833542-6ed3d580-e30c-11e9-8ccd-2fcb2e5d77b4.png"><img width="300" src="https://user-images.githubusercontent.com/37133536/65833543-6ed3d580-e30c-11e9-88a5-21c9c54c2bae.png">
* ~~iOS can't show in simulator~~



---

### Issues and feedback

Please file [issues](https://github.com/flutter-moum/flutter_open_appstore/issues) to send feedback or report a bug. Thank you!

---

### License