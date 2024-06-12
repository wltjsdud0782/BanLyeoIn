// 산책 - 지도
function initMap() {
    var container = document.getElementById('map'); // 지도를 담을 영역의 DOM 레퍼런스
    var options = { // 지도를 생성할 때 필요한 기본 옵션
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표.
        level: 3 // 지도의 레벨(확대, 축소 정도)
    };

    var map = new kakao.maps.Map(container, options); // 지도 생성 및 객체 리턴

    // 마커가 표시될 위치입니다 
    var markerPosition = new kakao.maps.LatLng(33.450701, 126.570667);

    // 마커를 생성합니다
    var marker = new kakao.maps.Marker({
        position: markerPosition
    });

    // 마커가 지도 위에 표시되도록 설정합니다
    marker.setMap(map);

    // 지도에 클릭 이벤트를 등록합니다
    // 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
    kakao.maps.event.addListener(map, 'click', function (mouseEvent) {
        // 클릭한 위도, 경도 정보를 가져옵니다 
        var latlng = mouseEvent.latLng;

        // 마커 위치를 클릭한 위치로 옮깁니다
        marker.setPosition(latlng);

        // 마우스로 클릭한 위치의 위도와 경도를 표시할 메세지
        var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
        message += '경도는 ' + latlng.getLng() + ' 입니다';

        // 'clickLatlng'라는 아이디값을 가진 <div> 태그의 innerHTML 으로 위 메세지를 설정합니다.
        var resultDiv = document.getElementById('clickLatlng');
        resultDiv.innerHTML = message;
    });
}

// Kakao Maps API가 로드된 후 initMap 함수 호출
if (typeof kakao === "undefined") {
    // Kakao Maps API 스크립트를 동적으로 로드
    var script = document.createElement('script');
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
