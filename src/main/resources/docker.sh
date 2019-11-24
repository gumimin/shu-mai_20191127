docker container run --rm -d \
  -e MYSQL_ROOT_PASSWORD=pass \
  -p 3306:3306 --name mysql mysql:5.7
