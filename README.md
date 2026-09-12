# 📋 Spring Boot 게시판 (Q&A Board)

Spring Boot 기반으로 만든 질문-답변형 게시판 프로젝트입니다.
회원가입/로그인부터 질문 등록·수정·삭제, 답변 작성, 검색, 페이징까지
게시판에 필요한 핵심 기능을 직접 구현했습니다.

## 🛠 기술 스택

- **Language**: Java 25
- **Framework**: Spring Boot 4.0.5
- **View**: Thymeleaf, Thymeleaf Layout Dialect
- **Security**: Spring Security (Thymeleaf 연동)
- **Database**: H2 (In-memory / 개발용)
- **ORM**: Spring Data JPA
- **Build Tool**: Gradle
- **Validation**: Spring Validation (Jakarta Bean Validation)
- **기타**: Lombok

## ✨ 주요 기능

### 게시판 (질문 / 답변)
- 질문 목록 조회 (페이징 처리)
- 제목/내용 키워드 검색
- 질문 상세 조회
- 질문 등록 / 수정 / 삭제 (작성자 본인만 가능)
- 답변 등록

### 회원 관리
- 회원가입 (비밀번호 확인, 유효성 검증)
- 로그인 / 로그아웃 (Spring Security)
- 인증된 사용자만 글쓰기·수정·삭제 가능하도록 권한 제어

## 📁 프로젝트 구조

```
2-2 Project/demo
├── src/main/java/com/inhatc/board
│   ├── question/      # 질문 도메인 (Entity, Controller, Service, Repository, Form)
│   ├── answer/        # 답변 도메인
│   ├── user/          # 회원 도메인 (User, Security)
│   ├── SecurityConfig.java
│   └── DemoApplication.java
├── src/main/resources
│   ├── templates/     # Thymeleaf 템플릿 (질문/답변/회원 관련 화면)
│   └── application.properties
└── build.gradle
```

## 🚀 실행 방법

```bash
cd "2-2 Project/demo"
./gradlew bootRun
```

실행 후 브라우저에서 아래 주소로 접속합니다.

```
http://localhost:8080
```

## 📌 참고

본 프로젝트는 학습 목적으로 진행한 개인 프로젝트입니다.
