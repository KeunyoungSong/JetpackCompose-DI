# Jetpack Compose DI 실습

이 프로젝트는 Jetpack Compose와 Dagger Hilt를 활용하여 `KeunyounSong` 의 GitHub 레포지토리 목록을 가져오고 표시하는 안드로이드 앱을 만드는 실습입니다. 

## 기술 스택
- Kotlin
- Jetpack Compose
- Dagger Hilt
- Retrofit

## 주요 기능
- GitHub API를 사용하여 사용자의 레포지토리 목록을 불러옵니다.
- Jetpack Compose를 사용한 UI 구성
- Dagger Hilt를 통한 의존성 주입

## 커밋 이력
- `fcb601c` Initial commit
- `a6a2db5` gitignore 추가
- `982aed6` Hilt 의존성 버전 추가
- `ba7cce9` 프로젝트 수준 Hilt 플러그인 의존성 추가
- `fe97c3f` Hilt 플러그인을 적용하기 위해 kapt 의존성 추가
- `64ba500` 앱 모듈 수준 Hilt 의존성 추가
- `fa89d7f` Application 추가
- `bbef305` Hilt 를 적용하기 위해 AndroidManifest 수정
- `b1a469b` MainActivity 에 @AndroidEntryPoint 적용
- `e8b0691` Hilt AppModule 모듈 생성
- `bff6bc2` AppModule 에 Github API URI Provider 추가
- `dcbc244` Gson 라이브러리 추가
- `9fed53e` AppModule 에 Gson provider 추가
- `50ecde9` Retrofit 관련 라이브러리 추가
- `43f0d9f` AppModule 에 Retrofit gson converter factory provider 추가
- `d379eb2` AppModule 에 Retrofit provider 추가
- `f951aa1` GithubService interface 추가
- `48616b7` AppModule 에 Retrofit github service provider 추가
- `751ad78` GithubViewModel 추가
- `be3cf63` 프로젝트 구조 변경
- `9af2324` 앱 모듈 수준 ViewModel 의존성 추가
- `6b2aa62` viewModel 초기화 함수가 자동으로 import 되지 않아 직접 경로 추가
- `71d29fa` Internet 권한 추가
- `3e7b185` 코드 정리
