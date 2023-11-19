
INSERT INTO users(name,budget,image_url,created_date,modified_date) VALUES('이성진',400000,'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%9C%A0%EC%A0%80%EC%82%AC%EC%A7%84/%EC%9D%B4%EC%84%B1%EC%A7%84.jpg',
                                                                           '2023-05-16 15:48:57.450179', '2023-05-16 15:48:57.450179');
INSERT INTO users(name,budget,image_url,created_date,modified_date) VALUES('김경민',300000,'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%9C%A0%EC%A0%80%EC%82%AC%EC%A7%84/%EA%B9%80%EA%B2%BD%EB%AF%BC.jpg',
                                                                           '2023-05-18 15:48:57.450179', '2023-05-18 15:48:57.450179');
INSERT INTO users(name,budget,image_url,created_date,modified_date) VALUES('송채영',450000,'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%9C%A0%EC%A0%80%EC%82%AC%EC%A7%84/%EC%86%A1%EC%B1%84%EC%98%81.jpg',
                                                                           '2023-05-18 15:48:57.450179','2023-05-18 15:48:57.450179');

INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('알촌','서울 광진구 화양동 503-2',37.545098,127.075628,'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EC%95%8C%EC%B4%8C.png',
                                                                                       '토요일 정기휴무, 토요일 제외 9:00-21:00');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('핵밥','서울 광진구 화양동 164-9',37.542245,127.071422,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%ED%95%B5%EB%B0%A5.png',
                                                                                       '11:00-22:00 (15:00-17:00 브레이크타임)');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('왕소구이','서울 광진구 화양동 514',37.545358,127.076933,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EC%99%95%EC%86%8C%EA%B5%AC%EC%9D%B4.png',
                                                                                       '일요일 휴무');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('카토카츠','서울 광진구 화양동 106-2',37.546189,127.073083,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EC%B9%B4%ED%86%A0%EC%B9%B4%EC%B8%A0.png',
                                                                                       '일요일 정기휴무, 일요일 제외 11:30-21:00 (14:30-17:00 브레이크타임)');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('건대학식','서울 광진구 화양동 1',37.541874,127.077811,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EA%B1%B4%EB%8C%80%ED%95%99%EC%8B%9D.png',
                                                                                       '운영시간 까먹음(다음에 확인)');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('카츠젠','서울 성동구 성수동2가 277-57',37.543863,127.070128,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EC%B9%B4%EC%B8%A0%EC%A0%A0.png',
                                                                                       '토요일, 일요일 휴무');
INSERT INTO restaurants(name,address,latitude,longitude,image_url,information) VALUES ('건대우동집','서울 성동구 성수동2가 275-24',37.541868,127.059682,
                                                                                       'https://mealmate-storage.s3.ap-northeast-2.amazonaws.com/%EC%8B%9D%EB%8B%B9+%EC%82%AC%EC%A7%84/%EA%B1%B4%EB%8C%80%EC%9A%B0%EB%8F%99%EC%A7%91.png',
                                                                                       '24시간 영업');


INSERT INTO menus(name,price,restaurant_id) VALUES('그릴드치킨알밥',5500,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('진매불닭',5600,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('가나미소알밥',5500,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('순한알밥',4300,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('약매알밥',4700,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('매콤알밥',4700,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('진매알밥',4800,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('갈릭알밥',5200,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('카레알밥',5200,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('매콤제육',5200,1);
INSERT INTO menus(name,price,restaurant_id) VALUES('큐브스테이크 덮밥',12900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('카라이라멘',10500,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('마제소바',8900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('경양식왕돈까스',9900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('고기듬뿍덮밥',10900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('항정살덮밥',11900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('소곱창덮밥',13900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('돼지갈비양념덮밥',10900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('연어덮밥',13900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('새우장덮밥',13900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('큐브스테이크 덮밥 정식',15900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('고기듬뿍덮밥 정식',13900,2);
INSERT INTO menus(name,price,restaurant_id) VALUES('제육볶음',7000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('간장불백',7000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('고등어구이',8000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('김치찌개',7000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('된장찌개',6000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('김치볶음밥',6000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('냉면',7000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('명품삼겹살',14000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('삼겹살',7000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('닭볶음탕',22000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('볶음밥',2000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('계란말이',6000,3);
INSERT INTO menus(name,price,restaurant_id) VALUES('히레카츠(안심)',14000,4);
INSERT INTO menus(name,price,restaurant_id) VALUES('로스카츠(등심)',13000,4);
INSERT INTO menus(name,price,restaurant_id) VALUES('치킨 가라아게(4조각)',11000,4);
INSERT INTO menus(name,price,restaurant_id) VALUES('치킨 가라아게(2조각)',4000,4);
INSERT INTO menus(name,price,restaurant_id) VALUES('음료',2000,4);
INSERT INTO menus(name,price,restaurant_id) VALUES('420 쌀국수',4200,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('차돌 쌀국수',5500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('마라 쌀국수',6200,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('소금삼겹',3500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('삼겹양념구이',3500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('고기짜장면',3900,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('차돌짬뽕',7500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('탕수짜장면',6500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('수육국밥',5900,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('얼큰국밥',6300,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('맑은 순댓국밥',6200,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('마라탕 기본',5900,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('떡볶이',3500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('치즈라볶이',6500,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('120 돈가스',5800,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('170 돈가스',6800,5);
INSERT INTO menus(name,price,restaurant_id) VALUES('생등심 돈카츠',10000,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('냉모밀',9500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('알밥모밀카츠',11500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('이탈리안 치즈카츠',11000,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('순두부 돈까스',10500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('생안심 돈카츠',11000,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('고추매운 돈카츠',10500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('눈꽃치즈함박스테이크',10500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('판모밀',9000,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('규동',10000,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('김치치즈 카츠나베',11500,6);
INSERT INTO menus(name,price,restaurant_id) VALUES('우동',5500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('핫도그소시지마요김밥',5500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('짜장',5500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('얼큰우동',6000,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('잔치국수',6000,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('비빔국수',6500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('쫄면',6500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('돈까스',8500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('김밥',3500,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('비빔밥',6000,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('제육덮밥',8000,7);
INSERT INTO menus(name,price,restaurant_id) VALUES('치즈돈까스',9000,7);

INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('먹을만해요',3,55,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('건대 돈까스 맛집 1티어! 진짜 맛있어요!',5,36,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('간단하게 먹기 좋아요 가성비 굿',3,67,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('치즈카츠 맛있네요 ',4,59,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('잘먹었습니다',4,24,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('구웃',4,35,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('경양식돈까스 땡겨서 먹으러왔어요 괜찮네요',5,14,1);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('김밥이랑 쫄면 조합 좋아요 배불러요',3,75,1);

INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('요즘 즐겨먹고있어요 뜨끈하고 맛도 괜찮고  가성비 좋아요',3,40,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('친절하시고 기본반찬도 좋아요 든든하게 먹고갑니당',3,5,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('너무 묽고 아무맛도 안나요',1,45,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('집밥 먹고 싶어서 왔어요 맛있어요~',5,23,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('저번에 먹고 또 왔어요 혼밥하기 좋아요',4,5,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('이 가격에 마라탕을 먹을 수 있따니 가성비가 너무 좋아요',5,51,2);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('카츠젠 김치치즈나베 가끔 생각나서 먹으러와요',3,66,2);

INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('메뉴가 엄청 다양해서 고르느라 힘들었어요 맛있고 양 많아요! 추천~',4,11,3);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('건대 돈까스는 카토카츠만 먹어요. 촉촉하고 맛있어요!',5,35,3);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('건대 근본 밥집. 고등어구이 맛있어요',4,25,3);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('알밥, 모밀, 카츠 세가지 다 먹을 수 있어서 좋아요',4,58,3);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('고기 양도 많고 괜찮아요',3,48,3);
INSERT INTO reviews(comment,stars,menu_id,user_id) VALUES ('다른 메뉴도 궁금해서 재방문했는데 마제소바도 맛있어요',4,13,3);

INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-04',55,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-05',36,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-07',67,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-07',59,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-10',24,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-13',35,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-14',14,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-14',75,1);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-17',40,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-10',5,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-12',45,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-13',23,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-13',5,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-15',51,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-16',66,2);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-11',11,3);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-13',35,3);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-14',25,3);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-16',58,3);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-17',48,3);
INSERT INTO transactions(date,menu_id,user_id) VALUES ('2023-11-17',13,3);

