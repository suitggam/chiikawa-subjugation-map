## Today I learned - Java 기초

### 1. Java의 특징
Java는 운영체제에 종속되지 않습니다.<br/>
그 이유는 JVM이라는 실행 환경이 있기 때문입니다.<br/>
JVM은 Java Virtual Machine으로 바이트코드를 로드하고 실행하는 가상 머신입니다.<br/>
각 운영체제에 맞는 JVM만 있다면 Java 언어를 javac(java compiler)가 바이트코드(.java -> .class)로 변환해서 실행시킵니다.<br/>

### 2. Java 설치 요소
Java를 실행하기 위해서는 JDK, JRE, JVM이 필요합니다.<br/>
보통 JDK에 JRE, JVM이 포함돼 있지만 아닌 경우도 있습니다.<br/>
- JDK(Java Development Kit): Java 프로그램을 개발할 때 사용하는 도구들의 모음입니다. javac, 실행 도구 등을 포함합니다.<br/>
- JRE(Java RunTime Environment): Java 프로그램 실행에 필요한 JVM과 표준 라이브러리 등의 실행 환경을 의미합니다.<br/>
- JVM(Java Virtual Machine): 바이트코드를 로드하고 실행하는 가상 머신입니다.<br/>

### 3. main 메서드가 필요한 이유
main 메서드는 Java 애플리케이션의 실행 시작점으로 사용되는 메서드입니다.<br/>
이것은 일종의 약속입니다.