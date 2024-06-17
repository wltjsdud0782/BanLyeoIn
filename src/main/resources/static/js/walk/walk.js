// 산책 - 지도
function initMap() {
    const container = document.getElementById('map'); // 지도를 담을 영역의 DOM 레퍼런스

    // 산책 컨텐츠에서 받아온 위치 정보
    const latitude = [[${walkDetail.placeVO.latitude}]]; // Thymeleaf 템플릿 엔진을 통해 서버에서 데이터를 받아옵니다.
    const longitude = [[${walkDetail.placeVO.longitude}]];

    const options = {
        center: new kakao.maps.LatLng(latitude, longitude), // 서버에서 받아온 위치로 지도의 중심 설정
        level: 3 // 지도의 레벨(확대, 축소 정도)
    };

    const map = new kakao.maps.Map(container, options); // 지도 생성 및 객체 리턴

    // 마커 위치 설정
    const markerPosition = new kakao.maps.LatLng(latitude, longitude);

    // 마커 생성
    const marker = new kakao.maps.Marker({
        position: markerPosition
    });

    // 마커 지도에 추가
    marker.setMap(map);

    // 지도 클릭 이벤트 처리
    kakao.maps.event.addListener(map, 'click', function (mouseEvent) {
        const latlng = mouseEvent.latLng;
        marker.setPosition(latlng);

        const message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
        message += '경도는 ' + latlng.getLng() + ' 입니다';

        const resultDiv = document.getElementById('clickLatlng');
        resultDiv.innerHTML = message;
    });
}

// Kakao Maps API가 로드된 후 initMap 함수 호출
if (typeof kakao === "undefined") {
    // Kakao Maps API 스크립트를 동적으로 로드
    const script = document.createElement('script');
    script.src = "//dapi.kakao.com/v2/maps/sdk.js?appkey=66b01b71fea07c168af0e42040f0e272&autoload=false";
    document.head.appendChild(script);

    script.onload = function () {
        kakao.maps.load(function () {
            initMap();
        });
    };
} else {
    kakao.maps.load(function () {
        initMap();
    });
}
