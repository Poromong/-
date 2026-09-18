# DD Dashboard — Galaxy Watch4 Classic

AMG 계기판의 분위기만 재해석한 독자 디자인의 아날로그+디지털 워치페이스 프로젝트입니다. 상표·로고는 포함하지 않았습니다.

## 화면 구성

- 중앙: 아날로그 시침·분침·초침과 디지털 시간
- 상단: 날짜와 요일
- 좌측 게이지: 걸음 수
- 우측 게이지: 워치 배터리
- AOD: 검정 배경, 최소 밝기의 시계·날짜·배터리
- 바로가기 슬롯 8개: 전화, 문자, 카메라 컨트롤러, 삼성헬스, 타이머/알람, 날씨, 음악, 지도

## 중요한 호환성 메모

워치페이스가 다른 앱의 개인정보를 임의로 읽거나 모든 앱을 직접 내장할 수는 없습니다. 날씨와 앱 실행은 Wear OS의 `컴플리케이션` 제공자를 사용하며, 설치 후 Galaxy Wearable의 워치페이스 편집 화면에서 각 슬롯을 원하는 삼성/Google 앱으로 지정합니다. 지정한 영역을 누르면 해당 앱이 실행됩니다.

## 빌드

Android Studio에서 이 폴더를 연 뒤 JDK 17과 Android SDK 35를 설치하고 `Build > Generate App Bundles or APKs > Generate APKs`를 실행합니다. 결과는 `app/build/outputs/apk/debug/app-debug.apk`입니다.

현재 포함된 리소스는 450×450 원형 화면용이며 Watch4 Classic 42mm/46mm 모두 같은 해상도에 맞습니다.
