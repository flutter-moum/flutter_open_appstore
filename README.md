# open_appstore

A new flutter plugin project.

---

[![Pub](https://img.shields.io/pub/v/open_appstore.svg)](https://pub.dev/packages/open_appstore)

## Getting Started

This project is a starting point for a Flutter
[plug-in package](https://flutter.dev/developing-packages/),
a specialized package that includes platform-specific implementation code for
Android and/or iOS.

For help getting started with Flutter, view our 
[online documentation](https://flutter.dev/docs), which offers tutorials, 
samples, guidance on mobile development, and a full API reference.

---

A Flutter plugin for open Appstore or PlayStore

---

### Usage 

Use the plugin

```dart
import 'package:open_appstore/open_appstore.dart';
```

You can open the AppStore or PlayStore in your Dart code.

```dart
static void launch({String androidAppId, String iOSAppId}) async {
    await _channel.invokeMethod(
        'openappstore', {'android_id': androidAppId, 'ios_id':iOSAppId});
  }
```

---

#### iOS available 

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

* ~~iOS can't show in simulator~~



---

### API details 



---

### Issues and feedback

Please file [issues](https://github.com/flutter-moum/flutter_open_appstore/issues) to send feedback or report a bug. Thank you!

## 

---

### License

