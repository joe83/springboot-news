
cd ..

cd news-server-dependencies
call mvn clean install
cd ..

cd news-server-commons
call mvn clean install
cd ..

cd news-server-domain
call mvn clean install
cd ..

cd news-server-service-admin-api
call mvn clean install
cd ..

cd news-server-service-admin
call mvn clean install
cd ..

cd news-server-web-admin
call mvn clean install
cd ..
