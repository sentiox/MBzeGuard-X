import 'dart:io';

import 'package:mbzeguard/plugins/app.dart';
import 'package:mbzeguard/state.dart';

class Android {
  Future<void> init() async {
    app?.onExit = () async {
      await globalState.appController.savePreferences();
    };
  }
}

final android = Platform.isAndroid ? Android() : null;
