# UserIQ Android SDK Changelog

All notable changes in Android SDK are documented here. We adhere to
[Semantic Versioning](http://semver.org/spec/v2.0.0.html).

### [2.8.1] - 2020-09-19

#### Added

- Support for Early React Events

---

### [2.8.0] - 2020-09-01

#### Added

- Multiple lines support for Tooltip Description
- tzOffset support for MobileAppEvents

---

### [2.7.0] - 2020-06-29

#### Added 

- Launching InApp Modal from another InApp Modal

---

### [2.6.0] - 2019-12-04

#### Added

- Logout API (see [readme for details](https://github.com/useriq-com/android-sdk#step-5--logout))
- SDK initialised with anonymous user when `initWithAPIKey` is called
- Detail logging for exceptions
- Added kill switch in SDK (can be triggered from backend)

#### Updated

- Store additional parameters for same user in case of multiple `setUser` calls

#### Removed

- isOffline API

---

### [2.5.2] - 2019-11-28

#### Fixed

- Button tracking in React-native modals

---

### [2.5.1] - 2019-11-07

#### Updated

- Reduced in-app message delay from 3000 ms to 250 ms

---

### [2.5.0] - 2019-10-09

#### Updated
- Increased timeout for network calls
- Improved performance in live previews

### [2.4.2] - 2019-08-30

#### Added

- Support for Tooltip in modals

---

### [2.4.1] - 2019-08-08

#### Updated

- Xposed APP_FOREGROUND event to dashboard

---

### [2.4.0] - 2019-07-25

#### Added

- Comment box support in NPS & Star campaigns
- New campaign button action OPEN_WEBVIEW. Opens a desired url in a webview in the app.
- Xamarin automation id support

#### Updated

- Improved screen detection mechanism

#### Fixed

- Added support for custom RootView (for React-native)

---

### [2.3.0] - 2019-07-09

#### Added

- New campaign button action support: `Open Question` & `Start Walkthrough`
- New APIs
  - public static void init(Activity activity, String apiKey)
  - public static void setUser(Context context, User user)
  - public static boolean showCtxHelp(Context context)
  - public static boolean showHelpCentre(Context context)
#### Updated

- Improved UI for helpcenter
- Support for Tooltip styling

#### Deprected

- public static void init(Application application, String apiKey)
- public static void setUser(User user)
- public static boolean showCtxHelp()
- public static boolean showHelpCentre()

---

### [2.2.0] - 2019-06-17

#### Added

- Automatic/Manual tooltip positioning support (2 positions)
- Automatic/Manual beacon and number tooltip positioning support (9 positions)
- Support for `x` and `y` offsets for tooltips
- Ability to make walkthrough wait for the next step for a specific amount of time
- Keyboard support for emulators (on Dashboard)
- Copy/Paste support for emulators (on Dashboard)

#### Updated

- Walkthrough enhancements

#### Fixed

- Minor bug fixes

### [2.1.0] - 2019-05-30

#### Added

- Landscape Orientation support (on Dashboard)

#### Updated

- Added event tracking for campaings (walkthrough & campaigns)

#### Fixed

- Fixed React Native click tracking
- Fixed walkthrough tooltip's button for react native
- Sending App resume event on IO connection
- Other minor bug fixes

### [2.0.4] - 2019-05-11

#### Fixed

- Reuse existing Websocket when setUser is called

#### Added 

- Added debug logs

### [2.0.3] - 2019-04-16

#### Changing user

-- `setUser(User user)` can be used to log in and logout user. Keep a standard user info for logged out users for tracking purposes.

### [2.0.2] - 2019-04-12

#### Minor improvement
- Change in the android API used for getting position of the root view

### [2.0.1] - 2019-04-05

#### React native 
- FAB will be attached as soon as the SDK is initialized.

### [2.0.0] - 2018-12-18

#### Added

- NPS Surveys (3 types)
- Rating Surveys (3 types)
- Walkthroughs (beacons, Numbered & tooltips)
  - Both one off & multiple steps in same screens
  - Cross screen walkthroughs with step triggers
- Helpcenter
  - Rich text support
  - Ability to add images (auto cached on device)
  - Ability to export walkthrough’s into questions
- Contextual Help
  - Configurable guide on per screen basis
  - Allow manual triggers of FAQ’s & Walkthroughs

---
