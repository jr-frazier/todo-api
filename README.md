docker --version

docker run -d -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=tododb --name mysqldb -p 3307:3306 mysql:8.0