### 안드로이드

리눅스 기반으로 만들어진 OS

OS 위에 ART라는 런타임이 탑재되어 있다.

각 버전 간의 호환성이 떨어진다. (따라서 최근 어플들은 앱의 탈을 쓴 웹으로 만들어짐)

IoT를 조종하는 시스템은 앱을 이용해야만 한다.



##### gradel

maven의 업그레이드 버전

xml이 UI 담당, MainActivity.java가 Controller 역할



크게 java, manifest, resource로 나뉜다.

##### res 패키지

- layout : 화면관리
- mipmap : 아이콘 등의 이미지 관리
- values : 프로젝트 내에서 사용하는 전역변수들을 관리한다.
- drawable : 앱 내에서 쓰이는 모든 이미지 관리



##### Manifest

앱의 환경설정 파일

activity : 누르면 oncreate이 실행된다.



##### layout

wrap_content : 내용물에 맞춰 자동으로 사이즈 지정

match_parent : 뷰를 담고 있는 뷰그룹의 여유 공간을 꽉 채운다.



##### 안드로이드 앱 구성요소

- Activity (화면 구성)
- Service (백그라운드에서 실행)
- Broadcast Receiver (OS의 신호를 받는다)
- Content Provider (다른 앱에 저장된 정보를 지금 앱으로 가져와서 사용)



###### intent

activity와 activity를 연결



##### service

화면이 없는 activity라고 생각

따라서 화면 뒤에서 계속 돌아가고 있다.



##### broadcast

OS가 특정신호(전화, 메시지 등)를 모두에게 뿌린다.