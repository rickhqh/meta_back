#源jar路径
SOURCE_PATH=/usr/local/meta
#docker 镜像/容器名字或者jar名字 这里都命名为这个
SERVER_NAME=meta.jar
TAG=latest
SERVER_PORT=8080
#容器id
CID=$(docker ps | grep "$SERVER_NAME" | awk '{print $1}')
#镜像id
IID=$(docker images | grep "$SERVER_NAME:$TAG" | awk '{print $3}')
if [ -n "$CID" ]; then
  echo "存在容器$SERVER_NAME, CID-$CID"
  docker stop $SERVER_NAME
  docker rm $SERVER_NAME
fi
# 构建docker镜像
if [ -n "$IID" ]; then
  echo "存在$SERVER_NAME:$TAG镜像，IID=$IID"
  docker rmi $SERVER_NAME:$TAG
else
  echo "不存在$SERVER_NAME:$TAG镜像，开始构建镜像"
  cd $SOURCE_PATH
  docker build -t $SERVER_NAME:$TAG .
fi
# 运行docker容器
docker run  -d -v /usr/local/meta/:/usr/local/meta/ -p 7071:$SERVER_PORT --name $SERVER_NAME  $SERVER_NAME:$TAG
echo "$SERVER_NAME容器创建完成"
